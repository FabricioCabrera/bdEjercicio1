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

        String sql = "INSERT INTO `bdejercicio1`.`inventario` (`idinventario`, `codigo_pro`,`can_productos`, `descripcion`"
                + ", `precio_compra_sin_iva`, `precio_compra_con_iva`, `precio_mayorista`,`precio_cliente_fijo`,`precio_cliente_normal`)"
                + "VALUES ('" + String.valueOf(producto.getIdinventario()) + "','"
                + "" + producto.getCodigo_pro() + "','"
                + "" + producto.getCan_productos() + "','"
                + "" + producto.getDescripcion() + "','"
                + "" + String.valueOf(producto.getPrecio_siniva())+ "','"
                + "" + String.valueOf(producto.getPrecio_coniva()) + "','"
                + "" + String.valueOf(producto.getPrecio_mayorista()) + "','"
                + "" + String.valueOf(producto.getPrecio_clifijo()) + "','"
                + "" + String.valueOf(producto.getPrecio_clinormal()) + "')";
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
        String sql = "UPDATE inventario SET codigo_pro= '" + producto.getCodigo_pro() + "',can_productos= '" + producto.getCan_productos() + "',descripcion= '" + producto.getDescripcion() + "',precio_compra_sin_iva= '" + producto.getPrecio_siniva() + ""
                + "',precio_compra_con_iva= '" + producto.getPrecio_coniva()+"',precio_mayorista= '" + producto.getPrecio_mayorista() + ""
                + "', precio_cliente_fijo= '" + producto.getPrecio_clifijo() + "',precio_cliente_normal= '" + producto.getPrecio_clinormal() + ""
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
                c.setIdinventario(rs.getInt("idinventario"));
                c.setCodigo_pro(rs.getString("codigo_pro"));
                c.setCan_productos(rs.getString("can_productos"));
                c.setDescripcion(rs.getString("descripcion"));
                c.setPrecio_siniva(rs.getDouble("precio_compra_sin_iva"));
                c.setPrecio_coniva(rs.getDouble("precio_compra_con_iva"));
                c.setPrecio_mayorista(rs.getDouble("precio_mayorista"));
                c.setPrecio_clifijo(rs.getDouble("precio_cliente_fijo"));
                c.setPrecio_clinormal(rs.getDouble("precio_cliente_normal"));
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
                c.setCan_productos(rs.getString(3));
                c.setDescripcion(rs.getString(4));
                c.setPrecio_siniva(rs.getDouble(5));
                c.setPrecio_coniva(rs.getDouble(6));
                c.setPrecio_mayorista(rs.getDouble(7));
                c.setPrecio_clifijo(rs.getDouble(8));
                c.setPrecio_clinormal(rs.getDouble(9));
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
                c.setCan_productos(rs.getString(3));
                c.setDescripcion(rs.getString(4));
                c.setPrecio_siniva(rs.getDouble(5));
                c.setPrecio_coniva(rs.getDouble(6));
                c.setPrecio_mayorista(rs.getDouble(7));
                c.setPrecio_clifijo(rs.getDouble(8));
                c.setPrecio_clinormal(rs.getDouble(9));
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
