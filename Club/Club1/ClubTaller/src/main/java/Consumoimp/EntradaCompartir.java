/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumoimp;


public class EntradaCompartir extends Entrada {

    public EntradaCompartir(boolean porcionUnica, boolean opcionSalsa, String ingredientes, String nombreconsumo, double precioconsumo) {
        super(porcionUnica, opcionSalsa, ingredientes, nombreconsumo, precioconsumo);
        this.porcionUnica = porcionUnica;
        this.opcionSalsa = opcionSalsa;
    }
    
}
