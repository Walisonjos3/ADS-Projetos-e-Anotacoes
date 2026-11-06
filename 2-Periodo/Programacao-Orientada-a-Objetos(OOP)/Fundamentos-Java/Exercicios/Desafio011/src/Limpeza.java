public abstract class Limpeza {

    private Ambiente ambiente;
    private Planejamento planejamento;
    private boolean concluida;

    public Limpeza(Ambiente ambiente, Planejamento planejamento) {
        this.ambiente = ambiente;
        this.planejamento = planejamento;
        this.concluida = false;
    }

    public double calcularPreco() {
        if (this.getPlanejamento().getDuracaoMinutos() <= 0) {
            return 0;
        }
        return this.getPlanejamento().custoBase() + 2 * this.getAmbiente().getAreaMetros();
    }

    public String gerarDescricao() {
        return this.getAmbiente().descrever() + "\nDuração: " + this.getPlanejamento().getDuracaoMinutos();
    }

    public boolean concluir() {
        if (this.isConcluida()) {
            return false;
        }
        this.concluida = true;
        return true;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public Planejamento getPlanejamento() {
        return planejamento;
    }

    public boolean isConcluida() {
        return concluida;
    }
}