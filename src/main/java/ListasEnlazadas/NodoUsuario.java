package ListasEnlazadas;

import Clases.Usuario;

public class NodoUsuario extends Usuario {
    
    private NodoUsuario siguiente;

    public NodoUsuario(String usuario, Boolean tipoAcceso) {
        super(usuario, tipoAcceso);
        this.siguiente = null;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }
}
