public class EntregaEconomica extends Entrega {

    private int prazoDias;
    private String centroDistribuicao;

    public EntregaEconomica(Encomenda encomenda, Rota rota, int prazoDias, String centroDistribuicao) {
        super(encomenda, rota);
        this.setPrazoDias(prazoDias);
        this.centroDistribuicao = centroDistribuicao;
    }

    @Override
    public double calcularFrete() {
        if (this.getRota().getDistancia() == 0) {
            return 0;
        } else if (this.getEncomenda().getPesoKg() >= 10) {
            return super.calcularFrete() + ((0.20 * this.getRota().getDistancia()) * 0.90);
        }
        return super.calcularFrete() + (0.20 * this.getRota().getDistancia());
    }

    @Override
    public String gerarDescricao() {
        return super.gerarDescricao() + "Prazo de Dias: " + this.getPrazoDias() + "\nCentro de Distribuição: " + this.getCentroDistribuicao() + "\n";
    }

    public String getCentroDistribuicao() {
        return this.centroDistribuicao;
    }

    public int getPrazoDias() {
        return this.prazoDias;
    }

    private void setPrazoDias(int prazoDias) {
        if (prazoDias < 0) {
            return;
        }
        this.prazoDias = prazoDias;
    }
}