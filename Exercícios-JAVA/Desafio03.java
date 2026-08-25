import java.util.Scanner;

public class Main {

    public static double maiorMedia(double[] medias) {
        double maiorMedia = medias[0];

        for (double media: medias) {
            if (media > maiorMedia) {
                maiorMedia = media;
            }
        }

        return maiorMedia;
    }

    public static double[] mediaNotas(double[][] notas) {
        double[] medias = new double[5];
        int indice = 0;

        for (double[] linhaAtual: notas) {
            double soma = 0;

            for (double notaIndividual: linhaAtual) {
                soma += notaIndividual;
            }
            medias[indice] = soma / linhaAtual.length;
            indice++;
        }

        return medias;
    }

    public static double mediaGeral(double[][] notas) {
        double soma = 0;
        int totalNotas = 0;

        for (double[] linhaAtual: notas) {
            for (double notaIndividual: linhaAtual) {
                soma += notaIndividual;
                totalNotas++;
            }
        }

        return soma / totalNotas;
    }


    public static String[] situacaoAluno(double[] medias) {
        String[] situacao = new String[5];
        int indice = 0;

        for (double media: medias) {
            if (media >= 7 && media <= 10) {
                situacao[indice] = "Aprovado!";
            } else if (media >= 5) {
                situacao[indice] = "Recuperação";
            } else {
                situacao[indice] = "Reprovado";
            }

            indice++;
        }

        return situacao;
    }

    public static void mostrarRelatorio(double[] medias, double maiorMedia, String[] situacaoAlunos, double mediaGeral) {
        System.out.println("==========================================");
        System.out.println("            RELATÓRIO DA TURMA           ");
        System.out.println("==========================================");

        for (int i = 0; i < 5; i++) {
            System.out.printf("  << ALUNO %d >>%n", (i + 1));
            System.out.printf("Média: %.1f%n", medias[i]);
            System.out.printf("Situação: %s%n", situacaoAlunos[i]);
        }

        System.out.println("------------------------------------------");
        System.out.printf("Média Geral da Turma: %.1f%n", mediaGeral);
        System.out.printf("Maior Média:          %.1f%n", maiorMedia);
        System.out.println("==========================================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] notas = new double[5][3];

        for (int linha = 0; linha < notas.length; linha++) {
            for (int coluna = 0; coluna < notas[linha].length; coluna++) {
                System.out.print("Digite a nota: ");
                notas[linha][coluna] = input.nextDouble();
            }
        }

        double[] medias = mediaNotas(notas);
        double maiorMedia = maiorMedia(medias);
        String[] situacaoAlunos = situacaoAluno(medias);
        double mediaGeral = mediaGeral(notas);

        mostrarRelatorio(medias, maiorMedia, situacaoAlunos, mediaGeral);

        input.close();
    }
}
