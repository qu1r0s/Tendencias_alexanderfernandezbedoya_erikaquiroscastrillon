
package DAO;

import ClubMax.Persona;
import ClubMax.Socio;
import java.sql.SQLException;

public interface DaoService {

    public Socio buscarSocio(long Cedula) throws SQLException;
    public void registrarSocio(Socio SocioX) throws SQLException;
    public Persona buscarPersona(int cedula) throws SQLException;
    /*public void registrarPersona(Persona PersonaX) throws SQLException;
    public void eliminarPersona(Persona personaX) throws SQLException;*/

}
