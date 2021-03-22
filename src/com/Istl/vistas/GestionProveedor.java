/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Istl.vistas;

import com.Istl.modelos.Proveedor;
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
public class GestionProveedor {

    private JTextField txtRucProveedores;
    private JTextField txtRazonSocialProveedores;
    private JTextField txtTipoActividadProveedores;
    private JTextField txtNombreRepresentateLegalProveedores;
    private JTextField txtApellidosRepresentateLegalProveedores;
    private JTextField txtTelefonoProveedores;
    private JTextField txtCorrreoProveedores;
    private JTextField txtDireccionProveedores;
    private JDateChooser jDateFechaVencimientoDeuda;
    private Utilidades utilidades;
    private JFrame frameGestionProveedor;

    public GestionProveedor(JTextField txtRucProveedores, JTextField txtRazonSocialProveedores, 
            JTextField txtTipoActividadProveedores, JTextField txtNombreRepresentateLegalProveedores,
            JTextField txtApellidosRepresentateLegalProveedores, JTextField txtTelefonoProveedores, 
            JTextField txtCorrreoProveedores, JTextField txtDireccionProveedores, JDateChooser jDateFechaVencimientoDeuda,
            Utilidades utilidades, JFrame frameGestionProveedor) {
        this.txtRucProveedores = txtRucProveedores;
        this.txtRazonSocialProveedores = txtRazonSocialProveedores;
        this.txtTipoActividadProveedores = txtTipoActividadProveedores;
        this.txtNombreRepresentateLegalProveedores = txtNombreRepresentateLegalProveedores;
        this.txtApellidosRepresentateLegalProveedores = txtApellidosRepresentateLegalProveedores;
        this.txtTelefonoProveedores = txtTelefonoProveedores;
        this.txtCorrreoProveedores = txtCorrreoProveedores;
        this.txtDireccionProveedores = txtDireccionProveedores;
        this.jDateFechaVencimientoDeuda = jDateFechaVencimientoDeuda;
        this.utilidades = utilidades;
        this.frameGestionProveedor = frameGestionProveedor;
    }

    

    public JTextField getTxtRucProveedores() {
        return txtRucProveedores;
    }

    public void setTxtRucProveedores(JTextField txtRucProveedores) {
        this.txtRucProveedores = txtRucProveedores;
    }

    public JTextField getTxtRazonSocialProveedores() {
        return txtRazonSocialProveedores;
    }

    public void setTxtRazonSocialProveedores(JTextField txtRazonSocialProveedores) {
        this.txtRazonSocialProveedores = txtRazonSocialProveedores;
    }

    public JTextField getTxtTipoActividadProveedores() {
        return txtTipoActividadProveedores;
    }

    public void setTxtTipoActividadProveedores(JTextField txtTipoActividadProveedores) {
        this.txtTipoActividadProveedores = txtTipoActividadProveedores;
    }

    public JTextField getTxtNombreRepresentateLegalProveedores() {
        return txtNombreRepresentateLegalProveedores;
    }

    public void setTxtNombreRepresentateLegalProveedores(JTextField txtNombreRepresentateLegalProveedores) {
        this.txtNombreRepresentateLegalProveedores = txtNombreRepresentateLegalProveedores;
    }

    public JTextField getTxtApellidosRepresentateLegalProveedores() {
        return txtApellidosRepresentateLegalProveedores;
    }

    public void setTxtApellidosRepresentateLegalProveedores(JTextField txtApellidosRepresentateLegalProveedores) {
        this.txtApellidosRepresentateLegalProveedores = txtApellidosRepresentateLegalProveedores;
    }

    public JTextField getTxtTelefonoProveedores() {
        return txtTelefonoProveedores;
    }

    public void setTxtTelefonoProveedores(JTextField txtTelefonoProveedores) {
        this.txtTelefonoProveedores = txtTelefonoProveedores;
    }

    public JTextField getTxtCorrreoProveedores() {
        return txtCorrreoProveedores;
    }

