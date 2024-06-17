package Clases;

/**
 *
 * @author deand
 */
public class Ingresos {
    
    private String FechaIngreso;
    private String Almacen;
    private String FechaDe_R_OP;
    private String FechaSalidaCliente;
    private String ProgramadaCheckList;
    private String R_OP;
    private String OrdenCompra;
    private String OrdenCompraProvedor;
    private String Modelo;
    private String TipoEntregar;
    private String ClaveIdentificador;
    private String R_OP2;
    private String Clave;
    private String Provedor;
    private String Cliente;
    private int NumPedidoProvedor;
    private int ClaveProducto;
    private int Tarimas;
    private int PiezaporBulto;
    private int  TotalBultos;
    private int TotalPiezas;
    private int PiezasRequendas;
    private int Paletizado;
    private int CamaPorPaletA1;
    private int CamaPorPaletA2;
    private int EstibasPorPalet;
    private int TotalPiezasFinal;
    private Float Alto;
    private Float Ancho;
    private Float Largo;
    private Float CalibreFlauta;
    private Float Medidas;

    public Ingresos(String FechaIngreso, String Almacen, String FechaDe_R_OP, String FechaSalidaCliente, String ProgramadaCheckList, String R_OP, String OrdenCompra, String OrdenCompraProvedor, String Modelo, String TipoEntregar, String ClaveIdentificador, String R_OP2, String Clave, String Provedor, String Cliente, int NumPedidoProvedor, int ClaveProducto, int Tarimas, int PiezaporBulto, int TotalBultos, int TotalPiezas, int PiezasRequendas, int Paletizado, int CamaPorPaletA1, int CamaPorPaletA2, int EstibasPorPalet, int TotalPiezasFinal, Float Alto, Float Ancho, Float Largo, Float CalibreFlauta, Float Medidas) {
        this.FechaIngreso = FechaIngreso;
        this.Almacen = Almacen;
        this.FechaDe_R_OP = FechaDe_R_OP;
        this.FechaSalidaCliente = FechaSalidaCliente;
        this.ProgramadaCheckList = ProgramadaCheckList;
        this.R_OP = R_OP;
        this.OrdenCompra = OrdenCompra;
        this.OrdenCompraProvedor = OrdenCompraProvedor;
        this.Modelo = Modelo;
        this.TipoEntregar = TipoEntregar;
        this.ClaveIdentificador = ClaveIdentificador;
        this.R_OP2 = R_OP2;
        this.Clave = Clave;
        this.Provedor = Provedor;
        this.Cliente = Cliente;
        this.NumPedidoProvedor = NumPedidoProvedor;
        this.ClaveProducto = ClaveProducto;
        this.Tarimas = Tarimas;
        this.PiezaporBulto = PiezaporBulto;
        this.TotalBultos = TotalBultos;
        this.TotalPiezas = TotalPiezas;
        this.PiezasRequendas = PiezasRequendas;
        this.Paletizado = Paletizado;
        this.CamaPorPaletA1 = CamaPorPaletA1;
        this.CamaPorPaletA2 = CamaPorPaletA2;
        this.EstibasPorPalet = EstibasPorPalet;
        this.TotalPiezasFinal = TotalPiezasFinal;
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.Largo = Largo;
        this.CalibreFlauta = CalibreFlauta;
        this.Medidas = Medidas;
    }

    
    
    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getAlmacen() {
        return Almacen;
    }

    public void setAlmacen(String Almacen) {
        this.Almacen = Almacen;
    }

    public String getFechaDe_R_OP() {
        return FechaDe_R_OP;
    }

    public void setFechaDe_R_OP(String FechaDe_R_OP) {
        this.FechaDe_R_OP = FechaDe_R_OP;
    }

    public String getFechaSalidaCliente() {
        return FechaSalidaCliente;
    }

    public void setFechaSalidaCliente(String FechaSalidaCliente) {
        this.FechaSalidaCliente = FechaSalidaCliente;
    }

    public String getProgramadaCheckList() {
        return ProgramadaCheckList;
    }

    public void setProgramadaCheckList(String ProgramadaCheckList) {
        this.ProgramadaCheckList = ProgramadaCheckList;
    }

    public String getR_OP() {
        return R_OP;
    }

    public void setR_OP(String R_OP) {
        this.R_OP = R_OP;
    }

