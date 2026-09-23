public class Cliente {

    public String nome;
    public int idade;
    public double saldo;

    public Cliente(String nome, int idade, double saldoInicial) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = Math.max(saldoInicial, 0);
    }

    public void acrescentarDinheiro(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Saldo de R$ %.2f adicionado com sucesso.%n", valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public boolean descontarPagamento(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}