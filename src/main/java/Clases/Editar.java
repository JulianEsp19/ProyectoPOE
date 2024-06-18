package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Editar extends DataBase{

    public Editar() {
    }
    
    //Funcion con sql que edita Toda la informacion del usuario completa
    //Donde se espera que el Usuario antiguo tenga por lo menos nombreUsuario y contrasenaUsuario
    //y que el nuevo cuente con todos los campos de un Usuario
    public void editarUsuarioCompleto(Usuario antiguo, Usuario nuevo) throws SQLException{
        int rowid = 0;
        stmt = conexion.createStatement();
        
        String busquedaAntiguo = "SELECT ROWID FROM Usuarios WHERE "
                + "NombreUsuario = '" + antiguo.getUsuario() + "' AND "
                + "ContrasenaUsuario = '"+ antiguo.getContrasena() +"'";
        
        ResultSet resultado = stmt.executeQuery(busquedaAntiguo);
        
        rowid = resultado.getInt("rowid");
        
        String editarUsuario = "UPDATE Usuarios SET "
                + "NombreUsuario = '"+nuevo.getUsuario()+"', "
                + "ContrasenaUsuario = '"+nuevo.getContrasena() + "', "
                + "TipoAcceso = "+nuevo.getTipoAcceso()+" "
                + "WHERE ROWID="+ rowid;
        
        stmt.executeUpdate(editarUsuario);
        stmt.close();
    }
    
    //Funcion para editar el tipo de acceso de un usuario donde se espera solo nombre del usuario
    public void editarUsuarioAcceso(Usuario antiguo, boolean accesoNuevo) throws SQLException{
        
        stmt = conexion.createStatement();
        
        String editarUsuario = "UPDATE Usuarios SET "
                + "TipoAcceso = "+accesoNuevo
                + " WHERE NombreUsuario = '"+ antiguo.getUsuario() + "'";
        
        stmt.execute(editarUsuario);
        stmt.close();
    }
    
}
