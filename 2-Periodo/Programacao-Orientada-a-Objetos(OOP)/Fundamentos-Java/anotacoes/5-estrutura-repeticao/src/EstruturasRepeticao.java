public class EstruturasRepeticao {

    public static void main(String[] args) {

        // --- ESTRUTURA WHILE ---
        int contador1 = 1;
        while (contador1 <= 4) {
            System.out.printf("Pulei %d%n", contador1);
            contador1++;
        }

        // --- WHILE COM CONTINUE (Pula a iteração atual) ---
        int contador2 = 1;
        while (contador2 <= 10) {
            if (contador2 == 5 || contador2 == 7) {
                contador2++;
                continue; // Pula o restante do bloco e volta para o teste condicional
            }
            System.out.printf("Número %d%n", contador2);
            contador2++;
        }

        // --- WHILE COM BREAK (Interrompe o laço) ---
        int contador3 = 1;
        while (contador3 <= 10) {
            if (contador3 == 6) {
                break; // Interrompe o laço de repetição imediatamente
            }
            System.out.printf("Ganhei %d%n", contador3);
            contador3++;
        }

        // --- ESTRUTURA DO-WHILE (Garante a execução de pelo menos 1 vez) ---
        int somador = 0;
        do {
            System.out.printf("Somador = %d%n", somador);
            somador++;
        } while (somador < 5);

        // --- ESTRUTURA FOR (Repetição com variável de controle) ---
        // Crescente:
        for (int c = 0; c <= 5; c++) {
            System.out.printf("Crescente = %d%n", c);
        }

        // Decrescente de 2 em 2:
        for (int c = 10; c >= 0; c -= 2) {
            System.out.printf("Decrescente = %d%n", c);
        }
    }
}