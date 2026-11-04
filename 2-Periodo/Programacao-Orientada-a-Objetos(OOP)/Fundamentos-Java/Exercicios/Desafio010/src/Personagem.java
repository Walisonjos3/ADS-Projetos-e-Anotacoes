public abstract class Personagem {

    private String nome;
    private int vida;
    private int forca;
    private Arma arma;

    public Personagem(String nome, int vida, int forca, Arma arma) {
        this.nome = nome;
        this.setVida(vida);
        this.setForca(forca);
        this.arma = arma;
    }

    public int calcularDano() {
        return this.getForca() + arma.bonusAtivo();
    }

    public void receberDano(int dano) {
        if (dano > 0 && this.getVida() > 0) {
            if (this.getVida() < dano) {
                this.vida = 0;
            }
            this.vida -= dano;
        }
    }

    public boolean estaVivo() {
        if (this.getVida() > 0) {
            return true;
        }
        return false;
    }

    public boolean atacarAlvo(Personagem alvo) {
        if (alvo.estaVivo() && !(this == alvo)) {
            alvo.receberDano(this.calcularDano());
            this.getArma().usar();
            return true;
        }

        return false;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    private void setVida(int vida) {
        if (vida <= 0) {
            return;
        }
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    private void setForca(int forca) {
        if (forca <= 0) {
            return;
        }
        this.forca = forca;
    }

    public Arma getArma() {
        return arma;
    }
}
