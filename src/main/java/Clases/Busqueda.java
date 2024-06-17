package Clases;

import java.sql.*;

public class Busqueda extends DataBase{

    public Busqueda() {
    }
    
    public void obtenerTodosLosUsuario() throws SQLException{
        stmt = conexion.createStatement();
        
        String busquedaUsuario = "SELECT * FROM Usuarios";
        
        ResultSet resultado = stmt.executeQuery(busquedaUsuario);
        
        System.out.println(resultado.getFetchSize());
    }
}
