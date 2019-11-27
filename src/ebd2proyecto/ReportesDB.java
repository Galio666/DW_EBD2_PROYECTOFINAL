/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebd2proyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class ReportesDB {
    Reportes reportes;
    DB_CONECTION conection;
    

    public ReportesDB() {
        conection = new DB_CONECTION();
    }

    public ArrayList<Reportes> getReporteMensual2016() {
        ArrayList<Reportes> reporte;
        reporte = new ArrayList<Reportes>();

        Statement sent = conection.getStatement();

        if (sent == null) 
            return reporte;
        

        String strSQL = "SELECT FECHA,PRECIO,MAXIMO,MINIMO FROM BTC_MENSUAL WHERE FECHA LIKE '%16'";
        try {
            ResultSet rs = sent.executeQuery(strSQL);

            //Si exite solo un empleado con el nombre dado
            while (rs.next()) {

                String FECHA = rs.getString("FECHA");
                java.math.BigDecimal PRECIO = rs.getBigDecimal("PRECIO");
                java.math.BigDecimal MINIMO = rs.getBigDecimal("MAXIMO");
                java.math.BigDecimal MAXIMO = rs.getBigDecimal("MINIMO");

                reportes = new Reportes(FECHA,PRECIO,MAXIMO,MINIMO);

                reportes.fecha=FECHA;
                reportes.precio=PRECIO;
                reportes.minimo=MINIMO;
                reportes.maximo=MAXIMO;
                
                reporte.add(reportes);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage()+"Query"+strSQL);
        }

        return reporte;

    }

    public ArrayList<Reportes> getReporteMensual2017() {
        ArrayList<Reportes> reporte;
        reporte = new ArrayList<>();

        Statement sent = conection.getStatement();

        if (sent == null) {
            return reporte;
        }

        String strSQL = "SELECT FECHA,PRECIO,MAXIMO,MINIMO FROM BTC_MENSUAL where FECHA LIKE '%17'";
        try {
            ResultSet rs = sent.executeQuery(strSQL);

            //Si exite solo un empleado con el nombre dado
            while (rs.next()) {

                String FECHA = rs.getString("FECHA");
                java.math.BigDecimal PRECIO = rs.getBigDecimal("PRECIO");
               java.math.BigDecimal MINIMO = rs.getBigDecimal("MAXIMO");
               java.math.BigDecimal MAXIMO = rs.getBigDecimal("MINIMO");

                reportes = new Reportes(FECHA, PRECIO, MAXIMO, MINIMO);

                reportes.fecha=FECHA;
                reportes.precio=PRECIO;
                reportes.minimo=MINIMO;
                reportes.maximo=MAXIMO;
                reporte.add(reportes);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return reporte;

    }

    public ArrayList<Reportes> getReporteMensual2018() {
        ArrayList<Reportes> reporte;
        reporte = new ArrayList<>();

        Statement sent = conection.getStatement();

        if (sent == null) {
            return reporte;
        }

        String strSQL = "SELECT FECHA,PRECIO,MINIMO,MAXIMO FROM BTC_MENSUAL where FECHA LIKE '%18'";
        try {
            ResultSet rs = sent.executeQuery(strSQL);

            //Si exite solo un empleado con el nombre dado
            while (rs.next()) {

                String FECHA = rs.getString("FECHA");
                java.math.BigDecimal PRECIO = rs.getBigDecimal("PRECIO");
               java.math.BigDecimal MINIMO = rs.getBigDecimal("MINIMO");
               java.math.BigDecimal MAXIMO = rs.getBigDecimal("MAXIMO");

                reportes = new Reportes(FECHA, PRECIO, MAXIMO, MINIMO);

                reportes.fecha=FECHA;
                reportes.precio=PRECIO;
                reportes.minimo=MINIMO;
                reportes.maximo=MAXIMO;
                reporte.add(reportes);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return reporte;

    }

    public ArrayList<Reportes> getReporteMensual2019() {
        ArrayList<Reportes> reporte;
        reporte = new ArrayList<>();

        Statement sent = conection.getStatement();

        if (sent == null) {
            return reporte;
        }

        String strSQL = "SELECT FECHA,PRECIO,MINIMO,MAXIMO FROM BTC_MENSUAL where FECHA LIKE '%19'";
        try {
            ResultSet rs = sent.executeQuery(strSQL);

            //Si exite solo un empleado con el nombre dado
            while (rs.next()) {

                String FECHA = rs.getString("FECHA");
                java.math.BigDecimal PRECIO = rs.getBigDecimal("PRECIO");
               java.math.BigDecimal MINIMO = rs.getBigDecimal("MINIMO");
               java.math.BigDecimal MAXIMO = rs.getBigDecimal("MAXIMO");

                reportes = new Reportes(FECHA, PRECIO, MAXIMO, MINIMO);

                reportes.fecha=FECHA;
                reportes.precio=PRECIO;
                reportes.minimo=MINIMO;
                reportes.maximo=MAXIMO;
                reporte.add(reportes);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return reporte;

    }

    public ArrayList<Reportes> getReporteMensual1619() {

        ArrayList<Reportes> reporte;
        reporte = new ArrayList<>();

        Statement sent = conection.getStatement();

        if (sent == null) {
            return reporte;
        }

        String strSQL = "SELECT FECHA,PRECIO,MINIMO,MAXIMO FROM BTC_MENSUAL";
        try {
            ResultSet rs = sent.executeQuery(strSQL);

            //Si exite solo un empleado con el nombre dado
            while (rs.next()) {

                String FECHA = rs.getString("FECHA");
                java.math.BigDecimal PRECIO = rs.getBigDecimal("PRECIO");
               java.math.BigDecimal MINIMO = rs.getBigDecimal("MINIMO");
               java.math.BigDecimal MAXIMO = rs.getBigDecimal("MAXIMO");

                reportes = new Reportes(FECHA, PRECIO, MAXIMO, MINIMO);

                reportes.fecha=FECHA;
                reportes.precio=PRECIO;
                reportes.minimo=MINIMO;
                reportes.maximo=MAXIMO;
                reporte.add(reportes);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return reporte;

    }

    public ArrayList<Reportes> getReporteVolumen() {

        ArrayList<Reportes> reporte;
        reporte = new ArrayList<>();

        Statement sent = conection.getStatement();

        if (sent == null) {
            return reporte;
        }

        String strSQL = "SELECT FECHA,VOLUMEN FROM BTC_MENSUAL";
        try {
            ResultSet rs = sent.executeQuery(strSQL);

            //Si exite solo un empleado con el nombre dado
            while (rs.next()) {

                String FECHA = rs.getString("FECHA");
                String VOLUMEN = rs.getString("VOLUMEN");

                reportes = new Reportes(FECHA, VOLUMEN);

               reportes.fecha=FECHA;
               reportes.volumen=VOLUMEN;
                reporte.add(reportes);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return reporte;

    }

}
