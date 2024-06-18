package Clases;

import java.sql.SQLException;

public class Eliminar extends DataBase {

    public Eliminar() {
    }
    
    public void eliminarUsuario(String usuario) throws SQLException{
        stmt = conexion.createStatement();
        
        String eliminarUsuario = "DELETE FROM Usuarios WHERE "
                + "NombreUsuario='"+ usuario + "'";
        
        stmt.execute(eliminarUsuario);
        stmt.close();
    }
    
    public void eliminarIngreso(Ingresos ingreso) throws SQLException{
        stmt = conexion.createStatement();
        
        String sentenciaSQL = "DELETE FROM Ingresos WHERE " +
            "FechaIngreso = '" + ingreso.getFechaIngreso() + "' AND " +
            "Almacen = '" + ingreso.getAlmacen() + "' AND " +
            "FechaDe_R_OP = '" + ingreso.getFechaDe_R_OP() + "' AND " +
            "FechaSalidaCliente = '" + ingreso.getFechaSalidaCliente() + "' AND " +
            "ProgramadaCheckList = '" + ingreso.getProgramadaCheckList() + "' AND " +
            "R_OP = '" + ingreso.getR_OP() + "' AND " +
            "OrdenCompra = '" + ingreso.getOrdenCompra() + "' AND " +
            "OrdenCompraProvedor = '" + ingreso.getOrdenCompraProvedor() + "' AND " +
            "Modelo = '" + ingreso.getModelo() + "' AND " +
            "TipoEntregar = '" + ingreso.getTipoEntregar() + "' AND " +
            "ClaveIdentificador = '" + ingreso.getClaveIdentificador() + "' AND " +
            "R_OP2 = '" + ingreso.getR_OP2() + "' AND " +
            "Clave = '" + ingreso.getClave() + "' AND " +
            "Provedor = '" + ingreso.getProvedor() + "' AND " +
            "Cliente = '" + ingreso.getCliente() + "' AND " +
            "NumPedidoProvedor = " + ingreso.getNumPedidoProvedor() + " AND " +
            "ClaveProducto = " + ingreso.getClaveProducto() + " AND " +
            "Tarimas = " + ingreso.getTarimas() + " AND " +
            "PiezaporBulto = " + ingreso.getPiezaporBulto() + " AND " +
            "TotalBultos = " + ingreso.getTotalBultos() + " AND " +
            "TotalPiezas = " + ingreso.getTotalPiezas() + " AND " +
            "PiezasRequendas = " + ingreso.getPiezasRequendas() + " AND " +
            "Paletizado = " + ingreso.getPaletizado() + " AND " +
            "CamaPorPaletA1 = " + ingreso.getCamaPorPaletA1() + " AND " +
            "CamaPorPaletA2 = " + ingreso.getCamaPorPaletA2() + " AND " +
            "EstibasPorPalet = " + ingreso.getEstibasPorPalet() + " AND " +
            "TotalPiezasFinal = " + ingreso.getTotalPiezasFinal() + " AND " +
            "Alto = " + ingreso.getAlto() + " AND " +
            "Ancho = " + ingreso.getAncho() + " AND " +
            "Largo = " + ingreso.getLargo() + " AND " +
            "CalibreFlauta = " + ingreso.getCalibreFlauta() + " AND " +
            "Medidas = " + ingreso.getMedidas();
        
        stmt.execute(sentenciaSQL);
        stmt.close();
    }
    
    public void eliminarInventario(Inventario inventario) throws SQLException{
        stmt = conexion.createStatement();
        
        String sentenciaSQL = "DELETE FROM Inventario WHERE " +
            "Lugar = '" + inventario.getLugar() + "' AND " +
            "NumTarimas = " + inventario.getNumTarimas() + " AND " +
            "Clave = '" + inventario.getClave() + "' AND " +
            "Cliente = '" + inventario.getCliente() + "' AND " +
            "Modelo = '" + inventario.getModelo() + "' AND " +
            "PzBulto = " + inventario.getPzBulto() + " AND " +
            "TotalBultos = " + inventario.getTotalBultos() + " AND " +
            "PzExtras = " + inventario.getPzExtras() + " AND " +
            "TotalPiezas = " + inventario.getTotalPiezas() + " AND " +
            "Nota = '" + inventario.getNota() + "'";
        
        stmt.executeUpdate(sentenciaSQL);
        stmt.close();
    }
    
    public void eliminarSalida(Salida salida) throws SQLException{
        stmt = conexion.createStatement();
        
        String sentenciaSQL = "DELETE FROM Salida WHERE " +
            "Lugar = '" + salida.getLugar() + "' AND " +
            "NumDeTarimas = " + salida.getNumDeTarimas() + " AND " +
            "R_OP = " + salida.getR_OP() + " AND " +
            "Clave = '" + salida.getClave() + "' AND " +
            "Cliente = '" + salida.getCliente() + "' AND " +
            "Modelo = '" + salida.getModelo() + "' AND " +
            "PiezaPorBulto = " + salida.getPiezaPorBulto() + " AND " +
            "TotalBultos = " + salida.getTotalBultos() + " AND " +
            "PiezasExtras = " + salida.getPiezasExtras() + " AND " +
            "TotalPiezas = " + salida.getTotalPiezas();

        
        stmt.execute(sentenciaSQL);
        stmt.close();
    }
}
