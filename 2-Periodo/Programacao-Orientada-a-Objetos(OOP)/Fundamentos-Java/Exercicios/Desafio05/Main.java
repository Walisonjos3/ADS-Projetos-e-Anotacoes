public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Caneca", 100, 5);
        Cliente cliente1 = new Cliente("Walison", "705.342.231-09", 0);

        produto1.mostrarDados();
        produto1.retirarEstoque(2);
        produto1.mostrarDados();
        produto1.temEstoque(2);

        cliente1.mostrarCliente();
        cliente1.adicionarSaldo(50);
        cliente1.mostrarCliente();
        cliente1.descontarSaldo(10);
        cliente1.mostrarCliente();
        cliente1.temSaldo(50);
    }

}
