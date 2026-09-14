public class Main {

    public static void main(String[] args) {
        Mario mario = new Mario("Matheus");

        Inimigo inimigo1 = new Inimigo("GOOMBA", 100);
        Inimigo inimigo2 = new Inimigo("KOOPA", 50);

        Moeda moeda1 = new Moeda(1);
        Moeda moeda2 = new Moeda(5);

        Fase fase1 = new Fase("Fase 1", 200);

        inimigo1.serPisado(mario);
        moeda1.coletar(mario);
        moeda2.coletar(mario);
        fase1.concluir(mario);
        mario.exibirStatus();
        fase1.exibirDados();
        inimigo2.serPisado(mario);
        fase1.concluir(mario);
        mario.exibirStatus();
        fase1.exibirDados();
    }
}
