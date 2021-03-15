package com.Istl.modelos;

import java.sql.Date;

public class Persona {

    private int idpersona;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String correo;
    private String telefono;
    private Date fecha_registro;
    private String genero;

    public Persona(int idpersona, String cedula, String nombres, String apellidos, String direccion, 
            String correo, String telefono, Date fecha_registro, String genero) {
        this.idpersona = idpersona;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.fecha_registro = fecha_registro;
        this.genero = genero;
    }

    

    public Persona(String cedula, String nombres, String apellidos, String dirección, String correo, 
            String teléfono,Date fecha_registro, String genero, int idpersona) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = dirección;
        this.correo = correo;
        this.telefono = teléfono;
        this.fecha_registro = fecha_registro;
        this.genero = genero;
        this.idpersona = idpersona;
    }

    public Persona(int idpersona) {
        this.idpersona = idpersona;
    }

    public Persona() {
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "idpersona=" + idpersona + ", c\u00e9dula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direcci\u00f3n=" + direccion + ", correo=" + correo + ", tel\u00e9fono=" + telefono + '}';
    }

}
