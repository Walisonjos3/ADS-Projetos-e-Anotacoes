public class Guardiao extends Personagem {

    private int armadura;

    public Guardiao(String nome, int vida, int forca, Arma arma, int armadura) {
        super(nome, vida, forca, arma);
        this.setArmadura(armadura);
    }

    @Override
    public void receberDano(int dano) {
        if (dano > this.getArmadura()) {
            super.receberDano(dano - this.getArmadura());
        }
        super.receberDano(0);
    }

    public int getArmadura() {
        return armadura;
    }

    private void setArmadura(int armadura) {
        if (armadura >= 0) {
            this.armadura = armadura;
        }
    }
}
