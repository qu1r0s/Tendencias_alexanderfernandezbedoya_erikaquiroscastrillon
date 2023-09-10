package Validador;

import ClubMax.Club;
import javax.swing.JOptionPane;

public class ValidadorAumentarFondo {

    private Club Club;

    // constructores para inicializar Club
    public ValidadorAumentarFondo(Club Club) {
        this.Club = Club;
    }

    public Club getClub() {
        return Club;
    }

    public void setClub(Club Club) {
        this.Club = Club;
    }

    public void ValidarDatosAumento(String Cedula, String CantidadAumentar) {
        if (Cedula.equals(null) || Cedula.equals("")) {
            JOptionPane.showMessageDialog(null, "Nesecitas la Cedula del Socio");
            return;
        }
          if (CantidadAumentar.equals(null) || CantidadAumentar.equals("")) {
            JOptionPane.showMessageDialog(null, "la cantidad no puede ser vacio");
            return;
        }
          int CedulaNumerica;
           try { 
               CedulaNumerica = Integer.parseInt(Cedula);
               } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "la cedula debe ser numerica");
            return;
           }
           
           float CantidadNumerica;
           try { 
               CantidadNumerica = Float.parseFloat(CantidadAumentar);
               } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "la cantidad debe ser numerica");
            return;
           }
         try {
            Club.AumentarFondo(CedulaNumerica, CantidadNumerica);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error inesperado");
        }
    }
}
