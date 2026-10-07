public class Peixe extends Animal {

    private String corEscama;

    public Peixe(double peso, int idade, int quantidadeMembros, String corEscama) {
        super(peso, idade, quantidadeMembros);
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void soltarBolhas() {
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return this.corEscama;
    }
}