public class EntregaEconomica extends Entrega {

    private int prazoHoras;
    private String centroDistribuicao;

    public EntregaEconomica(Encomenda encomenda, Rota rota, int prazoHoras, String centroDistribuicao) {
        super(encomenda, rota);
        this.setPrazoHoras(prazoHoras);
        this.centroDistribuicao = centroDistribuicao;
    }

    @Override
    public double calcularFrete() {
        if (this.getRota().getDistancia() == 0) {
            return 0;
        } else if (this.getEncomenda().getPesoKg() >= 10) {
            return (super.calcularFrete() + (0.20 * this.getRota().getDistancia()) * 0.10);
        }
        return super.calcularFrete() + (0.20 * this.getRota().getDistancia());
    }

    @Override
    public String gerarDescricao() {
        return super.gerarDescricao() + "\nPrazo de Horas: " +this.getPrazoHoras() + "\nCentro de Distribuição: " + this.getCentroDistribuicao();
    }

    public String getCentroDistribuicao() {
        return this.centroDistribuicao;
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
