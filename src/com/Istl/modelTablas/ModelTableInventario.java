package com.Istl.modelTablas;

import com.Istl.modelos.inventario;
import com.Istl.vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableInventario extends AbstractTableModel {

    //Arreglo con el nombre de las columnas
    public String[] m_colNames = {"Cód Prod", " Cant prod","Descripcion","Precio siniva"," Precio coniva", " Precio mayorista", " Precio clifijo" ," Precio clinormal"};

    public List<inventario> inventario;
    private final GestionContable gcontable;

    public ModelTableInventario(List<inventario> inventario, GestionContable gcontable) {
        this.inventario = inventario;
        this.gcontable = gcontable;
    }

    //Determina el número de filas que tengo en mi tabla
    @Override
    public int getRowCount() {
        return inventario.size();
    }

    //Determina el número de columnas que tengo en mi tabla
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        inventario producto = inventario.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return producto.getCodigo_pro();
            case 1:
                return producto.getCan_productos();
            case 2:
                return producto.getDescripcion();
            case 3:
                return producto.getPrecio_siniva();
            case 4:
                return producto.getPrecio_coniva();
            case 5:
                return producto.getPrecio_mayorista();
            case 6:
                return producto.getPrecio_clifijo();
            case 7:
                return producto.getPrecio_clinormal();
        }
        return new String();
    }

    //Sirve para definir los nombres de las columnas
    @Override
    public String getColumnName(int column) {
        return m_colNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        gcontable.clickInventario(inventario.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    public List<inventario> getInventario() {
        return inventario;
    }

    public void setInventario(List<inventario> inventario) {
        this.inventario = inventario;
    }

}
