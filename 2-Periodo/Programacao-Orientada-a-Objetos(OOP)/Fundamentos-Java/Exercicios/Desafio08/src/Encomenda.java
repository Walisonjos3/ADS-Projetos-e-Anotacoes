public class Encomenda {

    private int codigo;
    private double pesoKg;
    private Endereco destino;

    public Encomenda(int codigo, double pesoKg, Endereco destino) {
        this.setCodigo(codigo);
        this.setPesoKg(pesoKg);
        this.destino = destino;
    }

    public String descrever() {
        return this.destino.formatar() + "Código: " + this.getCodigo() + "\nPeso: " + this.getPesoKg() + "\n";
    }

    public double getPesoKg() {
        return this.pesoKg;
    }

    private void setPesoKg(double pesoKg) {
        if (pesoKg < 0) {
            return;
        }
        this.pesoKg = pesoKg;
    }

    public int getCodigo() {
        return this.codigo;
    }

    private void setCodigo(int codigo) {
        if (codigo < 0) {
            return;
        }
        this.codigo = codigo;
    }

    public Endereco getDestino() {
        return this.destino;
    }
}
