public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Caneca", 15.00, 5);
        Produto produto2 = new Produto("Tênis", 120.00, 4);

        produto1.mostrarDados();
        produto1.aplicarDesconto(5);
        produto1.mostrarDados();

        produto2.mostrarDados();


    }

}
