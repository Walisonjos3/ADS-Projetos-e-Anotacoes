public class Guerreiro extends Personagem {

    private int bonusEspada;

    public Guerreiro(String nome, int vida, int forca, Arma arma, int bonusEspada) {
        super(nome, vida, forca, arma);
        this.setBonusEspada(bonusEspada);
    }

    @Override
    public int calcularDano() {
        return super.calcularDano() + this.getBonusEspada();
    }

    public int getBonusEspada() {
        return bonusEspada;
    }

    private void setBonusEspada(int bonusEspada) {
        if (bonusEspada >= 0) {
            this.bonusEspada = bonusEspada;
        }
    }
}
