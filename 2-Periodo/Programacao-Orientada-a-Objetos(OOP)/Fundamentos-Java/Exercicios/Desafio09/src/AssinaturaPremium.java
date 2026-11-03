public class AssinaturaPremium extends Assinatura {

    private double taxaConteudoExclusivo;

    public AssinaturaPremium(Cliente cliente, String nomePlano, double valorMensalidade, double taxa) {
        super(cliente, nomePlano, valorMensalidade);
        this.setTaxaConteudoExclusivo(taxa);
    }

    @Override
    public double calcularCusto(int meses) {
        return super.calcularCusto(meses) + (this.getTaxaConteudoExclusivo() * meses);
    }

    public double getTaxaConteudoExclusivo() {
        return taxaConteudoExclusivo;
    }

    private void setTaxaConteudoExclusivo(double taxaConteudoExclusivo) {
        if (taxaConteudoExclusivo < 0) {
            return;
        }
        this.taxaConteudoExclusivo = taxaConteudoExclusivo;
    }
}
