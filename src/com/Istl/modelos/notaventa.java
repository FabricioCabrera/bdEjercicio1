package com.Istl.modelos;

import java.util.Date;

public class notaventa {

    private int id_nota_venta;
    private String numero_nota_venta;
    private int persona_id_persona;
    private String nombre;
    private String direccion;
    private String telefono;
    private Date fecha_venta;
    private double sub_total;
    private double iva;
    private double total;
    private int tipo_pago;

    public notaventa(int id_nota_venta, String numero_nota_venta, int persona_id_persona, String nombre, String direccion, String telefono, Date fecha_venta, double sub_total, double iva, double total, int tipo_pago) {
        this.id_nota_venta = id_nota_venta;
        this.numero_nota_venta = numero_nota_venta;
        this.persona_id_persona = persona_id_persona;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_venta = fecha_venta;
        this.sub_total = sub_total;
        this.iva = iva;
        this.total = total;
        this.tipo_pago = tipo_pago;
    }

   

    public notaventa(int id_nota_venta) {
        this.id_nota_venta = id_nota_venta;
    }

    public notaventa() {
    }

    public int getId_nota_venta() {
        return id_nota_venta;
    }

    public void setId_nota_venta(int id_nota_venta) {
        this.id_nota_venta = id_nota_venta;
    }

    public String getNumero_nota_venta() {
        return numero_nota_venta;
    }

    public void setNumero_nota_venta(String numero_nota_venta) {
        this.numero_nota_venta = numero_nota_venta;
    }

    public int getPersona_id_persona() {
        return persona_id_persona;
    }

    public void setPersona_id_persona(int persona_id_persona) {
        this.persona_id_persona = persona_id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(int tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

}

/* @Override
    public String toString() {
        return "inventario{" + "idinventario=" + idinventario + ", codigo_pro=" + codigo_pro + ", descripcion=" + descripcion + ", precios_compra=" + precio_coniva + ""
                + ", precio_venta=" + precio_siniva + ", can_productos=" + can_productos + '}';
                
    }*/
