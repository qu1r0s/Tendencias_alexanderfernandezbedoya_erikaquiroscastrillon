
package Consumoimp;


public class PlatoMixto extends PlatoFuerte {

    private String salsas;

    public PlatoMixto(String salsas, String mixto, String bebida, String ingredientes, String nombreconsumo, double precioconsumo) {
        super(mixto, bebida, ingredientes, nombreconsumo, precioconsumo);
        this.salsas = salsas;
    }

    public String getSalsas() {
        return salsas;
    }

    public void setSalsas (String salsas) {
        this.salsas = salsas;
    }


}
