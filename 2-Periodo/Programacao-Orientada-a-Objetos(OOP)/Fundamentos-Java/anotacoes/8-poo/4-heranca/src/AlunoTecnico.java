public class AlunoTecnico extends Aluno {

    private String registroProfissional;

    public AlunoTecnico(String nome, int idade, char sexo, int matricula, String curso, String registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.printf("O aluno técnico %s está praticando suas habilidades!%n", this.getNome());
    }

    public String getRegistroProfissional() {
        return this.registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}