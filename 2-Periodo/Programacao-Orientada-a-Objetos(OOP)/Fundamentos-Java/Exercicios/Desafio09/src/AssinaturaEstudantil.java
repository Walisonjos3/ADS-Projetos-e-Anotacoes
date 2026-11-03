public class AssinaturaEstudantil extends Assinatura {

    private double desconto;

    public AssinaturaEstudantil(Cliente cliente, String nomePlano, double valorMensalidade, double desconto) {
        super(cliente, nomePlano, valorMensalidade);
        this.desconto = desconto;
    }

    @Override
    public double calcularCusto(int meses) {
        double valor = super.calcularCusto(meses);
        return valor = valor * this.getDesconto();
    }

    public double getDesconto() {
        return desconto;
    }

    private void setDesconto(double desconto) {
        if (desconto < 0 || desconto > 100) {
            return;
        }
        this.desconto = desconto / 100;
    }
}
