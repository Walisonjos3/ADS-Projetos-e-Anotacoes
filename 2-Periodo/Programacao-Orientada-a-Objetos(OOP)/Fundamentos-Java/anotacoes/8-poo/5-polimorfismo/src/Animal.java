public abstract class Animal {

    protected double peso;
    protected int idade;
    protected int quantidadeMembros;

    public Animal(double peso, int idade, int quantidadeMembros) {
        this.peso = peso;
        this.idade = idade;
        this.quantidadeMembros = quantidadeMembros;
    }

    // Métodos abstratos obrigatoriamente sobrescritos pelas subclasses
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}