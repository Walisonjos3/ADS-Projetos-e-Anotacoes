public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, char sexo, int matricula, String curso) {
        super(nome, idade, sexo); // Invocação do construtor da superclasse (Pessoa)
        this.matricula = matricula;
        this.curso = curso;
    }

    public void pagarMensalidade() {
        System.out.printf("Mensalidade do aluno %s paga com sucesso!%n", this.getNome());
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }
}