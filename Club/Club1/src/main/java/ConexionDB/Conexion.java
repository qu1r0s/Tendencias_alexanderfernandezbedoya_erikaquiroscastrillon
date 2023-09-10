package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static String usuario = "Maxcimix";
    private static String contraseña = "123456";
    private Connection conectar;

    public Conexion() {
    }

    public void establecerConeccion() {
        try {
            String cadena = "jdbc:sqlserver://localhost:1433;databaseName=ClubMax;encrypt=true;trustServerCertificate=true";
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            System.out.print("Funciono");

        } catch (Exception e) {
            System.out.println("Tenemos Problemas Para Conectarnos \n" + e.getMessage());
        }
    }

    protected Connection getConexion() {
        return conectar;
    }

    protected void setConexion(Connection conexion) {
        this.conectar = conexion;
    }
}
