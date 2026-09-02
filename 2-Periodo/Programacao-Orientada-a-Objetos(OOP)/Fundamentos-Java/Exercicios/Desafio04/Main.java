public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Caneca", 100, 5);
        Produto produto2 = new Produto("Tênis", 120.00, 4);

        produto1.mostrarDados();
        produto1.aplicarDesconto(5);
        produto1.mostrarDados();
        produto1.valorTotalEstoque();

        produto2.mostrarDados();
        produto2.valorTotalEstoque();
    }

}
