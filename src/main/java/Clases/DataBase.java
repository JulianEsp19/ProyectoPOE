package Clases;
import java.sql.*;

public class DataBase {
    
    //Direccion de la base de datos
    private final String direccionBaseDatos = "jdbc:sqlite:baseDeDatos.db";
    //Objeto en el que se va a contener la conexion con la base de datos
    protected Connection conexion;
    //Objeto con el que se van a ejecutar comandos sql
    protected Statement stmt;   

    public DataBase() {
        this.conexion = null;
        this.stmt = null;
        conectar();
    }
    
    //Funcion para conectar con la base de datos
    public void conectar(){
        try{
            //Se agrega la clase de la libreria donde se va a estar ejecutando sql
            Class.forName("org.sqlite.JDBC");
            //Se hace la conexion a la base de datos
            conexion = DriverManager.getConnection(direccionBaseDatos);
            crearTablas();
        }catch(Exception e){
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
        }
        System.out.println("open data base");
    }
    
    //Funcion para crear las tablas de la base de datos
    private void crearTablas(){
        try{
            //Inicializacion de ejecutador
            stmt = conexion.createStatement();
            String verificacion = "SELECT name \n" +
                "FROM sqlite_master \n" +
                "WHERE type = 'table' \n" +
                "AND name =";
            ResultSet resultado = null;
            boolean comprobacion = false;
            
            /* try con dos acciones la de hacer la consulta para observar si es que
            la tabla existe y la segunda una variable booleana que guarda un true
            o false con este hecho, pero si es que la tabla no existe al querer usar 
            la variable booleana soltara un error porque la tabla no tiene valores
            lo cual hace pasar al catch que creara la tabla*/
            try{
                resultado = stmt.executeQuery(verificacion + "'Usuarios'");
                comprobacion = resultado.getString(1).equals("Usuarios");
            }catch(Exception e){
                crearTablaUsuarios();
            }
            
            try{
            resultado = stmt.executeQuery(verificacion + "'Salida'");
            comprobacion = resultado.getString(1).equals("Salida");
            }catch(Exception e){
                crearTablaSalida();
            }
            
            try{
                resultado = stmt.executeQuery(verificacion + "'Inventario'");
                comprobacion = resultado.getString(1).equals("Inventario");
            }catch(Exception e){
                crearTablaInventario();
            }
            
            try{
                resultado = stmt.executeQuery(verificacion + "'Ingresos'");
                comprobacion = resultado.getString(1).equals("Ingresos");
            }catch(Exception e){
                crearTablaIngresos();
            }
            
            
            //Cierre de ejecutador
            stmt.close();
        }catch(Exception e){
            System.out.println("" + e.getMessage() + "");
        }
    }
    
    private void crearTablaUsuarios() throws SQLException{
        //String en comando sql para la primera tabla
                String primeraTabla = "CREATE TABLE Usuarios"+
                        "("+
                        "NombreUsuario            TEXT      NOT NULL,"+
                        "ContrasenaUsuario        TEXT      NOT NULL,"+
                        "TipoAcceso               BOOL       NOT NULL"+
                        ")";
                //Ejecucion de codigo sql
                stmt.execute(primeraTabla);
    }
    
    private void crearTablaSalida() throws SQLException{
        String segundaTabla = "CREATE TABLE Salida"+
                        "("+ 
                        "Lugar                   TEXT,"+
                        "NumDeTarimas            INT,"+
                        "R_OP                    INT,"+
                        "Clave                   TEXT,"+
                        "Cliente                 TEXT,"+
                        "Modelo                  TEXT,"+
                        "PiezaPorBulto           INT,"+
                        "TotalBultos             INT,"+
                        "PiezasExtras            INT,"+
                        "TotalPiezas             INT"+
                        ")";
                stmt.execute(segundaTabla); 
    }
    
    private void crearTablaInventario() throws SQLException{
        
                String tercerTabla = "CREATE TABLE Inventario"+
                        "("+
                        "Lugar                    TEXT,"+
                        "NumTarimas               INT,"+
                        "Clave                    TEXT,"+
                        "Cliente                  TEXT,"+
                        "Modelo                   TEXT,"+
                        "PzBulto                  INT,"+
                        "TotalBultos              INT,"+
                        "PzExtras                 INT,"+
                        "TotalPiezas              INT,"+
                        "Nota                     TEXT"+
                        ")";

                stmt.execute(tercerTabla);
    }
    
    private void crearTablaIngresos() throws SQLException{
        
                String cuartaTabla = "CREATE TABLE Ingresos"+
                        "("+
                        "FechaIngreso              TEXT,"+
                        "Almacen                   TEXT,"+
                        "FechaDE_R_OP              TEXT,"+
                        "FechaSalidaCliente        TEXT,"+
                        "ProgramadaCheckList       TEXT,"+
                        "NumPedidoProvedor         INT,"+
                        "R_OP                      TEXT,"+
                        "OrdenCompra               TEXT,"+
                        "OrdenCompraProvedor       TEXT,"+
                        "Alto                      FLOAT,"+
                        "Ancho                     FLOAT,"+
                        "Largo                     FLOAT,"+
                        "CalibreFlauta             FLOAT,"+
                        "Medidas                   FLOAT,"+
                        "ClaveProducto             INT,"+
                        "Modelo                    TEXT,"+
                        "TipoEntregar              TEXT,"+
                        "ClaveIdentificador        TEXT,"+
                        "R_0P2                     TEXT,"+
                        "Clave                     TEXT,"+
                        "Provedor                  TEXT,"+
                        "Cliente                   TEXT,"+
                        "Tarimas                   INT,"+
                        "PiezasporBulto            INT,"+
                        "TotalBultos               INT,"+
                        "TotalPiezas               INT,"+
                        "PiezasRequendas           INT,"+
                        "Paletizado                INT,"+
                        "CamaPorPaletA1            INT,"+
                        "CamaPorpaIetA2            INT,"+
                        "EstibasPorPalet           INT,"+
                        "TotalPiezasFinaI          INT"+
                        ")";

                stmt.execute(cuartaTabla);
            
    }
}
