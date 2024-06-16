package Clases;

//Clase que se va a usar como base para agregar los usarios en la base de datos
public class Usuario {
    private String usuario;
    private String contrasena;
    private Boolean tipoAcceso;

    public Usuario(String usuario, String contrasena, Boolean tipoAcceso) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipoAcceso = tipoAcceso;
    }

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipoAcceso = false;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Boolean getTipoAcceso() {
        return tipoAcceso;
    }

    public void setTipoAcceso(Boolean tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }
    
}
