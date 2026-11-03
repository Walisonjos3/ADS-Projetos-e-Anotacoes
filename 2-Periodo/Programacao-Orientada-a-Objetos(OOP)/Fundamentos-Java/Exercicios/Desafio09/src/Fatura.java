public class Fatura {

    private Assinatura assinatura;
    private int meses;
    private double total;
    private boolean paga;

    public Fatura(Assinatura assinatura, int meses) {
        this.assinatura = assinatura;
        this.setMeses(meses);
        this.total = assinatura.calcularCusto(meses);
        this.paga = false;
    }

    public boolean pagar() {
        if (this.isPaga() || this.total <= 0) {
            return false;
        }
        this.paga = true;
        return true;
    }

    public String resumoFatura() {
        return this.assinatura.getCliente().identificar() + "\nPlano: " + this.assinatura.getNomePlano() + "\nMeses: " + this.getMeses() + "\nValor total: " + this.getTotal() + "\nSituação: " + this.isPaga() + "\n";
    }

    public Assinatura getAssinatura() {
        return assinatura;
    }

    public int getMeses() {
        return meses;
    }

    private void setMeses(int meses) {
        if (meses <= 0) {
            return;
        }
        this.meses = meses;
    }

    public double getTotal() {
        return total;
    }

    public boolean isPaga() {
        return paga;
    }
}
