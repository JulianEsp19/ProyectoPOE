package Clases;

public class Inventario {
    
    private String Lugar;
    private int NumTarimas;
    private String Clave;
    private String Cliente;
    private String Modelo;
    private int PzBulto;
    private int TotalBultos;
    private int PzExtras;
    private int TotalPiezas;
    private String Nota;

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public int getNumTarimas() {
        return NumTarimas;
    }

    public void setNumTarimas(int NumTarimas) {
        this.NumTarimas = NumTarimas;
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

    public int getPzBulto() {
        return PzBulto;
    }

    public void setPzBulto(int PzBulto) {
        this.PzBulto = PzBulto;
    }

    public int getTotalBultos() {
        return TotalBultos;
    }

    public void setTotalBultos(int TotalBultos) {
        this.TotalBultos = TotalBultos;
    }

    public int getPzExtras() {
        return PzExtras;
    }

    public void setPzExtras(int PzExtras) {
        this.PzExtras = PzExtras;
    }

    public int getTotalPiezas() {
        return TotalPiezas;
    }

    public void setTotalPiezas(int TotalPiezas) {
        this.TotalPiezas = TotalPiezas;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }

    public Inventario(String Lugar, int NumTarimas, String Clave, String Cliente, String Modelo, int PzBulto, int TotalBultos, int PzExtras, int TotalPiezas, String Nota) {
        this.Lugar = Lugar;
        this.NumTarimas = NumTarimas;
        this.Clave = Clave;
        this.Cliente = Cliente;
        this.Modelo = Modelo;
        this.PzBulto = PzBulto;
        this.TotalBultos = TotalBultos;
        this.PzExtras = PzExtras;
        this.TotalPiezas = TotalPiezas;
        this.Nota = Nota;
    }
    
    
}
