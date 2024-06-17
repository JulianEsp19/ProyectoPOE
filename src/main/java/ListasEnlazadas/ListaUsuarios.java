package ListasEnlazadas;

public class ListaUsuarios{
    
    NodoUsuario usuarioInicio;
    NodoUsuario usuarioFinal;
    int length;

    public ListaUsuarios() {
        this.usuarioInicio = null;
        this.usuarioFinal = null;
        this.length = 0;
    }
    
    public boolean estaVacio(){
        return usuarioInicio == null;
    }
    
    public void insertar(String usuario, boolean acceso){
        NodoUsuario nuevo = new NodoUsuario(usuario, acceso);
        
        if(estaVacio()){
            usuarioInicio = usuarioFinal = nuevo;
        }
        else{
            usuarioFinal.setSiguiente(nuevo);
            usuarioFinal = nuevo;
        }
        length++;
    }
    
    public Object[] toObject(){
        Object filas[] = new Object[length];
        NodoUsuario temporal = usuarioInicio;
        for (int i = 0; i < length; i++) {
            Object datos[] = new Object[2];
            datos[0] = temporal.getUsuario();
            datos[1] = temporal.getTipoAcceso();
            
            temporal = temporal.getSiguiente();
            
            filas[i] = datos;
        }
        
        return filas;
    }
    
    
    
    
    
}
