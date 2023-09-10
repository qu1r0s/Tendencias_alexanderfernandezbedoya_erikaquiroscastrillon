
package Consumoimp;

import java.util.ArrayList;

public class Entrada extends Plato {
    public boolean porcionUnica;
    public boolean opcionSalsa;

    public Entrada(boolean porcionUnica, boolean opcionSalsa, String ingredientes, String nombreconsumo, double precioconsumo) {
        super(ingredientes, nombreconsumo, precioconsumo);
        this.porcionUnica = porcionUnica;
        this.opcionSalsa = opcionSalsa;
    }


    public boolean isPorcionUnica() {
        return porcionUnica;
    }

    public void setPorcionUnica(boolean porcionUnica) {
        this.porcionUnica = porcionUnica;
    }

    public boolean isOpcionSalsa() {
        return opcionSalsa;
    }

    public void setOpcionSalsa(boolean opcionSalsa) {
        this.opcionSalsa = opcionSalsa;
    }
    
    
    
}
