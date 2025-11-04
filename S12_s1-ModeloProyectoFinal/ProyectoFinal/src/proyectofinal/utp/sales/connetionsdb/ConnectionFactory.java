/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.utp.sales.connetionsdb;

/**
 *
 * @author Administrador
 */
public class ConnectionFactory {

    public enum DBType {
        MYSQL,
        SQLSERVER
    }

    public static IConnection getConnection(DBType dbType) {

        switch (dbType) {
            case MYSQL:
                return new ConnetionMYSQL();

            case SQLSERVER:
                return new ConnectionSQLServer();

            default:
                throw new AssertionError();
        }

    }
}
