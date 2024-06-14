package Clases;

import java.sql.*;

public class Agregar extends DataBase{

    public Agregar() {
    }
    
    //Funcion para agregar nuevos usarios a la base de datos
    public void agregarUsuario(Usuario usuario) throws SQLException {
        stmt = conexion.createStatement();
        
        String sqlUsuario = "INSERT INTO Usuarios (NombreUsuario, ContrasenaUsuario, TipoAcceso)" +
                "VALUES ('"+usuario.getUsuario() +"','"+ usuario.getContrasena() +"',"+ usuario.getTipoAcceso() + ")";
        
        stmt.execute(sqlUsuario);
        stmt.close();
    }

}
