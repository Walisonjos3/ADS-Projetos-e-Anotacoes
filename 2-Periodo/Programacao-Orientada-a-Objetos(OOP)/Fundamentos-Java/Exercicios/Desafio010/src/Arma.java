public class Arma {

    private String nome;
    private int bonusDano;
    private int durabilidade;

    public Arma(String nome, int bonusDano, int durabilidade) {
        this.nome = nome;
        this.setBonusDano(bonusDano);
        this.setDurabilidade(durabilidade);
    }

    public int bonusAtivo() {
        if (this.getDurabilidade() > 0) {
            return this.getBonusDano();
        }

        return 0;
    }

    public void usar() {
        if (this.getDurabilidade() > 0) {
            this.durabilidade--;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getBonusDano() {
        return bonusDano;
    }

    private void setBonusDano(int bonusDano) {
        if (bonusDano < 0) {
            return;
        }
        this.bonusDano = bonusDano;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        if (durabilidade < 0) {
            return;
        }
        this.durabilidade = durabilidade;
    }
}
