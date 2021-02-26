/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Istl.vistas;

import com.Istl.modelos.Persona;
import com.Istl.modelos.inventario;
import com.Istl.utilidades.Utilidades;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author johnp
 */
public class GestionInventario {

    private JTextField txtCodigoPro;
    private JTextField txtDescripcion;
    private JTextField txtPreciosCompra;
    private JTextField txtPrecioVenta;
    private JTextField txtCantidad;
    private Utilidades utilidades;
    private JFrame frameGestionContable;

    public GestionInventario(JTextField txtCodigoPro, JTextField txtDescripcion, JTextField txtPreciosCompra, JTextField txtPrecioVenta, JTextField txtCantidad, Utilidades utilidades, JFrame frameGestionContable) {
        this.txtCodigoPro = txtCodigoPro;
        this.txtDescripcion = txtDescripcion;
        this.txtPreciosCompra = txtPreciosCompra;
        this.txtPrecioVenta = txtPrecioVenta;
        this.txtCantidad = txtCantidad;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getTxtCodigoPro() {
        return txtCodigoPro;
    }

    public void setTxtCodigoPro(JTextField txtCodigoPro) {
        this.txtCodigoPro = txtCodigoPro;
    }

    public JTextField getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(JTextField txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public JTextField getTxtPreciosCompra() {
        return txtPreciosCompra;
    }

    public void setTxtPreciosCompra(JTextField txtPreciosCompra) {
        this.txtPreciosCompra = txtPreciosCompra;
    }

    public JTextField getTxtPrecioVenta() {
        return txtPrecioVenta;
    }

    public void setTxtPrecioVenta(JTextField txtPrecioVenta) {
        this.txtPrecioVenta = txtPrecioVenta;
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    public void limpiarCampos() {
        txtCodigoPro.setText("");
        txtDescripcion.setText("");
        txtPreciosCompra.setText("");
        txtPrecioVenta.setText("");
        txtCantidad.setText("");
        txtCodigoPro.requestFocus();
    }

    public inventario guardarEditar() {
        if (txtCodigoPro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo codigo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCodigoPro.requestFocus();// Sirve para ubicar el cursor en un campo vacio.
            return null;
        }
        if (txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo descripcion no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDescripcion.requestFocus();
            return null;
        }
        if (txtPreciosCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precios compra no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtPreciosCompra.requestFocus();
            return null;
        }
        if (txtPrecioVenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio venta no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtPrecioVenta.requestFocus();
            return null;
        }
        if (txtCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo cantidad no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCantidad.requestFocus();
            return null;
        }
        
        inventario invent = new inventario();
        invent.setCodigo_pro(txtCodigoPro.getText());
        invent.setDescripcion(txtDescripcion.getText());
        invent.setPrecio_venta(txtPreciosCompra.getText());
        invent.setPrecios_compra(txtPrecioVenta.getText());
        invent.setCan_productos(txtCantidad.getText());

        return invent;
    }

}
