public class Cliente {
    private String nome;
    private String cpf;
    private double saldo;

    public Cliente(String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.setSaldo(saldo);
    }

    public void temSaldo(double saldo) {
        if (saldo > this.getSaldo()) {
            System.out.println("\nSaldo insuficiente.");
        } else {
            System.out.println("\nTem essa saldo.");
        }
    }

    public void descontarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("\nValor inválido.");
        } else {
            if (this.getSaldo() < valor) {
                System.out.println("\nSaldo insuficiente.");
            } else {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("\nSaldo descontado.");
            }
        }
    }

    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("\nValor inválido.");
        } else {
            this.setSaldo(valor);
            System.out.println("\nSaldo adicionado.");
        }
    }

    public void mostrarCliente() {
        System.out.println("\n  <<  Mostrando cliente  >>");
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("CPF: %s%n", this.getCpf());
        System.out.printf("Saldo: R$ %.2f%n", this.getSaldo());
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        if (saldo <= 0) {
            System.out.println("Saldo inválido!");
        } else {
            this.saldo = saldo;
        }
    }
}
