public class Moeda {

    public int valor;
    public boolean coletada;

    public Moeda(int valor) {
        this.valor = valor;
        this.coletada = false;
    }

    public boolean coletar(Mario mario) {
        if (this.coletada || mario.vidas <= 0) {
            return false;
        } else {
            mario.moedas += valor;
            mario.pontos += valor * 10;
            this.coletada = true;
            return true;
        }
    }

    public void exibirStatus() {
        System.out.println("  << Mostrando Moeda  >>");
        System.out.printf("Valor: %d%n", this.valor);
        System.out.printf("Coletada: %b%n", this.coletada);
    }
}
