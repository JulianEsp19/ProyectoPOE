package Forms;

import Clases.*;
import Src.Strings;
import java.sql.SQLException;
import javax.xml.transform.TransformerException;

public class TestJava {
    
    public static void main(String[] args) throws SQLException, TransformerException {
        UsuarioLogIn sesion = new UsuarioLogIn();
        Usuario usuario = new Usuario("Admin", "Admin");
        
        System.out.println(sesion.comprobarUsuario(usuario));
        sesion.borrarSesionMantenida();
    }
    
    
}
