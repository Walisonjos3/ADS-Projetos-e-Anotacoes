public class Canguru extends Mamifero {

    public Canguru(double peso, int idade, int quantidadeMembros, String corPelo) {
        super(peso, idade, quantidadeMembros, corPelo);
    }

    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
}