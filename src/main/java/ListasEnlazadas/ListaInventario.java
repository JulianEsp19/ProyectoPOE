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
            datos[1] = temporal.getNumTarimas();
            datos[2] = temporal.getClave();
            datos[3] = temporal.getCliente();
            datos[4] = temporal.getModelo();
            datos[5] = temporal.getPzBulto();
            datos[6] = temporal.getTotalBultos();
            datos[7] = temporal.getPzExtras();
            datos[8] = temporal.getTotalPiezas();
            datos[9] = temporal.getNota();
            
            temporal = temporal.getSiguiente();
            
            filas[i] = datos;
        }
        
        return filas;
    }
    
}
