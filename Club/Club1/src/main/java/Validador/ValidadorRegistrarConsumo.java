package Validador;

import ClubMax.Club;
import javax.swing.JOptionPane;

public class ValidadorRegistrarConsumo {

    private Club club;

    // constructor
    public ValidadorRegistrarConsumo(Club club) {
        this.club = club;
    }
// Get and Set

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public void validarBedida(String cedula, int tipoBebida, int tipoBebidaFria, int detalle) {
       int cedulaNumerica;
        try {
            cedulaNumerica = Integer.parseInt(cedula);
        } catch (Exception e) {
            return;
        }
        try {
            club.registrarConsumoBebida(cedulaNumerica,tipoBebida,tipoBebidaFria,detalle);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void validarPlato(String cedula, int entradas, int tipoplato, int detalle, int platoFuerte,int postre ) {
       int cedulaNumerica;
        try {
            cedulaNumerica = Integer.parseInt(cedula);
        } catch (Exception e) {
            return;
        }
        try {
            club.registrarConsumoPlato(cedulaNumerica, entradas, tipoplato, detalle, platoFuerte,postre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
