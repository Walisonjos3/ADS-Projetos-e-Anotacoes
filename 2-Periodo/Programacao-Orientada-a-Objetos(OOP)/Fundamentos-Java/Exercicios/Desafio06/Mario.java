public class Mario {

    public String nome;
    public int vidas;
    public int moedas;
    public int pontos;

    public Mario(String nome) {
        this.nome = nome;
        this.vidas = 3;
        this.moedas = 0;
        this.pontos = 0;
    }

    public void pular() {
        if (this.vidas > 0) {
            System.out.println("*Som de pulo do Mario*");
        }
    }

    public void receberDano() {
        if (this.vidas > 0) {
            this.vidas -= 1;
        } else {
            System.out.println("Está morto.");
        }
    }

    public void exibirStatus() {
        System.out.println("  << Mostrando Mario  >>");
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Vidas: %d%n", this.vidas);
        System.out.printf("Moedas: %d%n", this.moedas);
        System.out.printf("Pontos: %d%n", this.pontos);
    }
}
