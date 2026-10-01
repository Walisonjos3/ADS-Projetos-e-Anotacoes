import java.util.Scanner;

public class EntradaSaida {

    public static void main(String[] args) {
        // Instanciação da classe Scanner para leitura do teclado
        Scanner input = new Scanner(System.in);

        // --- SAÍDA DE DADOS ---
        System.out.print("Texto sem quebra de linha. ");
        System.out.println("Texto com quebra de linha ao final.");

        // Saída Formatada (%s: String, %d: int, %.2f: float/double com 2 casas, %b: boolean, %c: char, %n: quebra de linha)
        String nome = "Walison";
        int idade = 19;
        double peso = 80.2;
        System.out.printf("Nome: %s | Idade: %d | Peso: %.1fKg%n", nome, idade, peso);

        // --- ENTRADA DE DADOS ---
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = input.nextLine(); // Leitura de texto com espaços

        System.out.print("Digite sua idade: ");
        int idadeUser = input.nextInt(); // Leitura de número inteiro

        System.out.print("Digite seu peso: ");
        double pesoUser = input.nextDouble(); // Leitura de número real

        // LIMPEZA DE BUFFER:
        // Após ler valores numéricos (nextInt, nextDouble) e antes de ler uma String com nextLine(),
        // é necessário consumir o '\n' pendente no buffer de entrada.
        input.nextLine();

        // Fechamento do Scanner (Boa prática de gerenciamento de memória)
        input.close();
    }
}