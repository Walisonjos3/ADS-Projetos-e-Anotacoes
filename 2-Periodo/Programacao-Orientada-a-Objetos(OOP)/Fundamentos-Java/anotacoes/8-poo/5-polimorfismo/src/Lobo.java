public class Lobo extends Mamifero {

    public Lobo(double peso, int idade, int quantidadeMembros, String corPelo) {
        super(peso, idade, quantidadeMembros, corPelo);
    }

    @Override
    public void emitirSom() {
        System.out.println("Aaauuuuuuuuuuuu");
    }

    public void cacarComida() {
        System.out.println("Caçar");
    }
}