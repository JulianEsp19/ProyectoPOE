package ListasEnlazadas;

import Clases.Salida;

public class NodoSalida extends Salida{
    
    private NodoSalida siguiente;
    
    public NodoSalida(String Lugar, int NumDeTarimas, int R_OP, String Clave, String Cliente, String Modelo, int PiezaPorBulto, int TotalBultos, int PiezasExtras, int TotalPiezas) {
        super(Lugar, NumDeTarimas, R_OP, Clave, Cliente, Modelo, PiezaPorBulto, TotalBultos, PiezasExtras, TotalPiezas);
        this.siguiente = null;
    }

    public NodoSalida getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSalida siguiente) {
        this.siguiente = siguiente;
    }
    
}
