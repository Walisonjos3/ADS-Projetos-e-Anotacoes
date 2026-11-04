public class Mago extends Personagem {

    private int poderMagico;
    private int mana;

    public Mago(String nome, int vida, int forca, Arma arma, int poderMagico, int mana) {
        super(nome, vida, forca, arma);
        this.setPoderMagico(poderMagico);
        this.setMana(mana);
    }

    @Override
    public int calcularDano() {
        if (this.getMana() >= 10) {
            return super.calcularDano() + this.getPoderMagico();
        }
        return super.calcularDano();
    }

    @Override
    public boolean atacarAlvo(Personagem alvo) {
        boolean sucesso = super.atacarAlvo(alvo);
        if (sucesso && this.getMana() >= 10) {
            this.mana -= 10;
        }
        return sucesso;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    private void setPoderMagico(int poderMagico) {
        if (poderMagico >= 0) {
            this.poderMagico = poderMagico;
        }
    }

    public int getMana() {
        return mana;
    }

    private void setMana(int mana) {
        if (mana >= 0) {
            this.mana = mana;
        }
    }
}
