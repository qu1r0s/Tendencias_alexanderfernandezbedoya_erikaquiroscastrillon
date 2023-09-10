/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumoimp;

public class BebidaNoAlcoholica extends Bebida{
    private int gramajeAzucar;

    public BebidaNoAlcoholica(int gramajeAzucar, String tamaño, String nombreconsumo, double precioconsumo) {
        super(tamaño, nombreconsumo, precioconsumo);
        this.gramajeAzucar = gramajeAzucar;
    }
    public int getGramajeAzucar() {
        return gramajeAzucar;
    }
    public void setGramajeAzucar(int gramajeAzucar) {
        this.gramajeAzucar = gramajeAzucar;
    }
}
