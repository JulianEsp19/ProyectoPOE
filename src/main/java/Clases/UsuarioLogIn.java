package Clases;

import Src.Strings;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.transform.TransformerException;

public class UsuarioLogIn extends DataBase{
    
    private Usuario usuario;
    private boolean sesionIniciada;

    public UsuarioLogIn() {
    }
    
    
    //Funcion para verificar que el usuario exista dentro de la base de datos 
    //devolviendo true si es asi o por el contrario false
    public boolean comprobarUsuario(Usuario usuario) throws SQLException{
        if(usuario.getUsuario().isEmpty() && usuario.getContrasena().isEmpty()) 
            return false;
        else{
            stmt = conexion.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM Usuarios");
            
            while(resultado.next()){
                String usuarioResultado = resultado.getString("NombreUsuario");
                String contrasenaResultado = resultado.getString("ContrasenaUsuario");
                if(usuarioResultado.equals(usuario.getUsuario()) && contrasenaResultado.equals(usuario.getContrasena())){
                    this.usuario = usuario;
                    this.usuario.setTipoAcceso(resultado.getBoolean("TipoAcceso"));
                    sesionIniciada = true;
                    return sesionIniciada;
                }
            }
        }
        return false;
    }
    
    
    public void mantenerSesion() throws TransformerException{
        Strings manejoXML = new Strings();
        if(sesionIniciada){
            manejoXML.escribirXML("Usuario", usuario.getUsuario());
            manejoXML.escribirXML("Contrasena", usuario.getContrasena());
        }
    }
    
    public void borrarSesionMantenida() throws TransformerException{
        Strings manejoXML = new Strings();
        manejoXML.escribirXML("Usuario", "");
        manejoXML.escribirXML("Contrasena", "");
    }
    
    public boolean obtenerSesion() throws SQLException{
        Strings strings = new Strings();
        String usuario = strings.getText("Usuario");
        String contrasena = strings.getText("Contrasena");
        
        Usuario usuarioXml = new Usuario(usuario, contrasena);
        
        boolean resultado = comprobarUsuario(usuarioXml);
        
        return resultado;
    }
    
}
