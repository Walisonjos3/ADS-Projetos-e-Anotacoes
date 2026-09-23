public class Ingresso {

    public Cliente cliente;
    public Sessao sessao;
    public double valorPago;
    public boolean compraConfirmada;

    public Ingresso(Cliente cliente, Sessao sessao) {
        this.cliente = cliente;
        this.sessao = sessao;
        this.valorPago = 0.0;
        this.compraConfirmada = false;
    }

    public boolean confirmarCompra() {
        if (!this.compraConfirmada &&
                this.sessao.filme.verificarIdade(this.cliente.idade) &&
                this.sessao.existemVagas() &&
                this.cliente.saldo >= this.sessao.precoIngresso) {

            if (this.cliente.descontarPagamento(this.sessao.precoIngresso)) {
                this.sessao.ocuparLugar();
                this.valorPago = this.sessao.precoIngresso;
                this.compraConfirmada = true;
                System.out.println("Compra concluída com sucesso!");
                return true;
            }
        }

        System.out.println("Falha ao confirmar compra: condições não atendidas.");
        return false;
    }

    public void mostrarComprovante() {
        if (this.compraConfirmada) {
            System.out.println("\n===== COMPROVANTE DE INGRESSO =====");
            System.out.printf("Cliente: %s%n", this.cliente.nome);
            System.out.printf("Filme: %s%n", this.sessao.filme.titulo);
            System.out.printf("Sala: %d | Horário: %s%n", this.sessao.numeroSala, this.sessao.horarioExibicao);
            System.out.printf("Valor Pago: R$ %.2f%n", this.valorPago);
            System.out.println("===================================\n");
        } else {
            System.out.println("Comprovante indisponível. Compra não confirmada.");
        }
    }
}