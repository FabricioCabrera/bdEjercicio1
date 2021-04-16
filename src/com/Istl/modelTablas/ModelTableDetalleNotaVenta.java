package com.Istl.modelTablas;

import com.Istl.modelos.ProductoVenta;
import com.Istl.vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableDetalleNotaVenta extends AbstractTableModel {

    //Arreglo con el nombre de las columnas
    public String[] m_colNames = {"Cantidad", "Descripcion", "Subtotal", " Total"};

    public List<ProductoVenta> producto_venta;
    private final GestionContable gcontable;

    //Cuando se vaya a editar
    public ModelTableDetalleNotaVenta(List<ProductoVenta> producto_venta, GestionContable gcontable) {
        this.producto_venta = producto_venta;
        this.gcontable = gcontable;
    }

    //Determina el número de filas que tengo en mi tabla
    @Override
    public int getRowCount() {
        return producto_venta.size();
    }

    //Determina el número de columnas que tengo en mi tabla
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProductoVenta producto = producto_venta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return producto.getCantidad();
            case 1:
                return producto.getDescripcionInventario();
            case 2:
                return producto.getSubtotal();
            case 3:
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
        gcontable.clickNotaVenta(producto_venta.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ProductoVenta> getProducto_venta() {
        return producto_venta;
    }

    public void setProducto_venta(List<ProductoVenta> producto_venta) {
        this.producto_venta = producto_venta;
    }

}
