package ListasEnlazadas;

import Clases.Ingresos;

public class NodoIngreso extends Ingresos{
    private NodoIngreso siguiente;

    public NodoIngreso(String FechaIngreso, String Almacen, String FechaDe_R_OP, String FechaSalidaCliente, String ProgramadaCheckList, String R_OP, String OrdenCompra, String OrdenCompraProvedor, String Modelo, String TipoEntregar, String ClaveIdentificador, String R_OP2, String Clave, String Provedor, String Cliente, int NumPedidoProvedor, int ClaveProducto, int Tarimas, int PiezaporBulto, int TotalBultos, int TotalPiezas, int PiezasRequendas, int Paletizado, int CamaPorPaletA1, int CamaPorPaletA2, int EstibasPorPalet, int TotalPiezasFinal, Float Alto, Float Ancho, Float Largo, Float CalibreFlauta, Float Medidas) {
        super(FechaIngreso, Almacen, FechaDe_R_OP, FechaSalidaCliente, ProgramadaCheckList, R_OP, OrdenCompra, OrdenCompraProvedor, Modelo, TipoEntregar, ClaveIdentificador, R_OP2, Clave, Provedor, Cliente, NumPedidoProvedor, ClaveProducto, Tarimas, PiezaporBulto, TotalBultos, TotalPiezas, PiezasRequendas, Paletizado, CamaPorPaletA1, CamaPorPaletA2, EstibasPorPalet, TotalPiezasFinal, Alto, Ancho, Largo, CalibreFlauta, Medidas);
        this.siguiente = null;
    }

    public NodoIngreso getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoIngreso siguiente) {
        this.siguiente = siguiente;
    }
}
