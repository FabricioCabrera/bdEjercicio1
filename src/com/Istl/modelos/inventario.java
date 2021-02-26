package com.Istl.modelos;

public class inventario {

    private int idinventario;
    private String codigo_pro;
    private String descripcion;
    private String precios_compra;
    private String precio_venta;
    private String can_productos;

    public inventario(int idinventario, String codigo_pro, String descripcion, 
            String precios_compra, String precio_venta, String can_productos) {
        this.idinventario = idinventario;
        this.codigo_pro = codigo_pro;
        this.descripcion = descripcion;
        this.precios_compra = precios_compra;
        this.precio_venta = precio_venta;
        this.can_productos = can_productos;
    }

    

    public inventario(String codigo_pro, String descripcion, String precios_compra, 
            String precio_venta, String can_productos, int idinventario) {
        this.codigo_pro = codigo_pro;
        this.descripcion = descripcion;
        this.precios_compra = precios_compra;
        this.precio_venta = precio_venta;
        this.can_productos = can_productos;
        this.idinventario = idinventario;
    }

    public inventario(int idinventario) {
        this.idinventario = idinventario;
    }

    public inventario() {
    }

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecios_compra() {
        return precios_compra;
    }

    public void setPrecios_compra(String precios_compra) {
        this.precios_compra = precios_compra;
    }

    public String getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getCan_productos() {
        return can_productos;
    }

    public void setCan_productos(String can_productos) {
        this.can_productos = can_productos;
    }
 
    @Override
    public String toString() {
        return "inventario{" + "idinventario=" + idinventario + ", codigo_pro=" + codigo_pro + ", descripcion=" + descripcion + ", precios_compra=" + precios_compra + ""
                + ", precio_venta=" + precio_venta + ", can_productos=" + can_productos + '}';
                
    }
    
}
