public class CanetaEncapsulada {

    private String modelo;
    private String cor;
    private double ponta;
    private boolean tampada;

    // MÉTODO CONSTRUTOR: Executado automaticamente no ato de instanciar o objeto (new)
    public CanetaEncapsulada(String m, String c, double p) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar(); // Chama o método para iniciar como tampada
    }

    // MÉTODOS GETTERS E SETTERS (Accessors e Mutators)
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void mostrarCaneta() {
        System.out.printf("<<< SOBRE A CANETA %s >>>%n", this.getModelo());
        System.out.printf("Modelo: %s%n", this.getModelo());
        System.out.printf("Ponta: %.1f%n", this.getPonta());
        System.out.printf("Cor: %s%n", this.cor);
        System.out.printf("Tampada: %b%n", this.tampada);
    }
}