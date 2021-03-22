package com.Istl.modelos;

import java.util.Date;

public class Persona {

    private int idpersona;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String correo;
    private String telefono;
    private Date Fecha_registro;
    private int genero;
    private Date Fecha_actualizacion;
    private Date Fecha_nacimiento;

    public Persona(int idpersona, String cedula, String nombres, String apellidos, String direccion, String correo, String telefono, Date Fecha_registro, int genero, Date Fecha_actualizacion, Date Fecha_nacimiento) {
        this.idpersona = idpersona;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.Fecha_registro = Fecha_registro;
        this.genero = genero;
        this.Fecha_actualizacion = Fecha_actualizacion;
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    


    public Persona(String cedula, String nombres, String apellidos, String dirección, String correo, 
            String teléfono,Date Fecha_registro, int genero, int idpersona) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = dirección;
        this.correo = correo;
        this.telefono = teléfono;
        this.Fecha_registro = Fecha_registro;
        this.genero = genero;
        this.idpersona = idpersona;
    }

    public Persona(int idpersona) {
        this.idpersona = idpersona;
    }

    public Persona() { }

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
        return Fecha_registro;
    }

    public void setFecha_registro(Date Fecha_registro) {
        this.Fecha_registro = Fecha_registro;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public Date getFecha_actualizacion() {
        return Fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date Fecha_actualizacion) {
        this.Fecha_actualizacion = Fecha_actualizacion;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

   
    
    @Override
    public String toString() {
        return "Persona{" + "idpersona=" + idpersona + ", c\u00e9dula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direcci\u00f3n=" + direccion + ", correo=" + correo + ", tel\u00e9fono=" + telefono + '}';
    }

}
