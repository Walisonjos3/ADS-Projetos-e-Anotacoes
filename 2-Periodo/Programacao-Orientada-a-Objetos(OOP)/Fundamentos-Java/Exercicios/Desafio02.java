import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tipo do animal: ");
        String input1 = input.nextLine();
        System.out.print("Digite a espécie do animal: ");
        String input2 = input.nextLine();
        System.out.print("tipo da comida: ");
        String input3 = input.nextLine();

        if (input1.equalsIgnoreCase("Vertebrado")){
            if (input2.equalsIgnoreCase("Ave")) {
                if (input3.equalsIgnoreCase("Carnivoro")) {
                    System.out.println("Águia");
                } else if (input3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("Pomba");
                } else {
                    System.out.println("Erro");
                }
            } else if (input2.equalsIgnoreCase("Mamifero")) {
                if (input3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("Homem");
                } else if (input3.equalsIgnoreCase("Herbivoro")) {
                    System.out.println("Vaca");
                } else {
                    System.out.println("Erro");
                }
            }
        } else if (input1.equalsIgnoreCase("Invertebrado")) {
            if (input2.equalsIgnoreCase("Inseto")) {
                if (input3.equalsIgnoreCase("Hematofago")) {
                    System.out.println("Pulga");
                } else if (input3.equalsIgnoreCase("Herbivoro")) {
                    System.out.println("Lagarta");
                } else {
                    System.out.println("Erro");
                }
            } else if (input2.equalsIgnoreCase("anelideo")) {
                if (input3.equalsIgnoreCase("Hematofago")) {
                    System.out.println("Sanguessuga");
                } else if (input3.equalsIgnoreCase("Onivoro")) {
                    System.out.println("Minhoca");
                } else {
                    System.out.println("Erro");
                }
            }
        }
    }
}
