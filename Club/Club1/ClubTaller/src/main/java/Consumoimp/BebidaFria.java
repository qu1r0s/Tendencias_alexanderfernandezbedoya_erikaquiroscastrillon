/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumoimp;

public class BebidaFria extends Bebida {
    private boolean alcoholica;

    public BebidaFria(boolean alcoholica, String tamaño, String nombreconsumo, double precioconsumo) {
        super(tamaño,  nombreconsumo, precioconsumo);
        this.alcoholica = alcoholica;
    }

    public boolean isAlcoholica() {
        return alcoholica;
    }

    public void setAlcoholica(boolean alcoholica) {
        this.alcoholica = alcoholica;
    }
    
    
}
