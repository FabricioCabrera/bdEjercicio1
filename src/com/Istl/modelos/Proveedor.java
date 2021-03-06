package com.Istl.modelos;

import java.util.Date;



public class Proveedor {

    private int idproveedores;
    private String ruc;
    private String razon_social;
    private String tipoActividad;
    private String nombre_representante_legal;
    private String apellido_representante_legal;
    private String telefono;
    private String correo;
    private String direccion;
    private Date fecha_registro;
    private Date fecha_actualizacion;
    private Date fecha_vencimiento_deuda;

    public Proveedor(int idproveedores, String ruc, String razon_social, String tipoActividad, 
            String nombre_representante_legal, String apellido_representante_legal, String telefono, 
            String correo, String direccion, Date fecha_registro, Date fecha_actualizacion, 
            Date fecha_vencimiento_deuda) {
        this.idproveedores = idproveedores;
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.tipoActividad = tipoActividad;
        this.nombre_representante_legal = nombre_representante_legal;
        this.apellido_representante_legal = apellido_representante_legal;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fecha_registro = fecha_registro;
        this.fecha_actualizacion = fecha_actualizacion;
        this.fecha_vencimiento_deuda = fecha_vencimiento_deuda;
    }

 

   


    public Proveedor(String ruc, String razon_social, String tipo_actividad, String nombre_representante_legal, 
            String telefono, String correo, String direccion, Date fecha_registro, int idproveedores) {
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.tipoActividad = tipo_actividad;
        this.nombre_representante_legal = nombre_representante_legal;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fecha_registro = fecha_registro;
        this.idproveedores = idproveedores;
    }


    public Proveedor(int idproveedores) {
        this.idproveedores = idproveedores;
    }

    public Proveedor() {
    }

    public int getIdproveedores() {
        return idproveedores;
    }

    public void setIdproveedores(int idproveedores) {
        this.idproveedores = idproveedores;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getNombre_representante_legal() {
        return nombre_representante_legal;
    }

    public void setNombre_representante_legal(String nombre_representante_legal) {
        this.nombre_representante_legal = nombre_representante_legal;
    }

    public String getApellido_representante_legal() {
        return apellido_representante_legal;
    }

    public void setApellido_representante_legal(String apellido_representante_legal) {
        this.apellido_representante_legal = apellido_representante_legal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Date getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public Date getFecha_vencimiento_deuda() {
        return fecha_vencimiento_deuda;
    }

    public void setFecha_vencimiento_deuda(Date fecha_vencimiento_deuda) {
        this.fecha_vencimiento_deuda = fecha_vencimiento_deuda;
    }

    
    

    @Override
    public String toString() {
        return "Persona{" + "idproveedores=" + idproveedores + ", ruc=" + ruc + ", razon_social=" + razon_social + ", tipo-actividad=" + tipoActividad + ""
                + ", nombre_representante_legal=" + nombre_representante_legal + ", appellido_representante_legal=" + apellido_representante_legal + ""
                + ", correo=" + correo +",'telefono=" + telefono + '}';
    }
    

}