    public String getOrdenCompra() {
        return OrdenCompra;
    }

    public void setOrdenCompra(String OrdenCompra) {
        this.OrdenCompra = OrdenCompra;
    }

    public String getOrdenCompraProvedor() {
        return OrdenCompraProvedor;
    }

    public void setOrdenCompraProvedor(String OrdenCompraProvedor) {
        this.OrdenCompraProvedor = OrdenCompraProvedor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipoEntregar() {
        return TipoEntregar;
    }

    public void setTipoEntregar(String TipoEntregar) {
        this.TipoEntregar = TipoEntregar;
    }

    public String getClaveIdentificador() {
        return ClaveIdentificador;
    }

    public void setClaveIdentificador(String ClaveIdentificador) {
        this.ClaveIdentificador = ClaveIdentificador;
    }

    public String getR_OP2() {
        return R_OP2;
    }

    public void setR_OP2(String R_OP2) {
        this.R_OP2 = R_OP2;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getProvedor() {
        return Provedor;
    }

    public void setProvedor(String Provedor) {
        this.Provedor = Provedor;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public int getNumPedidoProvedor() {
        return NumPedidoProvedor;
    }

    public void setNumPedidoProvedor(int NumPedidoProvedor) {
        this.NumPedidoProvedor = NumPedidoProvedor;
    }

    public int getClaveProducto() {
        return ClaveProducto;
    }

    public void setClaveProducto(int ClaveProducto) {
        this.ClaveProducto = ClaveProducto;
    }

    public int getTarimas() {
        return Tarimas;
    }

    public void setTarimas(int Tarimas) {
        this.Tarimas = Tarimas;
    }

    public int getPiezaporBulto() {
        return PiezaporBulto;
    }

    public void setPiezaporBulto(int PiezaporBulto) {
        this.PiezaporBulto = PiezaporBulto;
    }

    public int getTotalBultos() {
        return TotalBultos;
    }

    public void setTotalBultos(int TotalBultos) {
        this.TotalBultos = TotalBultos;
    }

    public int getTotalPiezas() {
        return TotalPiezas;
    }

    public void setTotalPiezas(int TotalPiezas) {
        this.TotalPiezas = TotalPiezas;
    }

    public int getPiezasRequendas() {
        return PiezasRequendas;
    }

    public void setPiezasRequendas(int PiezasRequendas) {
        this.PiezasRequendas = PiezasRequendas;
    }

    public int getPaletizado() {
        return Paletizado;
    }

    public void setPaletizado(int Paletizado) {
        this.Paletizado = Paletizado;
    }

    public int getCamaPorPaletA1() {
        return CamaPorPaletA1;
    }

    public void setCamaPorPaletA1(int CamaPorPaletA1) {
        this.CamaPorPaletA1 = CamaPorPaletA1;
    }

    public int getCamaPorPaletA2() {
        return CamaPorPaletA2;
    }

    public void setCamaPorPaletA2(int CamaPorPaletA2) {
        this.CamaPorPaletA2 = CamaPorPaletA2;
    }

    public int getEstibasPorPalet() {
        return EstibasPorPalet;
    }

    public void setEstibasPorPalet(int EstibasPorPalet) {
        this.EstibasPorPalet = EstibasPorPalet;
    }

    public int getTotalPiezasFinal() {
        return TotalPiezasFinal;
    }

    public void setTotalPiezasFinal(int TotalPiezasFinal) {
        this.TotalPiezasFinal = TotalPiezasFinal;
    }

    public Float getAlto() {
        return Alto;
    }

    public void setAlto(Float Alto) {
        this.Alto = Alto;
    }

    public Float getAncho() {
        return Ancho;
    }

    public void setAncho(Float Ancho) {
        this.Ancho = Ancho;
    }

    public Float getLargo() {
        return Largo;
    }

    public void setLargo(Float Largo) {
        this.Largo = Largo;
    }

    public Float getCalibreFlauta() {
        return CalibreFlauta;
    }

    public void setCalibreFlauta(Float CalibreFlauta) {
        this.CalibreFlauta = CalibreFlauta;
    }

    public Float getMedidas() {
        return Medidas;
    }

    public void setMedidas(Float Medidas) {
        this.Medidas = Medidas;
    }
    
    
}
