
package Consumoimp;

import java.util.ArrayList;


public class PlatoVegano extends PlatoFuerte{
    private String adicciones;

    public PlatoVegano(String adicciones, String mixto, String bebida, String ingredientes, String nombreconsumo, double precioconsumo) {
        super(mixto, bebida, ingredientes, nombreconsumo, precioconsumo);
        this.adicciones = adicciones;
    }

    public String getAdicciones() {
        return adicciones;
    }

    public void setAdicciones(String adicciones) {
        this.adicciones = adicciones;
    }
    
    
    
}
