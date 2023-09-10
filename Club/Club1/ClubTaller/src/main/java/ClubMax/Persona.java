
package ClubMax;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int cedula;
    private ArrayList<Factura> Facturas;

    public Persona(String nombre,int cedula ) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.Facturas = new ArrayList<Factura>();
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Factura> getFacturas() {
        return Facturas;
    }

    public void setFacturas(ArrayList<Factura> Facturas) {
        this.Facturas = Facturas;
    }
    
}
