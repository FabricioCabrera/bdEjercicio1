package com.Istl.modelTablas;

import com.Istl.modelos.Proveedor;
import com.Istl.vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableProveedor extends AbstractTableModel {

    //Arreglo con el nombre de las columnas
    public String[] m_colNames = {"Ruc", "Razon Social", " Tipo Actividad", "Nombre representante legal",
        "Apellido representante legal", " Teléfono", "Correo"};

    public List<Proveedor> proveedor;
    private final GestionContable gcontable;

    public ModelTableProveedor(List<Proveedor> proveedor, GestionContable gcontable) {
        this.proveedor = proveedor;
        this.gcontable = gcontable;
    }

    //Determina el número de filas que tengo en mi tabla
    @Override
    public int getRowCount() {
        return proveedor.size();
    }

    //Determina el número de columnas que tengo en mi tabla
    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proveedor persona = proveedor.get(rowIndex);
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
                return persona.getTelefono();
            case 6:
                return persona.getCorreo();
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
        gcontable.clickProveedor(proveedor.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Proveedor> getProveedor() {
        return proveedor;
    }

    public void setProveedor(List<Proveedor> proveedor) {
        this.proveedor = proveedor;
    }

  

}
