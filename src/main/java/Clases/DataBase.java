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
    //ADVERTENCIA: aun falta encontrar la forma de verificar si existen las tablas
    //antes de ejecutar, para asi no perder recursos haciendolo
    private void crearTablas(){
        try{
            //Inicializacion de ejecutador
            stmt = conexion.createStatement();
            //String en comando sql para la primera tabla
            String primeraTabla = "CREATE TABLE Usuarios"+
                    "("+
                    "ID_Usuario INT PRIMARY   KEY       NOT NULL," +
                    "NombreUsuario            TEXT      NOT NULL,"+
                    "ContrasenaUsuario        TEXT      NOT NULL,"+
                    "TipoAcceso               INT       NOT NULL"+
                    ")";
            String segundTabla = "CREATE TABLE ########"+  //Se pondra el nombre de la tabla 
                    "("+ /* y se agregaran las columnas necesarias para su acceso 
                    Donde sera a partir de la siguiente sintaxis:
                    NombreColumna  TipoDeDato
                    basicamente ya si el campo se necesitara que se llene se pone NOT NULL*/
                    ")";
            
            String tercerTabla = "CREATE TABLE ##########";
            
            //Ejecucion de codigo sql
            stmt.execute(primeraTabla);
            //Cierre de ejecutador
            stmt.close();
        }catch(Exception e){
            System.out.println("" + e.getMessage() + "");
        }
    }
}
