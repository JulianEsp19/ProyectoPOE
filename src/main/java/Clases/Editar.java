package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Editar extends DataBase{

    public Editar() {
    }
    
    public void editarUsuario(Usuario antiguo, Usuario nuevo) throws SQLException{
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
    
}
