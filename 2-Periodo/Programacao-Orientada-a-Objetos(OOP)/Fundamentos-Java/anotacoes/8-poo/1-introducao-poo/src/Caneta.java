public class Caneta {

    // Atributos (Características)
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    // Métodos (Comportamentos)
    void status() {
        // 'this' é a referência ao próprio objeto que executou o método
        System.out.printf("Modelo: %s%n", this.modelo);
        System.out.printf("Cor: %s%n", this.cor);
        System.out.printf("Ponta: %.1f%n", this.ponta);
        System.out.printf("Carga: %d%%%n", this.carga);
        System.out.printf("Tampada: %b%n", this.tampada);
    }

    void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO: Não posso rabiscar, a caneta está tampada!");
        } else {
            System.out.println("Estou rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}