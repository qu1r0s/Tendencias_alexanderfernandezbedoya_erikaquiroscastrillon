package Validador;

import ClubMax.Club;
import java.sql.Connection;
import javax.swing.JOptionPane;
import ConexionDB.Conexion;

public class ValidadorRegistrarPersona extends Conexion {

    private Club Club;

    // constructor
    public ValidadorRegistrarPersona(Club Club) {
        super();
        this.Club = Club;
        this.establecerConeccion();
    }
// Get and Set

    public Club getClub() {
        return Club;
    }

    public void setClub(Club Club) {
        this.Club = Club;
    }

    public void validarRegistroPersona(String Cedula, String nombre, String cedula) {
        if (Cedula.equals(null) || Cedula.equals("")) {
            JOptionPane.showMessageDialog(null, "Nesecitas la Cedula del Socio");
            return;
        }
        int CedulaNumerica;
        try {
            CedulaNumerica = Integer.parseInt(Cedula);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "la cedula debe ser numerica");
            return;
        }
        if (nombre.equals(null) || nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "el nombre no puede ser vacio");
            return;
        }
        if (cedula.equals(null) || cedula.equals("")) {
            JOptionPane.showMessageDialog(null, "la cedula no puede ser vacio");
            return;
        }
        if (cedula.equals(Cedula)) {
            JOptionPane.showMessageDialog(null, "La cedula ya esta registrada como VIP");
            return;
        }

        int cedulaNumerica;
        try {
            cedulaNumerica = Integer.parseInt(cedula);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "la cedula debe ser numerica");
            return;
        }
        try {
            Club.registrarPersona(CedulaNumerica, nombre, cedulaNumerica, this.getConexion());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error inesperado");
            for (StackTraceElement stack : e.getStackTrace()) {
                System.out.println(stack.toString());
            }
        } finally {
            try {
                this.getConexion().close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "fallo cerrando conexion");
                for (StackTraceElement stack : ex.getStackTrace()) {
                    System.out.println(stack.toString());
                }
            }
        }
    }
}
