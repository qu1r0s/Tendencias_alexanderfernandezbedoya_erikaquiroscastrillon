package Consumoimp;

import ClubMax.Consumo;
import java.util.ArrayList;

public abstract class Plato extends Consumo {

    private String ingredientes;

    public Plato(String ingredientes, String nombreconsumo, double precioconsumo) {
        super(nombreconsumo, precioconsumo);
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


}
