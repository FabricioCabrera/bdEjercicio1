/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Istl.vistas;


import com.Istl.modelos.inventario;
import com.Istl.modelos.notaventa;
import com.Istl.utilidades.Utilidades;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author johnp
 */
public class Gestionnotaventa {

    private JTextField txtnotaventa;
    private JTextField txtcelulaorucnv;
    private JTextField txtnombrenv;
    private JTextField txtdireccionnv;
    private JTextField txttelefononv;
    private JDateChooser jDateChooser1;
    private JTextField txtproductonv;
    private JTextField txtcantidadproductonv;

    private Utilidades utilidades;
    private JFrame frameGestionContable;

    public Gestionnotaventa(JTextField txtnotaventa, JTextField txtcelulaorucnv, JTextField txtnombrenv, JTextField txtdireccionnv, JTextField txttelefononv, JDateChooser jDateChooser1, JTextField txtproductonv, JTextField txtcantidadproductonv, Utilidades utilidades, JFrame frameGestionContable) {
        this.txtnotaventa = txtnotaventa;
        this.txtcelulaorucnv = txtcelulaorucnv;
        this.txtnombrenv = txtnombrenv;
        this.txtdireccionnv = txtdireccionnv;
        this.txttelefononv = txttelefononv;
        this.jDateChooser1 = jDateChooser1;
        this.txtproductonv = txtproductonv;
        this.txtcantidadproductonv = txtcantidadproductonv;
        this.utilidades = utilidades;
        this.frameGestionContable = frameGestionContable;
    }

    public JTextField getTxtnotaventa() {
        return txtnotaventa;
    }

    public void setTxtnotaventa(JTextField txtnotaventa) {
        this.txtnotaventa = txtnotaventa;
    }

    public JTextField getTxtcelulaorucnv() {
        return txtcelulaorucnv;
    }

    public void setTxtcelulaorucnv(JTextField txtcelulaorucnv) {
        this.txtcelulaorucnv = txtcelulaorucnv;
    }

    public JTextField getTxtnombrenv() {
        return txtnombrenv;
    }

    public void setTxtnombrenv(JTextField txtnombrenv) {
        this.txtnombrenv = txtnombrenv;
    }

    public JTextField getTxtdireccionnv() {
        return txtdireccionnv;
    }

    public void setTxtdireccionnv(JTextField txtdireccionnv) {
        this.txtdireccionnv = txtdireccionnv;
    }

    public JTextField getTxttelefononv() {
        return txttelefononv;
    }

    public void setTxttelefononv(JTextField txttelefononv) {
        this.txttelefononv = txttelefononv;
    }

    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    public void setjDateChooser1(JDateChooser jDateChooser1) {
        this.jDateChooser1 = jDateChooser1;
    }

    public JTextField getTxtproductonv() {
        return txtproductonv;
    }

    public void setTxtproductonv(JTextField txtproductonv) {
        this.txtproductonv = txtproductonv;
    }

    public JTextField getTxtcantidadproductonv() {
        return txtcantidadproductonv;
    }

    public void setTxtcantidadproductonv(JTextField txtcantidadproductonv) {
        this.txtcantidadproductonv = txtcantidadproductonv;
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
        txtnotaventa.setText("");
        txtcelulaorucnv.setText("");
        txtnombrenv.setText("");
        txtdireccionnv.setText("");
        txttelefononv.setText("");
        jDateChooser1.setDate(null);
        txtproductonv.setText("");
        txtcantidadproductonv.setText("");
    }

    public inventario guardarEditar( ) {
        if (txtnotaventa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo codigo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtnotaventa.requestFocus();// Sirve para ubicar el cursor en un campo vacio.
            return null;
        }
        if (txtcelulaorucnv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo cantidad no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcelulaorucnv.requestFocus();
            return null;
        }
        if (txtnombrenv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo descripcion no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtnombrenv.requestFocus();
            return null;
        }

        if (txtdireccionnv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio sin iva no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtdireccionnv.requestFocus();
            return null;
        }
        if (txttelefononv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio con iva no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txttelefononv.requestFocus();
            return null;
        }
        if (txtproductonv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio mayorista no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtproductonv.requestFocus();
            return null;
        }
        if (txtcantidadproductonv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio cliente fijo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtcantidadproductonv.requestFocus();
            return null;
        }
        
        /*if (jDateFechaCaducidad.getDate().equals(this)) {
            JOptionPane.showMessageDialog(frameGestionContable, "El campo precio cliente normal no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            jDateFechaCaducidad.requestFocus();
            return null;
        }*/

//       notaventa venta = new notaventa();
//        venta.setId_nota_venta(Integer.parseInt(txtnotaventa.getText()));
//        venta.setPersona_id_persona(Integer.parseInt(txtcelulaorucnv.getText()));
//        venta.setNombre(Integer.parseInt(txtnombrenv.getText()));
//        venta.setFecha_venta(jDateChooser1.getDate());
//        venta.setSub_total(Double.parseDouble(txtdireccionnv.getText()));
//        venta.setIva(Double.parseDouble(txttelefononv.getText()));
//        venta.setTotal(jDateChooser1.getDate());
//        venta.setTipo_pago(Double.parseDouble(txtproductonv.getText()));
      return null;
    }
        
       /* if (isEditar) {
            invent.setFecha_actualizacion(new Date());
        } else {
            invent.setFecha_registro(new Date());
        }
        return invent;
    }*/

}
