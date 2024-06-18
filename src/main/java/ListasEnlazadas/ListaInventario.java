package ListasEnlazadas;

public class ListaInventario {
    
    NodoInventario inventarioInicio;
    NodoInventario inventarioFinal;
    int length;

    public ListaInventario() {
        this.inventarioInicio = null;
        this.inventarioFinal = null;
        this.length = 0;
    }
    
    public boolean estaVacio(){
        return inventarioInicio == null;
    }
    
    public void insertar(NodoInventario nuevo){
        if(estaVacio()){
            inventarioInicio = inventarioFinal = nuevo;
        }
        else{
            inventarioFinal.setSiguiente(nuevo);
            inventarioFinal = nuevo;
        }
        length++;
    }
    
    public Object[] toObject(){
        Object filas[] = new Object[length];
        NodoInventario temporal = inventarioInicio;
        for (int i = 0; i < length; i++) {
            Object datos[] = new Object[10];
            
            datos[0] = temporal.getLugar();
            datos[0] = temporal.getNumTarimas();
            datos[0] = temporal.getClave();
            datos[0] = temporal.getCliente();
            datos[0] = temporal.getModelo();
            datos[0] = temporal.getPzBulto();
            datos[0] = temporal.getTotalBultos();
            datos[0] = temporal.getPzExtras();
            datos[0] = temporal.getTotalPiezas();
            datos[0] = temporal.getNota();
            
            temporal = temporal.getSiguiente();
            
            filas[i] = datos;
        }
        
        return filas;
    }
    
}
