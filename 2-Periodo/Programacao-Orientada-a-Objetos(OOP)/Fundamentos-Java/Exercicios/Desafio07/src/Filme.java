public class Filme {

    public String titulo;
    public String genero;
    public int duracaoMinutos;
    public int idadeMinimaPermitida;

    public Filme(String titulo, String genero, int duracaoMinutos, int idadeMinimaPermitida) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
        this.idadeMinimaPermitida = idadeMinimaPermitida;
    }

    public void apresentarDados() {
        System.out.println("<< Dados do Filme >>");
        System.out.printf("Título: %s | Gênero: %s | Duração: %d min | Classificação: %d anos%n",
                this.titulo, this.genero, this.duracaoMinutos, this.idadeMinimaPermitida);
    }

    public boolean verificarIdade(int idadePessoa) {
        return idadePessoa >= this.idadeMinimaPermitida;
    }
}