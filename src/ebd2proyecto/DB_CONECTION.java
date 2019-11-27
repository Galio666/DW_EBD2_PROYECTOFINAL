/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebd2proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tomas
 */
public class DB_CONECTION {

    String url;
    static String user = "system";
    static String pass = "oracle";

    static Connection conn = null;

    public DB_CONECTION() {
        this(user, pass);
    }

    public DB_CONECTION(String user, String pass) {

        url = "jdbc:oracle:thin:@localhost:1521:XE";

        if (conn == null) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                DB_CONECTION.user = user;
                DB_CONECTION.pass = pass;
                
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Conexion exitosa:");
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        } else {
            try {

                conn.close();
                DB_CONECTION.user = user;
                DB_CONECTION.pass = pass;
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        }

    }

    public Statement getStatement() {
        try {
            if (!conn.isClosed()) {
                return conn.createStatement();
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;
    }

    static String getUser() {
        return user;
    }

    static String getURL() {
        return user;
    }

    public Connection getConexion() {
        return conn;
    }

    public void closeConexion() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
