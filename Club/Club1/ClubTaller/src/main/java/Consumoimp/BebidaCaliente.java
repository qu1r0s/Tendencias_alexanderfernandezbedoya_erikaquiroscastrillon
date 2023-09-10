package Consumoimp;


public class BebidaCaliente extends Bebida {
    String adicion; 

    public BebidaCaliente(String adicion, String tamaño, String nombreconsumo, double precioconsumo) {
        super(tamaño, nombreconsumo, precioconsumo);
        this.adicion = adicion;
    }

    public String getAdicion() {
        return adicion;
    }

    public void setAdicion(String adicion) {
        this.adicion = adicion;
    }
    
    
}
