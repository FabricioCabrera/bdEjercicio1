/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Istl.modelTablas;


import com.Istl.modelos.Persona;
import com.Istl.modelos.ProductoVenta;
import com.Istl.modelos.Proveedor;
import com.Istl.modelos.inventario;


public interface ComunicacionPersona {
    void clickPersona (Persona p);
    void clickProveedor (Proveedor p);
    void clickInventario (inventario p);
    void clickNotaVenta (ProductoVenta p);
    
}
    

