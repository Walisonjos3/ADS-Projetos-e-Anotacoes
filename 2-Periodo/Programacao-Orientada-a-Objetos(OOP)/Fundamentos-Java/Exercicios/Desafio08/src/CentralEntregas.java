public class CentralEntregas {

    private Entrega[] entregas;
    private int quantidade;

    public CentralEntregas(int capacidade) {
        this.entregas = new Entrega[capacidade];
        this.quantidade = 0;
    }

    public boolean adicionar(Entrega entrega) {
        if (this.getQuantidade() < this.getEntregas().length) {
            this.entregas[this.getQuantidade()] = entrega;
            this.quantidade++;
            return true;
        }
        return false;
    }

    public double totalPendentes() {
        double total = 0;
        for (int i = 0; i < this.getQuantidade(); i++) {
            if (!this.getEntregas()[i].isConcluida()) {
                total += this.getEntregas()[i].calcularFrete();
            }
        }
        return total;
    }

    public boolean finalizar(int codigo) {
        for (int i = 0; i < this.getQuantidade(); i++) {
            if (this.getEntregas()[i].getEncomenda().getCodigo() == codigo) {
                return this.getEntregas()[i].concluirEntrega();
            }
        }
        return false;
    }

    public Entrega[] getEntregas() {
        return entregas;
    }

    public int getQuantidade() {
        return quantidade;
    }
}