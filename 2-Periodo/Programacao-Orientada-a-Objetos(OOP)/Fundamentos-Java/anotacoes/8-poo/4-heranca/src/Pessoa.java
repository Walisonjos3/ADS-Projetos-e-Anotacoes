public abstract class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Método final: não pode ser sobrescrito por nenhuma subclasse
    public final void fazerAniversario() {
        this.idade++;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public char getSexo() {
        return this.sexo;
    }
}