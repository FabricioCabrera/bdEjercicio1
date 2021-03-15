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
    private JTextField txtCantidad;
    private JTextField txtDescripcion;
    private JTextField txtPreciosiniva;
    private JTextField txtPrecioconiva;
    private JTextField txtPreciomayorista;
    private JTextField txtPrecioclifijo;
    private JTextField txtPrecioclinormal;
    private Utilidades utilidades;
    private JFrame frameGestionContable;

    public GestionInventario(JTextField txtCodigoPro, JTextField txtCantidad, JTextField txtDescripcion, JTextField txtPreciosiniva, JTextField txtPrecioconiva, JTextField txtPreciomayorista, JTextField txtPrecioclifijo, JTextField txtPrecioclinormal, Utilidades utilidades, JFrame frameGestionContable) {
        this.txtCodigoPro = txtCodigoPro;
        this.txtCantidad = txtCantidad;
        this.txtDescripcion = txtDescripcion;
        this.txtPreciosiniva = txtPreciosiniva;
        this.txtPrecioconiva = txtPrecioconiva;
        this.txtPreciomayorista = txtPreciomayorista;
        this.txtPrecioclifijo = txtPrecioclifijo;
        this.txtPrecioclinormal = txtPrecioclinormal;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getTxtCodigoPro() {
        return txtCodigoPro;
    }

    public void setTxtCodigoPro(JTextField txtCodigoPro) {
        this.txtCodigoPro = txtCodigoPro;
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    public JTextField getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(JTextField txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public JTextField getTxtPrecioconiva() {
        return txtPrecioconiva;
    }

    public void setTxtPrecioconiva(JTextField txtPrecioconiva) {
        this.txtPrecioconiva = txtPrecioconiva;
    }

    public JTextField getTxtPreciosiniva() {
        return txtPreciosiniva;
    }

    public void setTxtPreciosiniva(JTextField txtPreciosiniva) {
        this.txtPreciosiniva = txtPreciosiniva;
    }

    public JTextField getTxtPreciomayorista() {
        return txtPreciomayorista;
    }

    public void setTxtPreciomayorista(JTextField txtPreciomayorista) {
        this.txtPreciomayorista = txtPreciomayorista;
    }

    public JTextField getTxtPrecioclifijo() {
        return txtPrecioclifijo;
    }

    public void setTxtPrecioclifijo(JTextField txtPrecioclifijo) {
        this.txtPrecioclifijo = txtPrecioclifijo;
    }

    public JTextField getTxtPrecioclinormal() {
        return txtPrecioclinormal;
    }

    public void setTxtPrecioclinormal(JTextField txtPrecioclinormal) {
        this.txtPrecioclinormal = txtPrecioclinormal;
    }

    public Utilidades getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(Utilidades utilidades) {
        this.utilidades = utilidades;
    }

    public JFrame getFrameGestionContable() {
        return frameGestionContable;
    }

    public void setFrameGestionContable(JFrame frameGestionContable) {
        this.frameGestionContable = frameGestionContable;
    }

    public void limpiarCampos() {
        txtCodigoPro.setText("");
        txtCantidad.setText("");
        txtDescripcion.setText("");
        txtPreciosiniva.setText("");
        txtPrecioconiva.setText("");
        txtPreciomayorista.setText("");
        txtPrecioclifijo.setText("");
        txtPrecioclinormal.setText("");
        txtCodigoPro.requestFocus();
    }

    public inventario guardarEditar() {
        if (txtCodigoPro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo codigo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCodigoPro.requestFocus();// Sirve para ubicar el cursor en un campo vacio.
            return null;
        }
        if (txtCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo cantidad no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCantidad.requestFocus();
            return null;
        }
        if (txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo descripcion no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDescripcion.requestFocus();
            return null;
        }

        if (txtPreciosiniva.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio sin iva no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtPreciosiniva.requestFocus();
            return null;
        }
        if (txtPrecioconiva.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio con iva no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtPrecioconiva.requestFocus();
            return null;
        }
        if (txtPreciomayorista.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio mayorista no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtPreciomayorista.requestFocus();
            return null;
        }
        if (txtPrecioclifijo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio cliente fijo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtPrecioclifijo.requestFocus();
            return null;
        }
        if (txtPrecioclinormal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio cliente normal no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtPrecioclinormal.requestFocus();
            return null;
        }

        inventario invent = new inventario();
        invent.setCodigo_pro(txtCodigoPro.getText());
        invent.setCan_productos(txtCantidad.getText());
        invent.setDescripcion(txtDescripcion.getText());
        invent.setPrecio_siniva(Double.parseDouble(txtPreciosiniva.getText()));
        invent.setPrecio_coniva(Double.parseDouble(txtPrecioconiva.getText()));
        invent.setPrecio_mayorista(Double.parseDouble(txtPreciomayorista.getText()));
        invent.setPrecio_clifijo(Double.parseDouble(txtPrecioclifijo.getText()));
        invent.setPrecio_clinormal(Double.parseDouble(txtPrecioclinormal.getText()));
        return invent;
    }

}
