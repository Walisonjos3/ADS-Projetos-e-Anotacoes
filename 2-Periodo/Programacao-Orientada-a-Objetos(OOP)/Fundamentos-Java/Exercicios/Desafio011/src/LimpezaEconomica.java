public class LimpezaEconomica extends Limpeza {

    private int prazoDias;
    private String unidadeAtendimento;

    public LimpezaEconomica(Ambiente ambiente, Planejamento planejamento, int prazoDias, String unidadeAtendimento) {
        super(ambiente, planejamento);
        this.setPrazoDias(prazoDias);
        this.unidadeAtendimento = unidadeAtendimento;
    }

    @Override
    public double calcularPreco() {
        if (this.getPlanejamento().getDuracaoMinutos() > 0) {
            if (this.getAmbiente().getAreaMetros() >= 10) {
                double valor = super.calcularPreco() + 0.20 * this.getPlanejamento().getDuracaoMinutos();
                valor -= valor * 0.10;
                return valor;
            }
            return super.calcularPreco() + 0.20 * this.getPlanejamento().getDuracaoMinutos();
        }
        return 0;
    }

    @Override
    public String gerarDescricao() {
        return super.gerarDescricao() + "\nPrazo dias: " + this.getPrazoDias() + "\nUnidade: " + this.getUnidadeAtendimento();
    }

    public int getPrazoDias() {
        return prazoDias;
    }

    private void setPrazoDias(int prazoDias) {
        if (prazoDias <= 0) {
            return;
        }
        this.prazoDias = prazoDias;
    }

    public String getUnidadeAtendimento() {
        return unidadeAtendimento;
    }
}