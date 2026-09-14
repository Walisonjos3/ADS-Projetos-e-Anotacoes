public class Inimigo {

    public String tipo;
    public int pontosRecompensa;
    public boolean derrotado;

    public Inimigo(String tipo, int pontosRecompensa) {
        this.tipo = tipo;
        this.pontosRecompensa = pontosRecompensa;
        this.derrotado = false;
    }

    public void atacar(Mario mario) {
        if (!this.derrotado) {
            mario.receberDano();
        }
    }

    public boolean serPisado(Mario mario) {
        if (!this.derrotado && mario.vidas > 0) {
            mario.pontos += pontosRecompensa;
            this.derrotado = true;
            return true;
        } else {
            return false;
        }
    }

    public void exibirStatus() {
        System.out.println("  << Mostrando Inimigo  >>");
        System.out.printf("Tipo: %s%n", this.tipo);
        System.out.printf("Pontos de Recompensa: %d%n", this.pontosRecompensa);
        System.out.printf("Derrotado: %b%n", this.derrotado);
    }
}
