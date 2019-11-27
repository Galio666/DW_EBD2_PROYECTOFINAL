/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebd2proyecto;

/**
 *
 * @author Tomas
 */
public class Reportes {

    String fecha;
     java.math.BigDecimal precio;
      java.math.BigDecimal  maximo;
      java.math.BigDecimal  minimo;
     String volumen;
     
     

    public Reportes(String fecha,  java.math.BigDecimal  precio,  java.math.BigDecimal  maximo,  java.math.BigDecimal  minimo) {
        this.fecha = fecha;
        this.precio = precio;
        this.maximo = maximo;
        this.minimo = minimo;
    }

    public Reportes(String fecha, String volumen) {
        this.fecha = fecha;
        this.volumen = volumen;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the precio
     */
    public  java.math.BigDecimal  getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio( java.math.BigDecimal  precio) {
        this.precio = precio;
    }

    /**
     * @return the maximo
     */
    public  java.math.BigDecimal  getMaximo() {
        return maximo;
    }

    /**
     * @param maximo the maximo to set
     */
    public void setMaximo( java.math.BigDecimal  maximo) {
        this.maximo = maximo;
    }

    /**
     * @return the minimo
     */
    public  java.math.BigDecimal  getMinimo() {
        return minimo;
    }

    /**
     * @param minimo the minimo to set
     */
    public void setMinimo( java.math.BigDecimal  minimo) {
        this.minimo = minimo;
    }

    /**
     * @return the volumen
     */
    public String getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

}
