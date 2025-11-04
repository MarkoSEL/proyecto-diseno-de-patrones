/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.utp.sales.connetionsdb;
import java.sql.*;
/**
 *
 * @author Administrador
 */
public class ConnectionSQLServer implements IConnection{

    private static ConnectionSQLServer instance=null;
    private static Connection con;
    private static final String URL="";
    private static final String DRIVER="";
    private static final String USER="";
    private static final String PASS="";

    public ConnectionSQLServer() {
     
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASS);
            
        } catch (Exception e) {
            System.out.println("Error al conectar :"+e.getMessage());
        }
    
    }
    
   
    @Override
    public Boolean conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void desconectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
