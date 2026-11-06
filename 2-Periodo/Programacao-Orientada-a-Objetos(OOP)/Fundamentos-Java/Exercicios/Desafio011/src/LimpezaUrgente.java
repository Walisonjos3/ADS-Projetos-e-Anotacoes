public class LimpezaUrgente extends Limpeza {

    private int prazoInicioHoras;
    private String nomeProfissional;

    public LimpezaUrgente(Ambiente ambiente, Planejamento planejamento, int prazoInicioHoras, String nomeProfissional) {
        super(ambiente, planejamento);
        this.setPrazoInicioHoras(prazoInicioHoras);
        this.nomeProfissional = nomeProfissional;
    }

    @Override
    public double calcularPreco() {
        if (this.getPlanejamento().getDuracaoMinutos() > 0) {
            if (this.getPrazoInicioHoras() <= 6) {
                return super.calcularPreco() + 1.5 * this.getPlanejamento().getDuracaoMinutos() + 10;
            }
            return super.calcularPreco() + 1.5 * this.getPlanejamento().getDuracaoMinutos();
        }
        return 0;
    }

    @Override
    public String gerarDescricao() {
        return super.gerarDescricao() + "\nPrazo para início: " + this.getPrazoInicioHoras() + "\nProfissional: " + this.getNomeProfissional();
    }

    public int getPrazoInicioHoras() {
        return prazoInicioHoras;
    }

    private void setPrazoInicioHoras(int prazoInicioHoras) {
        if (prazoInicioHoras < 0) {
            return;
        }
        this.prazoInicioHoras = prazoInicioHoras;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }
}