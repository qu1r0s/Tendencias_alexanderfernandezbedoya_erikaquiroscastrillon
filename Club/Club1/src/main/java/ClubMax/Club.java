package ClubMax;

import DAO.DAOimplementacion;
import DAO.DaoService;
import Fabricacion.FabricaDeConsumos;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Club {

    private ArrayList<Socio> Socios;
    private ArrayList<Persona> Personas;
    private ArrayList<Consumo> Consumos;

    //constructor
    public Club() {
        Socios = new ArrayList();
        Personas = new ArrayList();
        Consumos = new ArrayList();
        JOptionPane.showMessageDialog(null, "WELCOME TO THE CLUBMAX");
    }
    //GET And SET modificar y obtener datos

    public ArrayList<Socio> getSocios() {
        return Socios;
    }

    public void setSocios(ArrayList<Socio> Socios) {
        this.Socios = Socios;
    }

    public ArrayList<Persona> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Persona> Personas) {
        this.Personas = Personas;
    }

    //Crear metodo para registrar Socio
    public void RegistrarSocio(long Cedula, String Nombre, String TipoSuscrip, Connection conexion) throws SQLException {
        Socio SocioX = buscarsocio(Cedula, conexion);
        if (SocioX != null) {
            JOptionPane.showMessageDialog(null, "la cedula ya se encuentra registrada");
            return;
        }
        if (Cedula < 0) {
            JOptionPane.showMessageDialog(null, "La cedula no puede ser negativa");
            return;
        }
        if (Contador("VIP") == 3 && TipoSuscrip.equals("VIP")) {
            JOptionPane.showMessageDialog(null, "EL club Supero la cantidad de Socios VIP");
            return;
        }
        if (Cedula < 0) {
            JOptionPane.showMessageDialog(null, "La cedula no puede ser negativo");
            return;
        }
        SocioX = new Socio(Cedula, Nombre, TipoSuscrip);
        DaoService dao = new DAOimplementacion(conexion);
        dao.registrarSocio(SocioX);
        if (TipoSuscrip.equals("VIP")) {
            JOptionPane.showMessageDialog(null, "Socio VIP Registrado - Cupo aprovado de: " + SocioX.getFondoDispo() + "$");
        } else {
            JOptionPane.showMessageDialog(null, "Socio Regular Registrado - Cupo aprovado de: " + SocioX.getFondoDispo() + "$");
        }

    }
    //Crear metodo para registrar Persona

    public void registrarPersona(int Cedula, String nombre, int cedula, Connection conexion) throws SQLException {
        Persona personaX = buscarPersona(cedula);
        if (personaX != null) {
            JOptionPane.showMessageDialog(null, "la cedula ya se encuentra registrada");
            return;
        }
        Socio socio = buscarsocio(Cedula);
        if (socio == null) {
            JOptionPane.showMessageDialog(null, "La cedula no pertenece a un socio");
            return;
        }
        Socio SocioX = buscarsocio(Cedula);
        if (SocioX != null) {
            JOptionPane.showMessageDialog(null, "la cedula ya se encuentra registrada");
            return;
        }
        if (cedula < 0) {
            JOptionPane.showMessageDialog(null, "La cedula no puede ser negativo");
            return;
        }
        personaX = new Persona(nombre, cedula);
        Personas.add(personaX);
        JOptionPane.showMessageDialog(null, "se ha completado el registro");
    }

//Metodo para registrar Consumo
    public void RegistrarConsumo(String nombreconsumo, double precioconsumo) {
        Consumo ConsumoX = GuardarConsumo(nombreconsumo);
        if (nombreconsumo == null) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el nombre de lo consumido");
            return;
        }
        ConsumoX = new Consumo(nombreconsumo, precioconsumo) {};
        Consumos.add(ConsumoX);
        JOptionPane.showMessageDialog(null, "se ha completado el registro");
    }
    // Metodo

    public void AumentarFondo(int Cedula, float FondoDispo) {
        Socio SocioX = buscarsocio(Cedula);
        if (SocioX == null) {
            JOptionPane.showMessageDialog(null, "La cedula no pertenece a un socio");
            return;
        }
        if (Cedula < 0) {
            JOptionPane.showMessageDialog(null, "La cedula no puede ser negativo");
            return;
        }
        JOptionPane.showMessageDialog(null, "Se incremento el Fondo al Socio con la Cedula: " + Cedula + " Fondo Disponible: " + FondoDispo);

    }

    public boolean verificarCedula(long Cedula) {
        Socio SocioX = buscarsocio(Cedula);
        if (SocioX.equals(Cedula)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "La cédula ingresada no está en la lista de socios o personas autorizadas", "Error de validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /*public void IncrementoFondo(float FondoDispo, Socio SocioX) {
        if (this.TipoSuscrip.equals("VIP")) {
            this.FondoDispo += FondoDispo + 100000;
        }else{
            this.FondoDispo += FondoDispo + 50000;  
        }
           /* SocioX.setFondoDispo(SocioX.getFondoDispo() + FondoDispo);
        }  
     */


    // Metodo contador
    private int Contador(String TipoSuscrip) {
        int Contador = 0;
        for (Socio SocioX : this.Socios) {
            if (SocioX.getTipoSuscrip() == TipoSuscrip) {
                Contador++;
            }
        }
        return Contador;
    }
// Metodo buscarPersona

    private Persona buscarPersona(int cedula) {
        for (Persona personaX : this.Personas) {
            if (personaX.getCedula() == cedula) {
                return personaX;
            }
        }
        return null;
    }

    private Consumo GuardarConsumo(String nombreconsumo) {
        for (Consumo ConsumoX : this.Consumos) {
            if (ConsumoX.getNombreconsumo() == nombreconsumo) {
                return ConsumoX;
            }
        }
        return null;
    }

    public void eliminarSocio(long Cedula) {
        Socio socio = buscarsocio(Cedula);
        if (socio == null) {
            JOptionPane.showMessageDialog(null, "La cedula no se encuentra registrada");
            return;
        }
        this.Socios.remove(socio);
        JOptionPane.showMessageDialog(null, "se ha eliminado el socio");
    }
    private Socio buscarsocio(long Cedula, Connection conexion) throws SQLException {
        DaoService dao = new DAOimplementacion(conexion);
        return dao.buscarSocio(Cedula);
    }
    private Socio buscarsocio(long Cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void registrarConsumoBebida(int cedulaNumerica, int tipoBebida, int tipoBebidaFria, int detalle) {
    //validar que la cedula le pertenezca a un socio o un autorizado
    FabricaDeConsumos fabrica = new FabricaDeConsumos();
    Consumo consumo = fabrica.creadorDeBebidas(tipoBebida,tipoBebidaFria,detalle);
        System.out.println("nombre consumo " + consumo.getNombreconsumo());
    }

    public void registrarConsumoPlato(int cedulaNumerica, int entradas, int tipoplato, int detalle, int platoFuerte,int postre ) {
    //validar que la cedula le pertenezca a un socio o un autorizado
    FabricaDeConsumos fabrica = new FabricaDeConsumos();
    Consumo consumo = fabrica.creadorDePlatos(entradas,tipoplato, detalle,platoFuerte,postre);
        System.out.println("nombre consumo " + consumo.getNombreconsumo());
    }
}
