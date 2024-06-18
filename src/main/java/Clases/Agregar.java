package Clases;

import Src.Atributos;
import java.sql.*;

public class Agregar extends DataBase{

    public Agregar() {
    }
    
    //Funcion para agregar nuevos usarios a la base de datos
    public void agregarUsuario(Usuario usuario) throws SQLException {
        stmt = conexion.createStatement();
        
        String sqlUsuario = "INSERT INTO Usuarios (NombreUsuario, ContrasenaUsuario, TipoAcceso)" +
                "VALUES ('"+usuario.getUsuario() +"','"+ usuario.getContrasena() +"',"+ usuario.getTipoAcceso() + ")";
        
        stmt.execute(sqlUsuario);
        stmt.close();
    }
    
    public void agregarIngresos(Ingresos ingreso) throws SQLException{
        stmt = conexion.createStatement();
        
        String[] atributos = Atributos.Ingresos;
        
        String insertarIngreso = "INSERT INTO Ingresos (";
        
        for (int i = 0; i < atributos.length-1; i++) {
            insertarIngreso += atributos[i] + ",";
        }
        
        insertarIngreso += atributos[atributos.length-1] + ") VALUES ("+
                "'" + ingreso.getFechaIngreso() + "', " +
                "'" + ingreso.getAlmacen() + "', " +
                "'" + ingreso.getFechaDe_R_OP() + "', " +
                "'" + ingreso.getFechaSalidaCliente() + "', " +
                "'" + ingreso.getProgramadaCheckList() + "', " +
                "'" + ingreso.getR_OP() + "', " +
                "'" + ingreso.getOrdenCompra() + "', " +
                "'" + ingreso.getOrdenCompraProvedor() + "', " +
                "'" + ingreso.getModelo() + "', " +
                "'" + ingreso.getTipoEntregar() + "', " +
                "'" + ingreso.getClaveIdentificador() + "', " +
                "'" + ingreso.getR_OP2() + "', " +
                "'" + ingreso.getClave() + "', " +
                "'" + ingreso.getProvedor() + "', " +
                "'" + ingreso.getCliente() + "', " +
                ingreso.getNumPedidoProvedor() + ", " +
                ingreso.getClaveProducto() + ", " +
                ingreso.getTarimas() + ", " +
                ingreso.getPiezaporBulto() + ", " +
                ingreso.getTotalBultos() + ", " +
                ingreso.getTotalPiezas() + ", " +
                ingreso.getPiezasRequendas() + ", " +
                ingreso.getPaletizado() + ", " +
                ingreso.getCamaPorPaletA1() + ", " +
                ingreso.getCamaPorPaletA2() + ", " +
                ingreso.getEstibasPorPalet() + ", " +
                ingreso.getTotalPiezasFinal() + ", " +
                ingreso.getAlto() + ", " +
                ingreso.getAncho() + ", " +
                ingreso.getLargo() + ", " +
                ingreso.getCalibreFlauta() + ", " +
                ingreso.getMedidas() + ")";
        
        stmt.executeUpdate(insertarIngreso);
        stmt.close();
    }
    
    public void agregarInventario(Inventario inventario) throws SQLException{
        stmt = conexion.createStatement();
        
        String[] atributos = Atributos.Inventario;
        
        String insertarIngreso = "INSERT INTO Inventario (";
        
        for (int i = 0; i < atributos.length-1; i++) {
            insertarIngreso += atributos[i] + ",";
        }
        
        insertarIngreso += atributos[atributos.length-1] + ") VALUES ("+
                "'" + inventario.getLugar() + "', " +
                inventario.getNumTarimas() + ", " +
                "'" + inventario.getClave() + "', " +
                "'" + inventario.getCliente() + "', " +
                "'" + inventario.getModelo() + "', " +
                inventario.getPzBulto() + ", " +
                inventario.getTotalBultos() + ", " +
                inventario.getPzExtras() + ", " +
                inventario.getTotalPiezas() + ", " +
                "'" + inventario.getNota() + "'"+ ")";
        
        stmt.executeUpdate(insertarIngreso);
        stmt.close();
    }
    
    public void agregarSalida(Salida salida) throws SQLException{
        stmt = conexion.createStatement();
        
        String[] atributos = Atributos.Salida;
        
        String insertarIngreso = "INSERT INTO Salida (";
        
        for (int i = 0; i < atributos.length-1; i++) {
            insertarIngreso += atributos[i] + ",";
        }
        
        insertarIngreso += atributos[atributos.length-1] + ") VALUES ("+
                "'" + salida.getLugar() + "', " +
                salida.getNumDeTarimas() + ", " +
                salida.getR_OP() + ", " +
                "'" + salida.getClave() + "', " +
                "'" + salida.getCliente() + "', " +
                "'" + salida.getModelo() + "', " +
                salida.getPiezaPorBulto() + ", " +
                salida.getTotalBultos() + ", " +
                salida.getPiezasExtras() + ", " +
                salida.getTotalPiezas()+ ")";
        
        stmt.executeUpdate(insertarIngreso);
        stmt.close();
    }

}
