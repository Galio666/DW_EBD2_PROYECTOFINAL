/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebd2proyecto;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Tomas
 */
public class GraficarTable extends  AbstractTableModel implements TableModelListener{
    
    ArrayList<Reportes> lista;
    String[] encabezados;
    
    public GraficarTable()
    {
        lista  = new ArrayList<>();
        encabezados = new String[4];
        encabezados[0] = "FECHA";
        encabezados[1] = "PRECIO";
        encabezados[2] = "MINIMO";
        encabezados[3]="MAXIMO";
     
    }
    
    
    
    public GraficarTable(ArrayList<Reportes>lista)
    {
        this();
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return encabezados.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex >= 0 && columnIndex < encabezados.length)
            return encabezados[columnIndex];
        
        return "Sin Nombre";
    }

    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Reportes tall = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return tall.fecha;
            case 1: return  tall.precio;
            case 2: return  tall.minimo;
            case 3: return tall.maximo;
            
                        
            default: return "No emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        Reportes tall = lista.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:  tall.fecha = (String)aValue;
                     break;
            case 1: tall.precio= (BigDecimal)aValue;
                     break;
            case 2: tall.minimo= (BigDecimal)aValue;
                     break;
            case 3: tall.maximo=(BigDecimal)aValue;         
        
            
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }
    
    
}
