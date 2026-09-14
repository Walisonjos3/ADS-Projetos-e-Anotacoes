public class Fase {

    public String nome;
    public int pontosMinimos;
    public boolean concluido;

    public Fase(String nome, int pontosMinimos) {
        this.nome = nome;
        this.pontosMinimos = pontosMinimos;
        this.concluido = false;
    }

    public boolean podeConcluir(Mario mario) {
        if (mario.vidas > 0 && mario.pontos >= this.pontosMinimos) {
            return true;
        }

        return false;
    }

    public boolean concluir(Mario mario) {
        if (this.podeConcluir(mario)){
            this.concluido = true;
            System.out.println("Fase concluída! Parabéns.");
            return true;
        }
        System.out.println("Pontos insuficientes para concluir.");
        return false;
    }

    public void exibirDados() {
        System.out.println("  << Mostrando Fase  >>");
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Pontos mínimos: %d%n", this.pontosMinimos);
        System.out.printf("Concluído: %b%n", this.concluido);
    }
}
