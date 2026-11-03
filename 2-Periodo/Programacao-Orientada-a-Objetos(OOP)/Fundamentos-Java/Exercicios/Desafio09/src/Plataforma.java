public class Plataforma {

    private Assinatura[] assinaturas;
    private int quantidade;

    public Plataforma(int capacidade) {
        if (capacidade > 0) {
            this.assinaturas = new Assinatura[capacidade];
            this.quantidade = 0;
        }
    }

    public boolean cadastrar(Assinatura assinatura) {
        if (this.getQuantidade() >= this.getAssinaturas().length || this.contem(assinatura)) {
            return false;
        }
        this.assinaturas[this.getQuantidade()] = assinatura;
        this.quantidade++;
        return true;
    }

    public Fatura[] gerarFaturas(int meses) {
        if (meses <= 0) {
            return new Fatura[0];
        }

        int faturasAtivas = 0;

        for (int i = 0; i < this.getQuantidade(); i++) {
            if (this.getAssinaturas()[i].isAtiva()) {
                faturasAtivas++;
            }
        }

        Fatura[] faturas = new Fatura[faturasAtivas];
        int indice = 0;

        for (int i = 0; i < this.getQuantidade(); i++) {
            if (this.getAssinaturas()[i].isAtiva()) {
                faturas[indice] = new Fatura(this.getAssinaturas()[i], meses);
                indice++;
            }
        }

        return faturas;
    }

    public boolean contem(Assinatura assinatura) {
        for (Assinatura planoAssinatura : this.getAssinaturas() ) {
            if (assinatura == planoAssinatura) {
                return true;
            }
        }

        return false;
    }

    public Assinatura[] getAssinaturas() {
        return assinaturas;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
