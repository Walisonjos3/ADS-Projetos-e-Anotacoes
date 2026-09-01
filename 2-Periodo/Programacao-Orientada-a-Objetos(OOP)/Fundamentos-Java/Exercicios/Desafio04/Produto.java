public class Produto {

    private  String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public void valorTotalEstoque() {
        System.out.printf("Valor total em estoque: R$ %.2f", this.getPreco() * this.getQuantidade());
    }

    public void aplicarDesconto(double desconto) {
        this.preco -= desconto;
    }

    public void mostrarDados() {
        System.out.println("\n  <<  Mostrando Produto  >>");
        System.out.printf("Nome do produto: %s%n", this.getNome());
        System.out.printf("Preço do produto: R$ %.2f%n", this.getPreco());
        System.out.printf("Quantidade em estoque: %d%n", this.getQuantidade());
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
