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
public class VolumenTable extends  AbstractTableModel implements TableModelListener{
    
    ArrayList<Reportes> lista;
    String[] encabezados;
    
    public VolumenTable()
    {
        lista  = new ArrayList<>();
        encabezados = new String[2];
        encabezados[0] = "FECHA";
        encabezados[1] = "VOLUMEN";
        
     
    }
    
    
    
    public VolumenTable(ArrayList<Reportes>lista)
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
            case 1: return  tall.volumen;
            
            
                        
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
            case 1: tall.volumen= (String)aValue;
                     break;
                   
        
            
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }
}
