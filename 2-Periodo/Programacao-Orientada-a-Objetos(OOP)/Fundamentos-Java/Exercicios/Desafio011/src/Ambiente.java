public class Ambiente {

    private int codigo;
    private double areaMetros;
    private Endereco local;

    public Ambiente(int codigo, double areaMetros, Endereco local) {
        this.setCodigo(codigo);
        this.setAreaMetros(areaMetros);
        this.local = local;
    }

    public String descrever() {
        return this.getLocal().formatar() + "\nCódigo: " + this.getCodigo() + "\nÁrea metros: " + this.getAreaMetros();
    }

    public int getCodigo() {
        return codigo;
    }

    private void setCodigo(int codigo) {
        if (codigo < 0) {
            return;
        }
        this.codigo = codigo;
    }

    public double getAreaMetros() {
        return areaMetros;
    }

    private void setAreaMetros(double areaMetros) {
        if (areaMetros <= 0) {
            return;
        }
        this.areaMetros = areaMetros;
    }

    public Endereco getLocal() {
        return local;
    }
}