public class AlunoBolsista extends Aluno {

    private double bolsa;

    public AlunoBolsista(String nome, int idade, char sexo, int matricula, String curso, double bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.printf("Bolsa de %s renovada com sucesso!%n", this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.printf("%s é bolsista! Mensalidade com desconto paga com sucesso.%n", this.getNome());
    }
}