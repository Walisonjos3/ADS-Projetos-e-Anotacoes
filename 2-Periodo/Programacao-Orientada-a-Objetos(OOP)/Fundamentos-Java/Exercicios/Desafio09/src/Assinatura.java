public abstract class Assinatura {

    private Cliente cliente;
    private String nomePlano;
    private double valorMensalidade;
    private boolean ativa;

    public Assinatura(Cliente cliente, String nomePlano, double valorMensalidade) {
        this.cliente = cliente;
        this.nomePlano = nomePlano;
        this.setValorMensalidade(valorMensalidade);
        this.ativa = true;
    }

    public double calcularCusto(int meses) {
        if (meses > 0 && this.isAtiva()) {
            return this.getValorMensalidade() * meses;
        }
        return 0;
    }

    public void cancelar() {
        if (this.isAtiva()) {
            this.ativa = false;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    private void setValorMensalidade(double valorMensalidade) {
        if (valorMensalidade <= 0) {
            return;
        }
        this.valorMensalidade = valorMensalidade;
    }

    public boolean isAtiva() {
        return ativa;
    }
}
