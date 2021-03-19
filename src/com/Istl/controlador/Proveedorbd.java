package com.Istl.controlador;

import java.sql.Connection;
import java.sql.Statement;
import com.Istl.conexión.Conexiónbd;
import com.Istl.modelos.Proveedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Proveedorbd {

    public boolean Crear(Proveedor proveedor) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexión con la base de datos
        Connection con = null;

        String sql = "INSERT INTO bdejercicio1.proveedores (idproveedores,ruc, razon_social, tipo_actividad,"
                + " nombre_representante_legal, apellido_representante_legal,correo, telefono, direccion) "
                + "VALUES ('" + String.valueOf(proveedor.getIdproveedores()) + "','"
                + "" + proveedor.getRuc() + "', '"
                + "" + proveedor.getRazon_social() + "', '"
                + "" + proveedor.getTipoActividad() + "', '"
                + "" + proveedor.getNombre_representante_legal() + "', '"
                + "" + proveedor.getApellido_representante_legal() + "', '"
                + "" + proveedor.getCorreo() + "','"
                + ""+ proveedor.getTelefono() + "','"
                + "" + proveedor.getDireccion() + "')";

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

    //Creamos el método para eliminar una persona
    public boolean eliminar(Proveedor persona) {
        //conexión con la base de datos
        Connection con = null;
        //Interfáz de acceso a la base de datos
        Statement stm = null;
        boolean eliminar = false;

        String sql = "delete from proveedores where idproveedores= " + persona.getIdproveedores();
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

    //Creamos el método para actualizar una persona
    public boolean actualizar(Proveedor persona) {
        //conexión con la base de datos
        Connection con = null;
        //Interfáz de acceso a la base de datos
        Statement stm = null;

        //Retorno del método cuando se realice la actualización
        boolean actualizar = false;

        //Código para editar solo el número de cedula según el idpersona
        String sql = "UPDATE proveedores SET ruc= '" + persona.getRuc() + "',razon_social= '" + persona.getRazon_social() + ""
                + "',tipo_actividad= '" + persona.getTipoActividad() + ""
                + "', nombre_representante_legal= '" + persona.getNombre_representante_legal() + ""
                + "',apellido_representante_legal= '" + persona.getApellido_representante_legal() + ""
                + "',correo= '" + persona.getCorreo() + "',telefono= '" + persona.getTelefono() + ""
                + "',direccion= '" + persona.getDireccion()+ ""
                + "'  WHERE (idproveedores=" + persona.getIdproveedores() + ")";
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

    //Creamos el método para obtener lista de personas en una Arraylist
    public List<Proveedor> obtener() {
        //conexión con la base de datos
        Connection con = null;
        //Interfáz de acceso a la base de datos
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de las base de datos
        ResultSet rs = null;
        String sql = "Select * from bdejercicio1.proveedores";
        List<Proveedor> listaProveedores = new ArrayList<>();
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Proveedor c = new Proveedor();
                c.setIdproveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombre_representante_legal(rs.getString(5));
                c.setApellido_representante_legal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                listaProveedores.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error de clase editar" + ex.getLocalizedMessage());
        }
        return listaProveedores;
    }

    public List<Proveedor> obtener(String subSql) {
        //conexión con la base de datos
        Connection con = null;
        //Interfáz de acceso a la base de datos
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de las base de datos
        ResultSet rs = null;
        String sql = "Select * from bdejercicio1.proveedores where " + subSql;
        List<Proveedor> listaProveedores = new ArrayList<>();
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Proveedor c = new Proveedor();
                c.setIdproveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombre_representante_legal(rs.getString(5));
                c.setApellido_representante_legal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                listaProveedores.add(c);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error de clase editar" + ex.getLocalizedMessage());
        }
        return listaProveedores;
    }

    public Proveedor buscar(String ruc) {
        //conexión con la base de datos
        Connection con = null;
        //Interfáz de acceso a la base de datos
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de las base de datos
        ResultSet rs = null;
        Proveedor c = null;
        String sql = "Select* from bdejercicio1.proveedores where ruc=" + ruc;
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                c = new Proveedor();
                c.setIdproveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazon_social(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombre_representante_legal(rs.getString(5));
                c.setApellido_representante_legal(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setTelefono(rs.getString(8));
                c.setDireccion(rs.getString(9));
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
