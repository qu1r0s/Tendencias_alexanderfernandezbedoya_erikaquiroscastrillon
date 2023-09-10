/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClubMax;

import java.util.Date;

public class Factura {
    private Date Fecha;
    private String Concepto;
    private String Nombre;
    private double Valor;
    private String Cedula;

    public Factura(Date Fecha, String Concepto, String Nombre, double Valor, String Cedula) {
        this.Fecha = Fecha;
        this.Concepto = Concepto;
        this.Nombre = Nombre;
        this.Valor = Valor;
        this.Cedula = Cedula;
    }
    
    
    
}
