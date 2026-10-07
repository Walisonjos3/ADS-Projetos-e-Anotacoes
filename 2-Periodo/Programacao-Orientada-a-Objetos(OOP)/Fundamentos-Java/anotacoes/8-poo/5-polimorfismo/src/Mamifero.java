public class Mamifero extends Animal {

    private String corPelo;

    public Mamifero(double peso, int idade, int quantidadeMembros, String corPelo) {
        super(peso, idade, quantidadeMembros);
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}