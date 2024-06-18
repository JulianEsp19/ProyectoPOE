package ListasEnlazadas;

import Clases.Inventario;

public class NodoInventario extends Inventario {
    
    private NodoInventario siguiente;
    
    public NodoInventario(String Lugar, int NumTarimas, String Clave, String Cliente, String Modelo, int PzBulto, int TotalBultos, int PzExtras, int TotalPiezas, String Nota) {
        super(Lugar, NumTarimas, Clave, Cliente, Modelo, PzBulto, TotalBultos, PzExtras, TotalPiezas, Nota);
        this.siguiente = null;
    }

    public NodoInventario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoInventario siguiente) {
        this.siguiente = siguiente;
    }
    
}
