public class Entrega {

    private Encomenda encomenda;
    private Rota rota;
    private boolean concluida;

    public Entrega(Encomenda encomenda, Rota rota) {
        this.encomenda = encomenda;
        this.rota = rota;
        this.concluida = false;
    }

    public double calcularFrete() {
        if (this.getRota().getDistancia() == 0) {
            return 0;
        }
        return this.getRota().custoBase() + this.getEncomenda().getPesoKg() * 2;
    }

    public String gerarDescricao() {
        return this.getEncomenda().descrever() + "Distancia: " + this.getRota().getDistancia() + "\nSituação: " + this.isConcluida();
    }

    public Rota getRota() {
        return this.rota;
    }

    public Encomenda getEncomenda() {
        return this.encomenda;
    }

    public boolean isConcluida() {
        return this.concluida;
    }
}
