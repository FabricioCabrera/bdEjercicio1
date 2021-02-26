package com.Istl.controlador;

import java.sql.Connection;
import java.sql.Statement;
import com.Istl.conexión.Conexiónbd;
import com.Istl.modelos.inventario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class inventariobd {
    //Creamos el método para guardar un producto nuevo
    public boolean Crear(inventario producto) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexión con la base de datos
        Connection con = null;
        

        String sql = "INSERT INTO `bdejercicio1`.`inventario` (`idinventario`, `codigo_pro`, `descripcion`"
                + ", `precios_compra`, `precio_venta`, `can_productos`)"
                + "VALUES ('" + String.valueOf(producto.getIdinventario()) + "','"
                
                + "" + producto.getCodigo_pro() + "','"
                + "" + producto.getDescripcion()+ "','"
                + "" + producto.getPrecios_compra() + "','"
                + "" + producto.getPrecio_venta() + "','"
                + "" + producto.getCan_productos() +"')";

        try {
            //Es una instancia de la conexión previamente creada
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error" + ex.getLocalizedMessage());
        }
        return registrar;
    }
    //Creamos el método para eliminar un producto
    public boolean eliminar(inventario producto) {
        //conexión con la base de datos
        Connection con = null;
        //Interfáz de acceso a la base de datos
        Statement stm = null;
        boolean eliminar = false;

        String sql = "delete from inventario where idinventario= " + producto.getIdinventario();
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getLocalizedMessage());
        }
        return eliminar;
    }
    //Creamos el método para actualizar un producto
    public boolean actualizar(inventario producto) {
        //conexión con la base de datos
        Connection con = null;
        //Interfáz de acceso a la base de datos
        Statement stm = null;

        //Retorno del método cuando se realice la actualización
        boolean actualizar = false;

        //Código para editar solo el número de cedula según el idpersona
        String sql = "UPDATE inventario SET codigo_pro= '" + producto.getCodigo_pro() + "',descripcion= '" + producto.getDescripcion() + "',precios_compra= '" + producto.getPrecios_compra() + ""
                + "', precio_venta= '" + producto.getPrecio_venta() + "',can_productos= '" + producto.getCan_productos() + ""
                  + "'  WHERE (idinventario=" + producto.getIdinventario() + ")";
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException ex) {
            System.out.println("Error de clase editar" + ex.getLocalizedMessage());
        }
        return actualizar;
    }
    //Creamos el método para obtener lista de productos en una Arraylist
    public List<inventario> obtener() {
        //conexión con la base de datos
        Connection con = null;
        //Interfáz de acceso a la base de datos
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de las base de datos
        ResultSet rs = null;
        String sql = "Select * from bdejercicio1.inventario";
        List<inventario> listaProductos = new ArrayList<>();
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                inventario c = new inventario();
                c.setIdinventario(rs.getInt(1));
                c.setCodigo_pro(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecios_compra(rs.getString(4));
                c.setPrecio_venta(rs.getString(5));
                c.setCan_productos(rs.getString(6));
                listaProductos.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error de clase editar" + ex.getLocalizedMessage());
        }
        return listaProductos;
    }
    //Creamos el método para obtener lista de productos en una Arraylist con un subsentenciasql
    public List<inventario> obtener(String subSql) {
        //conexión con la base de datos
        Connection con = null;
        //Interfáz de acceso a la base de datos
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de las base de datos
        ResultSet rs = null;
        String sql = "Select * from bdejercicio1.inventario where " + subSql;
        List<inventario> listaProductos = new ArrayList<>();
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                inventario c = new inventario();
                c.setIdinventario(rs.getInt(1));
                c.setCodigo_pro(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecios_compra(rs.getString(4));
                c.setPrecio_venta(rs.getString(5));
                c.setCan_productos(rs.getString(6));
                listaProductos.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error de clase editar" + ex.getLocalizedMessage());
        }
        return listaProductos;
    }

     public inventario buscar(String ruc) {

        //conexión con la base de datos
        Connection con = null;
        //Interfáz de acceso a la base de datos
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de las base de datos
        ResultSet rs = null;
        inventario c = null;
        String sql = "Select* from bdejercicio1.proveedores where ruc=" + ruc;
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                c = new inventario();
                c.setIdinventario(rs.getInt(1));
                c.setCodigo_pro(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecios_compra(rs.getString(4));
                c.setPrecio_venta(rs.getString(5));
                c.setCan_productos(rs.getString(6));
            }
            stm.close();
            rs.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error de clase buscar" + ex.getLocalizedMessage());
        }
        return c;
    }
}
