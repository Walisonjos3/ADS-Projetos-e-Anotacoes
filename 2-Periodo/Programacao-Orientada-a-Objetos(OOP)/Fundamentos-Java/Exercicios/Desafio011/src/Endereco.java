public class Endereco {

    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.setNumero(numero);
        this.cidade = cidade;
    }

    public String formatar() {
        return "Cidade: " + this.getCidade() + "\nRua: " + this.getRua() + "\nNúmero: " + this.getNumero();
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    private void setNumero(int numero) {
        if (numero < 0) {
            return;
        }
        this.numero = numero;
    }
}