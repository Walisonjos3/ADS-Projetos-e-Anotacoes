import java.util.Arrays;

public class VetoresEArrays {

    public static void main(String[] args) {

        // --- DECLARAÇÃO E INICIALIZAÇÃO ---
        int n[] = new int[4]; // Aloca memória para 4 posições (índices 0 a 3)
        n[0] = 3;
        n[1] = 4;
        n[2] = 8;
        n[3] = 9;

        // Sintaxe simplificada com atribuição direta:
        int numeros[] = {5, 4, 9, 1, 3, 10};

        // --- PERCURSO DE VETOR (FOR TRADICIONAL) ---
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Na posição %d temos o valor %d%n", i, numeros[i]);
        }

        // --- PERCURSO DE VETOR (FOR EACH / FOR ENHANCED) ---
        // Lê-se: "Para cada 'valor' presente dentro do array 'numeros'"
        for (int valor : numeros) {
            System.out.println("Valor: " + valor);
        }

        // --- MÉTODOS ÚTEIS DA CLASSE java.util.Arrays ---

        // 1. Ordenação do vetor em ordem crescente:
        Arrays.sort(numeros);

        // 2. Busca Binária (O vetor DEVE estar ordenado antes da busca):
        int posicao = Arrays.binarySearch(numeros, 9);
        System.out.printf("O valor 9 foi encontrado na posição %d%n", posicao);

        // Se o valor não existir no vetor, retorna um valor negativo indicando onde deveria estar
        int posicaoInexistente = Arrays.binarySearch(numeros, 99);
        System.out.println("Busca por valor inexistente: " + posicaoInexistente);

        // 3. Preenchimento automático de vetor:
        int valor1[] = new int[5];
        Arrays.fill(valor1, 0); // Preenche todas as posições com o valor 0
    }
}