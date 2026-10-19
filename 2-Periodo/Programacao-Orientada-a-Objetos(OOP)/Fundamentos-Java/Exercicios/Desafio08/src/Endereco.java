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
        return "  Endereço\nCidade: " + this.getCidade() + "\nRua: " + this.getRua() + "\nNúmero: " + this.getNumero() + "\n";
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumero() {
        return this.numero;
    }

    private void setNumero(int numero) {
        if (numero < 0) {
            return;
        }

        this.numero = numero;
    }

    public String getCidade() {
        return this.cidade;
    }
}
