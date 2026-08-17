import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.print("Qual curso você faz: ");
        String curso = input.next();
        System.out.print("Qual sua 1 nota: ");
        int nota1 = input.nextInt();
        System.out.print("Qual sua 2 nota: ");
        int nota2 = input.nextInt();

        double media = (double) (nota1 + nota2) / 2;

        System.out.println("   <<<  ALUNO  >>>");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Curso: %s%n", curso);
        System.out.printf("Nota 1: %d%n", nota1);
        System.out.printf("Nota 2: %d%n", nota2);
        System.out.printf("Média: %.1f%n", media);
        System.out.println("==========================");
    }
}
