package Clases;
import java.sql.*;

public class DataBase {
    
    private final String direccionBaseDatos = "jdbc:sqlite:baseDeDatos.db";
    protected Connection conexion;
    protected Statement stmt;   

    public DataBase() {
        this.conexion = null;
        this.stmt = null;
    }
    
    public void conectar(){
        try{
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection(direccionBaseDatos);
        }catch(Exception e){
            System.err.println(e.getClass().getName() + ":" + e.getMessage());
        }
        System.out.println("open data base");
    }
    
}
