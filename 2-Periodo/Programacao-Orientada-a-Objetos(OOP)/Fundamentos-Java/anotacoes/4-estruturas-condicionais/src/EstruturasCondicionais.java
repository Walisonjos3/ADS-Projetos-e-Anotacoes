import java.util.Scanner;

public class EstruturasCondicionais {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- IF / ELSE SIMPLES E COMPOSTO ---
        System.out.print("Nota 1: ");
        float n1 = input.nextFloat();
        System.out.print("Nota 2: ");
        float n2 = input.nextFloat();
        float media = (n1 + n2) / 2;

        System.out.printf("Média = %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Parabéns, aprovado!!");
        } else {
            System.out.println("Estude mais, reprovado!!");
        }

        // --- IF / ELSE IF / ELSE (ENCADEADO) ---
        System.out.print("\nDigite sua idade para verificação de voto: ");
        int idade = input.nextInt();

        if (idade < 16) {
            System.out.println("NÃO VOTA!");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("VOTO OPCIONAL!");
        } else {
            System.out.println("VOTO OBRIGATÓRIO!");
        }

        // --- ESTRUTURA SWITCH-CASE ---
        System.out.print("\nQuantas pernas? ");
        int perna = input.nextInt();
        String tipo;

        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8: // Agrupamento de cases suportado nas versões modernas do Java
                tipo = "Aranha / Inseto";
                break;
            default:
                tipo = "ET";
                break;
        }

        System.out.println("Classificação: " + tipo);
        input.close();
    }
}