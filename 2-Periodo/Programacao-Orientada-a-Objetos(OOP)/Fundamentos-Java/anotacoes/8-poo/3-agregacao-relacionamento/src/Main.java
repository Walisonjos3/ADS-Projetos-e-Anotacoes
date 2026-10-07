public class Main {

    public static void main(String[] args) {
        // Criando o vetor de lutadores
        Lutador l[] = new Lutador[4];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);

        // Instanciando a Luta (Agregação entre Luta e Lutador)
        Luta UEC01 = new Luta();

        // Tentativa de marcar luta entre lutadores da mesma categoria (Leve)
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();

        System.out.println("\n--- Segunda Luta ---");
        // Tentativa de marcar luta entre lutadores de categorias diferentes (Peso Médio vs Peso Pesado)
        Luta UEC02 = new Luta();
        UEC02.marcarLuta(l[1], l[2]);
        UEC02.lutar();
    }
}