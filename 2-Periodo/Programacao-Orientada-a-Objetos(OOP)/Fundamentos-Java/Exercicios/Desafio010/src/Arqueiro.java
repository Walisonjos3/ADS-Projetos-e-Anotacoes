public class Arqueiro extends Personagem {

    private int precisao;
    private int flechas;

    public Arqueiro(String nome, int vida, int forca, Arma arma, int flechas, int precisao) {
        super(nome, vida, forca, arma);
        this.setFlechas(flechas);
        this.setPrecisao(precisao);
    }

    @Override
    public int calcularDano() {
        if(this.getFlechas() > 0){
            return super.calcularDano() + this.getPrecisao();
        }
        return super.calcularDano();
    }

    @Override
    public boolean atacarAlvo(Personagem alvo) {
        boolean sucesso = super.atacarAlvo(alvo);
        if (sucesso && this.getFlechas() > 0) {
            this.flechas--;
        }
        return sucesso;
    }

    public int getPrecisao() {
        return precisao;
    }

    private void setPrecisao(int precisao) {
        if (precisao < 0) {
            return;
        }
        this.precisao = precisao;
    }

    public int getFlechas() {
        return flechas;
    }

    private void setFlechas(int flechas) {
        if (flechas <= 0) {
            return;
        }
        this.flechas = flechas;
    }
}