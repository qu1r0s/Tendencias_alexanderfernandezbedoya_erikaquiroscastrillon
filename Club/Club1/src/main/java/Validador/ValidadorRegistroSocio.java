package Validador;

import ClubMax.Club;
import ConexionDB.Conexion;
import javax.swing.JOptionPane;

public class ValidadorRegistroSocio extends Conexion {

    private Club Club;
// Constructor

    public ValidadorRegistroSocio(Club Club) {
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

    public void validadorRegistroSocio(String Nombre, String Cedula, String TipoSuscrip) {
        if (TipoSuscrip.equals("") || TipoSuscrip.equals(null)) {
            JOptionPane.showMessageDialog(null, "Seleccione el Tipo");
            return;
        }
        if (Nombre.equals("") || Nombre.equals(null)) {
            JOptionPane.showMessageDialog(null, "el nombre no puede ser vacio");
            return;
        }
        if (Cedula.equals("") || Cedula.equals(null)) {
            JOptionPane.showMessageDialog(null, "la Cedula no puede ser vacio");
            return;
        }
        long CedulaEntero;
        try {
            CedulaEntero = Long.parseLong(Cedula);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "la Cedula debe ser numerica");
            return;
        }

        try {
            Club.RegistrarSocio(CedulaEntero, Nombre,TipoSuscrip,this.getConexion());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR INESPERADO");
            for (StackTraceElement stack : e.getStackTrace()) {
                System.out.println(stack.toString());
            }
        } finally {
            try {
                this.getConexion().close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Fallo Cerrando Conexion");
                for (StackTraceElement stack : ex.getStackTrace()) {
                    System.out.println(stack.toString());
                }
            }

        }
    }

    public void validarEliminacionSocio(String Cedula) {
        if (Cedula.equals(null) || Cedula.equals("")) {
            JOptionPane.showMessageDialog(null, "la cedula no puede ser vacio");
            return;
        }
        int CedulaEntero;
        try {
            CedulaEntero = Integer.parseInt(Cedula);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "la cedula debe ser numerica");
            return;
        }
        try {
            Club.eliminarSocio(CedulaEntero);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error inesperado");
        }
    }
}
