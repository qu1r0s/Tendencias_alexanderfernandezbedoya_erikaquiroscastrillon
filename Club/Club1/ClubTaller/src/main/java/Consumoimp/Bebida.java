
package Consumoimp;

import ClubMax.Consumo;


public abstract class Bebida extends Consumo {
    private String tamaño;

    public Bebida(String tamaño,String nombreconsumo, double precioconsumo) {
        super(nombreconsumo, precioconsumo);
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