    public void setTxtCorrreoProveedores(JTextField txtCorrreoProveedores) {
        this.txtCorrreoProveedores = txtCorrreoProveedores;
    }

    public JTextField getTxtDireccionProveedores() {
        return txtDireccionProveedores;
    }

    public void setTxtDireccionProveedores(JTextField txtDireccionProveedores) {
        this.txtDireccionProveedores = txtDireccionProveedores;
    }
    
    

    public Utilidades getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(Utilidades utilidades) {
        this.utilidades = utilidades;
    }

    public JFrame getFrameGestionProveedor() {
        return frameGestionProveedor;
    }

    public void setFrameGestionProveedor(JFrame frameGestionProveedor) {
        this.frameGestionProveedor = frameGestionProveedor;
    }

    public JDateChooser getjDateFechaVencimientoDeuda() {
        return jDateFechaVencimientoDeuda;
    }

    public void setjDateFechaVencimientoDeuda(JDateChooser jDateFechaVencimientoDeuda) {
        this.jDateFechaVencimientoDeuda = jDateFechaVencimientoDeuda;
    }

    
     public void limpiarCamposProveedor() {

        txtRucProveedores.setText("");
        txtRazonSocialProveedores.setText("");
        txtTipoActividadProveedores.setText("");
        txtNombreRepresentateLegalProveedores.setText("");
        txtApellidosRepresentateLegalProveedores.setText("");
        txtTelefonoProveedores.setText("");
        txtCorrreoProveedores.setText("");
        txtDireccionProveedores.setText("");
        jDateFechaVencimientoDeuda.setDate(null);

    }
    public Proveedor guardarEditar(boolean isEditar) {
        if (txtRucProveedores.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionProveedor, "El campo ruc no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtRucProveedores.requestFocus();// Sirve para ubicar el cursor en un campo vacio.
            return null;
        }
       
        if (txtRazonSocialProveedores.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionProveedor, "El campo razón social no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtRazonSocialProveedores.requestFocus();
            return null;
        }
        if (txtTipoActividadProveedores.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionProveedor, "El campo tipo actividad no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTipoActividadProveedores.requestFocus();
            return null;
        }
        if (txtNombreRepresentateLegalProveedores.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionProveedor, "El campo Nombre representante legal no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNombreRepresentateLegalProveedores.requestFocus();
            return null;
        }
        if (txtApellidosRepresentateLegalProveedores.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionProveedor, "El campo Apellido representante legal no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtApellidosRepresentateLegalProveedores.requestFocus();
            return null;
        }
        
        if (txtTelefonoProveedores.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionProveedor, "El campo Teléfono no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTelefonoProveedores.requestFocus();
            return null;
        }
         if (txtCorrreoProveedores.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionProveedor, "El campo correo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCorrreoProveedores.requestFocus();
            return null;
        }
          if (txtDireccionProveedores.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frameGestionProveedor, "El campo dirección no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDireccionProveedores.requestFocus();
            return null;
        }
        
    
        Proveedor proveedor = new Proveedor();
        proveedor.setRuc(txtRucProveedores.getText());
        proveedor.setRazon_social(txtRazonSocialProveedores.getText());
        proveedor.setTipoActividad(txtTipoActividadProveedores.getText());
        proveedor.setNombre_representante_legal(txtNombreRepresentateLegalProveedores.getText());
        proveedor.setApellido_representante_legal(txtApellidosRepresentateLegalProveedores.getText());
        proveedor.setTelefono(txtTelefonoProveedores.getText());
        proveedor.setCorreo(txtCorrreoProveedores.getText());
        proveedor.setDireccion(txtDireccionProveedores.getText());
        proveedor.setFecha_vencimiento_deuda(jDateFechaVencimientoDeuda.getDate());
        if (isEditar) {
            proveedor.setFecha_actualizacion(new Date());
        }else{
            proveedor.setFecha_registro(new Date());
        }
        return  proveedor;
    }

}
