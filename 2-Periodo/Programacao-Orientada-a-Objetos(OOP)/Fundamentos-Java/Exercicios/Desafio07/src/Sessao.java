public class Sessao {

    public Filme filme;
    public int numeroSala;
    public String horarioExibicao;
    public double precoIngresso;
    public int capacidadeMaxima;
    public int lugaresDisponiveis;

    public Sessao(Filme filme, int numeroSala, String horarioExibicao, double precoIngresso, int capacidadeMaxima) {
        this.filme = filme;
        this.numeroSala = numeroSala;
        this.horarioExibicao = horarioExibicao;
        this.precoIngresso = precoIngresso;
        this.capacidadeMaxima = capacidadeMaxima;
        this.lugaresDisponiveis = capacidadeMaxima; // Todos começam disponíveis
    }

    public boolean existemVagas() {
        return this.lugaresDisponiveis > 0;
    }

    public boolean ocuparLugar() {
        if (existemVagas()) {
            this.lugaresDisponiveis--;
            return true;
        }
        return false;
    }
}