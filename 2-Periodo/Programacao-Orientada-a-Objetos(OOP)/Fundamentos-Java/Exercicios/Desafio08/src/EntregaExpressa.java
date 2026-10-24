public class EntregaExpressa extends Entrega {

    private int prazoHoras;
    private String nomeEntregador;

    public EntregaExpressa(Encomenda encomenda, Rota rota, int prazoHoras, String nomeEntregador) {
        super(encomenda, rota);
        this.setPrazoHoras(prazoHoras);
        this.nomeEntregador = nomeEntregador;
    }

    @Override
    public double calcularFrete() {
        if (this.getRota().getDistancia() == 0) {
            return 0;
        } else if (this.getPrazoHoras() <= 6) {
            return super.calcularFrete() + 10 + (1.50 * this.getRota().getDistancia());
        }
        return super.calcularFrete() + (1.50 * this.getRota().getDistancia());
    }

    @Override
    public String gerarDescricao() {
        return super.gerarDescricao() + "Prazo de Horas: " + this.getPrazoHoras() + "\nEntregador: " + this.getNomeEntregador() + "\n";
    }

    public String getNomeEntregador() {
        return this.nomeEntregador;
    }

    public int getPrazoHoras() {
        return this.prazoHoras;
    }

    private void setPrazoHoras(int prazoHoras) {
        if (prazoHoras < 0) {
            return;
        }
        this.prazoHoras = prazoHoras;
    }
}