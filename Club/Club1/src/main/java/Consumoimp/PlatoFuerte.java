package Consumoimp;

import java.util.ArrayList;

public class PlatoFuerte extends Plato {

    private String mixto;
    private String bebida;

    public PlatoFuerte(String mixto, String bebida,String ingredientes, String nombreconsumo, double precioconsumo) {
        super(ingredientes, nombreconsumo, precioconsumo);
        this.mixto = mixto;
        this.bebida = bebida;
    }

    public String getMixto() {
        return mixto;
    }

    public void setMixto(String mixto) {
        this.mixto = mixto;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

}
