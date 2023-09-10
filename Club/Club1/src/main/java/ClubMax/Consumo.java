package ClubMax;

public abstract class Consumo {

    protected String nombreconsumo;
    protected double precioconsumo;

    public Consumo(String nombreconsumo, double precioconsumo) {
        this.nombreconsumo = nombreconsumo;
        this.precioconsumo = precioconsumo;
    }

    public String getNombreconsumo() {
        return nombreconsumo;
    }

    public void setNombreconsumo(String nombreconsumo) {
        this.nombreconsumo = nombreconsumo;
    }

    public double getPrecioconsumo() {
        return precioconsumo;
    }

    public void setPrecioconsumo(double precioconsumo) {
        this.precioconsumo = precioconsumo;
    }

 /*   public abstract String generarFactura();*/
}
