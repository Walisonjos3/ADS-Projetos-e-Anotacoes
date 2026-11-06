public class CentralLimpeza {

    private Limpeza[] limpezas;
    private int quantidade;

    public CentralLimpeza(int capacidade) {
        if (capacidade <= 0) {
            return;
        }
        this.limpezas = new Limpeza[capacidade];
        this.quantidade = 0;
    }

    public boolean adicionar(Limpeza limpeza) {
        if (this.getQuantidade() >= this.getLimpezas().length || this.verificarCodigo(limpeza)) {
            return false;
        }
        this.limpezas[quantidade] = limpeza;
        quantidade++;
        return true;
    }

    public double totalPendentes() {
        double valorTotal = 0;
        for (Limpeza limpeza : this.getLimpezas()) {
            if (limpeza != null && !(limpeza.isConcluida())) {
                valorTotal += limpeza.calcularPreco();
            }
        }
        return valorTotal;
    }

    public boolean finalizar(int codigo) {
        for (Limpeza limpeza : this.getLimpezas()) {
            if (limpeza != null && limpeza.getAmbiente().getCodigo() == codigo) {
                return limpeza.concluir();
            }
        }
        return false;
    }

    public boolean verificarCodigo(Limpeza limpeza) {
        for (Limpeza limpeza1 : this.getLimpezas()) {
            if (limpeza != null && limpeza1 != null && limpeza.getAmbiente().getCodigo() == limpeza1.getAmbiente().getCodigo()) {
                return true;
            }
        }
        return false;
    }

    public Limpeza[] getLimpezas() {
        return limpezas;
    }

    public int getQuantidade() {
        return quantidade;
    }
}