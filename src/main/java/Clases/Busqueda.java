package Clases;

import ListasEnlazadas.*;
import java.sql.*;

public class Busqueda extends DataBase{

    public Busqueda() {
    }
    
    //Funcion para obtener los nombres de los usuarios junto con su tipo de acceso
    //sin contraseña
    public Object[] obtenerTodosLosUsuario() throws SQLException{
        ListaUsuarios lista = new ListaUsuarios();
        
        stmt = conexion.createStatement();
        
        String busquedaUsuario = "SELECT NombreUsuario, TipoAcceso FROM Usuarios";
        
        ResultSet resultado = stmt.executeQuery(busquedaUsuario);
        
        while(resultado.next()){
            String nombreUsuario = resultado.getString("NombreUsuario");
            boolean tipoAcceso = resultado.getBoolean("TipoAcceso");
            
            lista.insertar(nombreUsuario, tipoAcceso);
        }
        
        stmt.close();
        return lista.toObject();
    }
    
    //funcion que devuelve en Object[ ] todas las filas de la base de datos
    public Object[] obtenerTodosLosIngresos() throws SQLException{
        ListaIngresos lista = new ListaIngresos();
        
        stmt = conexion.createStatement();
        
        String busquedaIngresos = "SELECT * FROM Ingresos";
        
        ResultSet resultado = stmt.executeQuery(busquedaIngresos);
        
        while (resultado.next()) {
            String Almacen = resultado.getString("Almacen");
            String FechaDe_R_OP = resultado.getString("FechaDe_R_OP");
            String FechaSalidaCliente = resultado.getString("FechaSalidaCliente");
            String ProgramadaCheckList = resultado.getString("ProgramadaCheckList");
            String R_OP = resultado.getString("R_OP");
            String OrdenCompra = resultado.getString("OrdenCompra");
            String OrdenCompraProvedor = resultado.getString("OrdenCompraProvedor");
            String Modelo = resultado.getString("Modelo");
            String TipoEntregar = resultado.getString("TipoEntregar");
            String ClaveIdentificador = resultado.getString("claveIdentificador");
            String R_OP2 = resultado.getString("R_OP2");
            String Clave = resultado.getString("Clave");
            String Provedor = resultado.getString("Provedor");
            String Cliente = resultado.getString("Cliente");
            int NumPedidoProvedor = resultado.getInt("NumPedidoProvedor");
            int ClaveProducto = resultado.getInt("ClaveProducto");
            int Tarimas = resultado.getInt("Tarimas");
            int PiezaporBulto = resultado.getInt("PiezaporBulto");
            int TotalBultos = resultado.getInt("TotalBultos");
            int TotalPiezas = resultado.getInt("TotalPiezas");
            int PiezasRequendas = resultado.getInt("PiezasRequendas");
            int Paletizado = resultado.getInt("Paletizado");
            int CamaPorPaletA1 = resultado.getInt("CamaPorPaletA1");
            int CamaPorPaletA2 = resultado.getInt("CamaPorPaletA2");
            int EstibasPorPalet = resultado.getInt("EstibasPorPalet");
            int TotalPiezasFinal = resultado.getInt("TotalPiezasFinal");
            float Alto = resultado.getFloat("Alto");
            float Ancho = resultado.getFloat("Ancho");
            float Largo = resultado.getFloat("Largo");
            float CalibreFlauta = resultado.getFloat("CalibreFlauta");
            float Medidas = resultado.getFloat("Medidas");

            
            NodoIngreso nodo = new NodoIngreso(FechaDe_R_OP, Almacen, FechaDe_R_OP, FechaSalidaCliente, ProgramadaCheckList, R_OP, OrdenCompra, OrdenCompraProvedor, Modelo, TipoEntregar, ClaveIdentificador, R_OP2, Clave, Provedor, Cliente, NumPedidoProvedor, ClaveProducto, Tarimas, PiezaporBulto, TotalBultos, TotalPiezas, PiezasRequendas, Paletizado, CamaPorPaletA1, CamaPorPaletA2, EstibasPorPalet, TotalPiezasFinal, Alto, Ancho, Largo, CalibreFlauta, Medidas);
            
            lista.insertar(nodo);
        }
        
        stmt.close();
        
        return lista.toObject();
    }
    
    public Object[] obtenerTodoElInventario() throws SQLException{
        ListaInventario lista = new ListaInventario();
        
        stmt = conexion.createStatement();
        
        String busquedaUsuario = "SELECT * FROM Inventario";
        
        ResultSet resultado = stmt.executeQuery(busquedaUsuario);
        
        while(resultado.next()){
            
            String Lugar = resultado.getString("Lugar");
            int NumTarimas = resultado.getInt("NumTarimas");
            String Clave = resultado.getString("Clave");
            String Cliente = resultado.getString("Cliente");
            String Modelo = resultado.getString("Modelo");
            int PzBulto = resultado.getInt("PzBulto");
            int TotalBultos = resultado.getInt("TotalBultos");
            int PzExtras = resultado.getInt("PzExtras");
            int TotalPiezas = resultado.getInt("TotalPiezas");
            String Nota = resultado.getString("Nota");


            NodoInventario nodo = new NodoInventario(Lugar, NumTarimas, Clave, Cliente, Modelo, PzBulto, TotalBultos, PzExtras, TotalPiezas, Nota);
            
            lista.insertar(nodo);
        }
        
        stmt.close();
        
        return lista.toObject();
    }
    
    public Object[] obtenerTodosLasSalidas() throws SQLException{
        ListaSalida lista = new ListaSalida();
        
        stmt = conexion.createStatement();
        
        String busquedaUsuario = "SELECT * FROM Salida";
        
        ResultSet resultado = stmt.executeQuery(busquedaUsuario);
        
        while(resultado.next()){
            String Lugar = resultado.getString("Lugar");
            int NumDeTarimas = resultado.getInt("NumDeTarimas");
            int R_OP = resultado.getInt("R_OP");
            String Clave = resultado.getString("Clave");
            String Cliente = resultado.getString("Cliente");
            String Modelo = resultado.getString("Modelo");
            int PiezaPorBulto = resultado.getInt("PiezaPorBulto");
            int TotalBultos = resultado.getInt("TotalBultos");
            int PiezasExtras = resultado.getInt("PiezasExtras");
            int TotalPiezas = resultado.getInt("TotalPiezas");

            NodoSalida nodo = new NodoSalida(Lugar, NumDeTarimas, R_OP, Clave, Cliente, Modelo, PiezaPorBulto, TotalBultos, PiezasExtras, TotalPiezas);
            
            lista.insertar(nodo);
        }
        
        stmt.close();
        return lista.toObject();
    }
}
