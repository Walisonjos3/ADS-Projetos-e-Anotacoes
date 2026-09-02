public class Produto {

    private  String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public void valorTotalEstoque() {
        System.out.println("====================================================");
        System.out.printf("Valor total em estoque de %s: R$ %.2f%n",this.getNome(), this.getPreco() * this.getQuantidade());
        System.out.println("====================================================");
    }

    public void aplicarDesconto(double desconto) {
        if (this.preco <= 0){
            System.out.println("\nPreço insuficiente para desconto");
        } else {
            double valorDesconto = this.preco * (desconto / 100);
            this.preco -= valorDesconto;
            System.out.printf("R$ %.2f de desconto aplicado!", desconto);
        }
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

    private void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido!");
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    private void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida!");
        } else {
            this.quantidade = quantidade;
        }
    }
}
