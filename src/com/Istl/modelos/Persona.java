package com.Istl.modelos;

public class Persona {

    private int idpersona;
    private String cédula;
    private String nombres;
    private String apellidos;
    private String dirección;
    private String correo;
    private String teléfono;

    public Persona(int idpersona, String cédula, String nombres, String apellidos, String dirección, String correo, String teléfono) {
        this.idpersona = idpersona;
        this.cédula = cédula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dirección = dirección;
        this.correo = correo;
        this.teléfono = teléfono;
    }

    public Persona( String cédula,int idpersona) {
        this.cédula = cédula;
        this.idpersona = idpersona;
    }
    
    public Persona(int idpersona) {
        this.idpersona = idpersona;
    }
    
    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getCédula() {
        return cédula;
    }

    public void setCédula(String cédula) {
        this.cédula = cédula;
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

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

}
