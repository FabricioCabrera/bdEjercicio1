package com.Istl.modelTablas;

import com.Istl.modelos.detalleNotaVenta;
import com.Istl.vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableDetalleNotaVenta extends AbstractTableModel {

    //Arreglo con el nombre de las columnas
    public String[] m_colNames = {"Codigo", "Descripcion", "Cant", "Precio", " PrecioTotal"};

    public List<detalleNotaVenta> detalleNotaVenta;
    private final GestionContable gcontable;

    //Cuando se vaya a editar
    public ModelTableDetalleNotaVenta(List<detalleNotaVenta> detalleNotaVenta, GestionContable gcontable) {
        this.detalleNotaVenta = detalleNotaVenta;
        this.gcontable = gcontable;
    }

    //Cuando se crea un nuevo detalle
    public ModelTableDetalleNotaVenta(GestionContable gcontable) {
        this.gcontable = gcontable;
    }

    //Determina el número de filas que tengo en mi tabla
    @Override
    public int getRowCount() {
        return detalleNotaVenta.size();
    }

    //Determina el número de columnas que tengo en mi tabla
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        detalleNotaVenta producto = detalleNotaVenta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return producto.getIdInventario();
            case 1:
                return producto.getDescripcionInventario();
            case 2:
                return producto.getCantidad();
            case 3:
                return producto.getPrecioUnitario();
            case 4:
                return producto.getPrecioTotal();
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
//        gcontable.clickInventario(detalleNotaVenta.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    public List<detalleNotaVenta> getDetalleNotaVenta() {
        return detalleNotaVenta;
    }

    public void setDetalleNotaVenta(List<detalleNotaVenta> detalleNotaVenta) {
        this.detalleNotaVenta = detalleNotaVenta;
    }

}
