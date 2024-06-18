package Clases;

public class Salida {
    private String Lugar;
    private int NumDeTarimas;
    private int R_OP;
    private String Clave;
    private String Cliente;
    private String Modelo;
    private int PiezaPorBulto;
    private int TotalBultos;
    private int PiezasExtras;
    private int TotalPiezas;

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public int getNumDeTarimas() {
        return NumDeTarimas;
    }

    public void setNumDeTarimas(int NumDeTarimas) {
        this.NumDeTarimas = NumDeTarimas;
    }

    public int getR_OP() {
        return R_OP;
    }

    public void setR_OP(int R_OP) {
        this.R_OP = R_OP;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getPiezaPorBulto() {
        return PiezaPorBulto;
    }

    public void setPiezaPorBulto(int PiezaPorBulto) {
        this.PiezaPorBulto = PiezaPorBulto;
    }

    public int getTotalBultos() {
        return TotalBultos;
    }

    public void setTotalBultos(int TotalBultos) {
        this.TotalBultos = TotalBultos;
    }

    public int getPiezasExtras() {
        return PiezasExtras;
    }

    public void setPiezasExtras(int PiezasExtras) {
        this.PiezasExtras = PiezasExtras;
    }

    public int getTotalPiezas() {
        return TotalPiezas;
    }

    public void setTotalPiezas(int TotalPiezas) {
        this.TotalPiezas = TotalPiezas;
    }

    public Salida(String Lugar, int NumDeTarimas, int R_OP, String Clave, String Cliente, String Modelo, int PiezaPorBulto, int TotalBultos, int PiezasExtras, int TotalPiezas) {
        this.Lugar = Lugar;
        this.NumDeTarimas = NumDeTarimas;
        this.R_OP = R_OP;
        this.Clave = Clave;
        this.Cliente = Cliente;
        this.Modelo = Modelo;
        this.PiezaPorBulto = PiezaPorBulto;
        this.TotalBultos = TotalBultos;
        this.PiezasExtras = PiezasExtras;
        this.TotalPiezas = TotalPiezas;
    }
    
    
    
}
