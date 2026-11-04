public class Equipe {

    private String nome;
    private Personagem[] membros;
    private int quantidade;

    public Equipe(String nome, int capacidade) {
        if (capacidade<=0){
            return;
        }
        this.nome = nome;
        this.membros = new Personagem[capacidade];
        this.quantidade = 0;
    }

    public boolean adicionar(Personagem personagem){
        if (this.getQuantidade() >= this.getMembros().length || !personagem.estaVivo() || contem(personagem)){
            return false;
        }
        this.membros[this.getQuantidade()] = personagem;
        quantidade++;
        return true;
    }

    public boolean contem(Personagem personagem){
        for (Personagem pers : this.getMembros()){
            if(personagem==pers){
                return true;
            }
        }
        return false;
    }

    public boolean contem() {
        if (this.getQuantidade() > 0) {
            return true;
        }
        return false;
    }

    public boolean temVivo(){
        for (Personagem pers : this.getMembros()){
            if (pers.estaVivo()){
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public Personagem[] getMembros() {
        return membros;
    }

    public int getQuantidade() {
        return quantidade;
    }
}