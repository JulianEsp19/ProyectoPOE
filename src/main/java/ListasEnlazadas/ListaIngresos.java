package ListasEnlazadas;

public class ListaIngresos {
    NodoIngreso usuarioInicio;
    NodoIngreso usuarioFinal;
    int length;

    public ListaIngresos() {
        this.usuarioInicio = null;
        this.usuarioFinal = null;
        this.length = 0;
    }
    
    public boolean estaVacio(){
        return usuarioInicio == null;
    }
    
    public void insertar(NodoIngreso nuevo){
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
        NodoIngreso temporal = usuarioInicio;
        for (int i = 0; i < length; i++) {
            Object datos[] = new Object[32];
            datos[0] = temporal.getFechaIngreso();
            datos[0] = temporal.getAlmacen();
            datos[0] = temporal.getFechaDe_R_OP();
            datos[0] = temporal.getFechaSalidaCliente();
            datos[0] = temporal.getProgramadaCheckList();
            datos[0] = temporal.getR_OP();
            datos[0] = temporal.getOrdenCompra();
            datos[0] = temporal.getOrdenCompraProvedor();
            datos[0] = temporal.getModelo();
            datos[0] = temporal.getTipoEntregar();
            datos[0] = temporal.getClaveIdentificador();
            datos[0] = temporal.getR_OP2();
            datos[0] = temporal.getClave();
            datos[0] = temporal.getProvedor();
            datos[0] = temporal.getCliente();
            datos[0] = temporal.getNumPedidoProvedor();
            datos[0] = temporal.getClaveProducto();
            datos[0] = temporal.getTarimas();
            datos[0] = temporal.getPiezaporBulto();
            datos[0] = temporal.getTotalBultos();
            datos[0] = temporal.getTotalPiezas();
            datos[0] = temporal.getPiezasRequendas();
            datos[0] = temporal.getPaletizado();
            datos[0] = temporal.getCamaPorPaletA1();
            datos[0] = temporal.getCamaPorPaletA2();
            datos[0] = temporal.getEstibasPorPalet();
            datos[0] = temporal.getTotalPiezasFinal();
            datos[0] = temporal.getAlto();
            datos[0] = temporal.getAncho();
            datos[0] = temporal.getLargo();
            datos[0] = temporal.getCalibreFlauta();
            datos[0] = temporal.getMedidas();
            
            temporal = temporal.getSiguiente();
            
            filas[i] = datos;
        }
        
        return filas;
    }
}
