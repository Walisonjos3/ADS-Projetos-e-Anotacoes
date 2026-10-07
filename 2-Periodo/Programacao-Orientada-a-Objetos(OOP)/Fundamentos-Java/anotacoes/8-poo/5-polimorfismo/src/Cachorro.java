public class Cachorro extends Lobo {

    public Cachorro(double peso, int idade, int quantidadeMembros, String corPelo) {
        super(peso, idade, quantidadeMembros, corPelo);
    }

    // Assinatura 1: String
    public void reagir(String frase) {
        if (frase.equals("Vem comer") || frase.equals("Vamos passear")) {
            System.out.println("Abanar rabo e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    // Assinatura 2: int (hora do dia)
    public void reagir(int hora) {
        if (hora < 12) {
            System.out.println("Abanar rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar rabo e latir");
        }
    }

    // Assinatura 3: boolean (dono)
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar rabo e latir");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    // Assinatura 4: int e double (idade e peso)
    public void reagir(int idade, double peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}