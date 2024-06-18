package ListasEnlazadas;

public class ListaSalida {
    NodoSalida salidaInicio;
    NodoSalida salidaFinal;
    int length;

    public ListaSalida() {
        this.salidaInicio = null;
        this.salidaFinal = null;
        this.length = 0;
    }
    
    public boolean estaVacio(){
        return salidaInicio == null;
    }
    
    public void insertar(NodoSalida nuevo){
        if(estaVacio()){
            salidaInicio = salidaFinal = nuevo;
        }
        else{
            salidaFinal.setSiguiente(nuevo);
            salidaFinal = nuevo;
        }
        length++;
    }
    
    public Object[] toObject(){
        Object filas[] = new Object[length];
        NodoSalida temporal = salidaInicio;
        for (int i = 0; i < length; i++) {
            Object datos[] = new Object[10];
            
            datos[0] = temporal.getLugar();
            datos[1] = temporal.getNumDeTarimas();
            datos[2] = temporal.getR_OP();
            datos[3] = temporal.getClave();
            datos[4] = temporal.getCliente();
            datos[5] = temporal.getModelo();
            datos[6] = temporal.getPiezaPorBulto();
            datos[7] = temporal.getTotalBultos();
            datos[8] = temporal.getPiezasExtras();
            datos[9] = temporal.getTotalPiezas();
            
            temporal = temporal.getSiguiente();
            
            filas[i] = datos;
        }
        
        return filas;
    }
}
