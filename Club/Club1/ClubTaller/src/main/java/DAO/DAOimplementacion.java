package DAO;

import ClubMax.Persona;
import ClubMax.Socio;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.ArrayList;

public  class DAOimplementacion implements DaoService {

    private Connection conexion;

    public DAOimplementacion(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public Socio buscarSocio(long Cedula) throws SQLException {
        Socio SocioX = null;
        String Query = "SELECT CEDULA,NOMBRE,TIPOSUSCRIPCION FROM SOCIO WHERE CEDULA= ?";
        PreparedStatement preparedStatement = conexion.prepareStatement(Query);
        preparedStatement.setLong(1, Cedula);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            Cedula = rs.getLong("CEDULA");
            String Nombre = rs.getString("NOMBRE");
            String TipoSuscrip = rs.getString("TIPOSUSCRIPCION");
            SocioX = new Socio(Cedula, Nombre, TipoSuscrip);
        }
        rs.close();
        preparedStatement.close();
        return SocioX;
    }

    @Override
    public void registrarSocio(Socio socio) throws SQLException {
        String Query = "INSER INTO PERSONA (CEDULA, NOMBRE,TIPOSUSCRIPCION)VALUES (?,?,?)";
        PreparedStatement preparedStatement = conexion.prepareStatement(Query);
        preparedStatement.setLong(1, socio.getCedula());
        preparedStatement.setString(2, socio.getNombre());
        preparedStatement.setString(3, socio.getTipoSuscrip());
        preparedStatement.execute();
        preparedStatement.close();
    }

    public Persona buscarPersona(int cedula) throws SQLException {
        Persona PersonaX = null;
        String Query = "SELECT CEDULA,NOMBRE FROM SOCIO WHERE CEDULA= ?";
        PreparedStatement preparedStatement = conexion.prepareStatement(Query);
        preparedStatement.setInt(1, cedula);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            String nombre = rs.getString("NOMBRE");
            cedula = rs.getInt("CEDULA");
            PersonaX = new Persona(nombre, cedula);
        }
        rs.close();
        preparedStatement.close();
        return PersonaX;
    }

}
