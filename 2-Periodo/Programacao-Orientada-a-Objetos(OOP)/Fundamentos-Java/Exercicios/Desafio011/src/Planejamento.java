public class Planejamento {

    private double duracaoMinutos;
    private double taxaProdutos;

    public Planejamento(double duracaoMinutos, double taxaProdutos) {
        this.setDuracaoMinutos(duracaoMinutos);
        this.setTaxaProdutos(taxaProdutos);
    }

    public double custoBase() {
        if (this.getDuracaoMinutos() <= 0) {
            return 0;
        }
        return this.getDuracaoMinutos() * 1 + this.getTaxaProdutos();
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    private void setDuracaoMinutos(double duracaoMinutos) {
        if (duracaoMinutos < 0) {
            return;
        }
        this.duracaoMinutos = duracaoMinutos;
    }

    public double getTaxaProdutos() {
        return taxaProdutos;
    }

    public void setTaxaProdutos(double taxaProdutos) {
        if (taxaProdutos < 0) {
            return;
        }
        this.taxaProdutos = taxaProdutos;
    }
}