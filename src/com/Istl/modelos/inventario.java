package com.Istl.modelos;

import java.util.Date;

public class inventario {

    private int idinventario;
    private String codigo_pro;
    private String can_productos;
    private String descripcion;
    private double precio_siniva;
    private double precio_coniva;
    private double precio_mayorista;
    private double precio_clifijo;
    private double precio_clinormal;
    private Date fecha_caducidad;
    private Date fecha_registro;
    private Date fecha_actualizacion;

    
    
    
    private int cantidadProductosVender;

    public inventario(int idinventario, String codigo_pro, String can_productos, String descripcion, double precio_siniva, double precio_coniva, double precio_mayorista, double precio_clifijo, double precio_clinormal, Date fecha_caducidad, Date fecha_registro, Date fecha_actualizacion, int cantidadProductosVender) {
        this.idinventario = idinventario;
        this.codigo_pro = codigo_pro;
        this.can_productos = can_productos;
        this.descripcion = descripcion;
        this.precio_siniva = precio_siniva;
        this.precio_coniva = precio_coniva;
        this.precio_mayorista = precio_mayorista;
        this.precio_clifijo = precio_clifijo;
        this.precio_clinormal = precio_clinormal;
        this.fecha_caducidad = fecha_caducidad;
        this.fecha_registro = fecha_registro;
        this.fecha_actualizacion = fecha_actualizacion;
        this.cantidadProductosVender = cantidadProductosVender;
    }
    
    
   

   
    

    

    public inventario(String codigo_pro, String can_productos, String descripcion, double precio_coniva, double precio_siniva, 
            double precio_mayorista, double precio_clifijo, double precio_clinormal,int idinventario) {
        this.codigo_pro = codigo_pro;
        this.can_productos = can_productos;
        this.descripcion = descripcion;
        this.precio_coniva = precio_coniva;
        this.precio_siniva = precio_siniva;
        this.precio_mayorista = precio_mayorista;
        this.precio_clifijo = precio_clifijo;
        this.precio_clinormal = precio_clinormal;
        this.idinventario=idinventario;
    }
    
    public inventario(int idinventario) {
        this.idinventario = idinventario;
    }

    public inventario() {
    }

    
    
       /* @Override
    public String toString() {
        return "inventario{" + "idinventario=" + idinventario + ", codigo_pro=" + codigo_pro + ", descripcion=" + descripcion + ", precios_compra=" + precio_coniva + ""
                + ", precio_venta=" + precio_siniva + ", can_productos=" + can_productos + '}';
                
    }*/

    public int getIdinventario() {
        return idinventario;
    }

    public void setIdinventario(int idinventario) {
        this.idinventario = idinventario;
    }

    public String getCodigo_pro() {
        return codigo_pro;
    }

    public void setCodigo_pro(String codigo_pro) {
        this.codigo_pro = codigo_pro;
    }

    public String getCan_productos() {
        return can_productos;
    }

    public void setCan_productos(String can_productos) {
        this.can_productos = can_productos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_siniva() {
        return precio_siniva;
    }

    public void setPrecio_siniva(double precio_siniva) {
        this.precio_siniva = precio_siniva;
    }

    public double getPrecio_coniva() {
        return precio_coniva;
    }

    public void setPrecio_coniva(double precio_coniva) {
        this.precio_coniva = precio_coniva;
    }

    public double getPrecio_mayorista() {
        return precio_mayorista;
    }

    public void setPrecio_mayorista(double precio_mayorista) {
        this.precio_mayorista = precio_mayorista;
    }

    public double getPrecio_clifijo() {
        return precio_clifijo;
    }

    public void setPrecio_clifijo(double precio_clifijo) {
        this.precio_clifijo = precio_clifijo;
    }

    public double getPrecio_clinormal() {
        return precio_clinormal;
    }

    public void setPrecio_clinormal(double precio_clinormal) {
        this.precio_clinormal = precio_clinormal;
    }

    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
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

    public int getCantidadProductosVender() {
        return cantidadProductosVender;
    }

    public void setCantidadProductosVender(int cantidadProductosVender) {
        this.cantidadProductosVender = cantidadProductosVender;
    }

}
