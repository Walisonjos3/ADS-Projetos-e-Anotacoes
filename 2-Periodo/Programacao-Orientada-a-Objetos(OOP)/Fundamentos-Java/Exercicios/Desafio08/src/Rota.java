public class Rota {

    private double distanciaKm;
    private double pedagio;

    public Rota(double distancia, double pedagio) {
        this.setDistancia(distancia);
        this.setPedagio(pedagio);
    }

    public double custoBase() {
        if (this.getDistancia() == 0) {
            return 0;
        }
        return this.getDistancia() * 1 + this.getPedagio();
    }

    public double getDistancia() {
        return this.distanciaKm;
    }

    private void setDistancia(double distancia) {
        if (distancia < 0) {
            return;
        }
        this.distanciaKm = distancia;
    }

    public double getPedagio() {
        return this.pedagio;
    }

    private void setPedagio(double pedagio) {
        if (pedagio < 0) {
            return;
        }
        this.pedagio = pedagio;
    }
}