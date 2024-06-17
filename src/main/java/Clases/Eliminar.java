package Clases;

import java.sql.SQLException;

public class Eliminar extends DataBase {

    public Eliminar() {
    }
    
    public void eliminarUsuario(Usuario usuario) throws SQLException{
        stmt = conexion.createStatement();
        
        String eliminarUsuario = "DELETE FROM Usuarios WHERE "
                + "NombreUsuario='"+ usuario.getUsuario() + "' "
                + "AND ContrasenaUsuario='"+ usuario.getContrasena()+ "'";
        
        stmt.execute(eliminarUsuario);
        stmt.close();
    }
}
