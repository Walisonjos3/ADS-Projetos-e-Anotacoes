public class Main {

    public static void main(String[] args) {

        System.out.println("=== POLIMORFISMO DE SOBREPOSIÇÃO (OVERRIDE) ===");

        Mamifero m = new Mamifero(85.5, 2, 4, "Marrom");
        Reptil r = new Reptil(0.25, 1, 0, "Verde");
        Peixe p = new Peixe(0.35, 1, 0, "Cinza");
        Ave a = new Ave(0.89, 2, 2, "Vermelho");

        Canguru canguru = new Canguru(55.3, 3, 2, "Castanho");
        Cachorro cachorro = new Cachorro(3.94, 5, 4, "Preto");
        Cobra cobra = new Cobra(0.5, 1, 0, "Verde");
        Arara arara = new Arara(1.2, 4, 2, "Azul");

        // Executando métodos com comportamentos específicos de cada subclasse
        m.locomover();       // Andando
        canguru.locomover(); // Pulando (Sobrescrito)
        p.locomover();       // Nadando
        r.locomover();       // Rastejando
        a.locomover();       // Voando

        System.out.println("\n=== POLIMORFISMO DE SOBRECARGA (OVERLOAD) ===");

        Lobo lobo = new Lobo(35.0, 4, 4, "Cinzento");
        lobo.emitirSom(); // Auuuuuuuuuuuuuuu

        // Testando as diferentes assinaturas do método reagir() na classe Cachorro
        System.out.println("\n-- Reagir a frases --");
        cachorro.reagir("Olá");           // Rosnar
        cachorro.reagir("Vem comer");     // Abanar rabo e latir

        System.out.println("\n-- Reagir ao horário --");
        cachorro.reagir(11);              // Abanar rabo
        cachorro.reagir(21);              // Ignorar

        System.out.println("\n-- Reagir ao dono --");
        cachorro.reagir(true);            // Abanar rabo e latir
        cachorro.reagir(false);           // Rosnar e latir

        System.out.println("\n-- Reagir a idade e peso --");
        cachorro.reagir(2, 12.5);         // Latir
        cachorro.reagir(17, 4.5);         // Rosnar
    }
}