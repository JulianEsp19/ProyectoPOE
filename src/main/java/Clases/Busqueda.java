package Clases;

import ListasEnlazadas.*;
import java.sql.*;

public class Busqueda extends DataBase{

    public Busqueda() {
    }
    
    //Funcion para obtener los nombres de los usuarios junto con su tipo de acceso
    //sin contraseña
    public Object[] obtenerTodosLosUsuario() throws SQLException{
        ListaUsuarios lista = new ListaUsuarios();
        
        stmt = conexion.createStatement();
        
        String busquedaUsuario = "SELECT NombreUsuario, TipoAcceso FROM Usuarios";
        
        ResultSet resultado = stmt.executeQuery(busquedaUsuario);
        
        while(resultado.next()){
            String nombreUsuario = resultado.getString("NombreUsuario");
            boolean tipoAcceso = resultado.getBoolean("TipoAcceso");
            
            lista.insertar(nombreUsuario, tipoAcceso);
        }
        
        return lista.toObject();
    }
}
