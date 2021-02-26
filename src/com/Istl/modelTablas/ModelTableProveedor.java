package com.Istl.modelTablas;

import com.Istl.modelos.Proveedor;
import com.Istl.vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableProveedor extends AbstractTableModel {

    //Arreglo con el nombre de las columnas
    public String[] m_colNames = {"Ruc", "Razon Social", " Tipo Actividad", "Nombre representante legal",
        "Apellido representante legal", " Correo", " Teléfono"};

    public List<Proveedor> proveedores;
    private final GestionContable gcontable;

    public ModelTableProveedor(List<Proveedor> proveedor, GestionContable gcontable) {
        this.proveedores = proveedor;
        this.gcontable = gcontable;
    }

    //Determina el número de filas que tengo en mi tabla
    @Override
    public int getRowCount() {
        return proveedores.size();
    }

    //Determina el número de columnas que tengo en mi tabla
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proveedor persona = proveedores.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return persona.getRuc();
            case 1:
                return persona.getRazon_social();
            case 2:
                return persona.getTipoActividad();
            case 3:
                return persona.getNombre_representante_legal();
            case 4:
                return persona.getApellido_representante_legal();
            case 5:
                return persona.getCorreo();
            case 6:
                return persona.getTelefono();
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
        gcontable.clickProveedor(proveedores.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

}
