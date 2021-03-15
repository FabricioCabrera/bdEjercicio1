package com.Istl.controlador;

import com.Istl.modelos.Persona;
import java.sql.Connection;
import java.sql.Statement;
import com.Istl.conexión.Conexiónbd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Personabd {

    //Creamos el método para ingresar una persona
    public boolean CrearPersona(Persona persona) {
        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO bdejercicio1.persona (idpersona,cedula, nombres, apellidos, direccion, correo, telefono,genero) "
                + "VALUES ('" + String.valueOf(persona.getIdpersona()) + "','"
                + "" + persona.getCedula() + "', '"
                + "" + persona.getNombres() + "', '"
                + "" + persona.getApellidos() + "', '"
                + "" + persona.getDireccion() + "', '"
                + "" + persona.getCorreo() +"', '" 
                + "" + persona.getTelefono() +"', '"
                + "" + persona.getGenero() + "')";
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            stm.execute(sql);
            stm.close();
            con.close();
            return true;

        } catch (SQLException ex) {
            System.out.println("Error" + ex.getLocalizedMessage());
        }
        return false;
    }

    //Creamos el método para eliminar una persona
    public boolean eliminarPersona(Persona eliminar) {
        Statement stm = null;
        Connection con = null;

        String sql = "delete from persona where idpersona= " + eliminar.getIdpersona();
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            stm.execute(sql);
            stm.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getLocalizedMessage());
        }
        return false;
    }

    //Creamos el método para editar persona
    public boolean editaPersona(Persona edita) {
        Statement stm = null;
        Connection con = null;

        //Código para editar solo el número de cédula según el idpersona
        String sql = ("UPDATE persona SET cedula=" + edita.getCedula() + " , nombres='"+edita.getNombres()+ "', apellidos='"+edita.getApellidos()+"'"
                + " , direccion='"+edita.getDireccion()+"' , correo='"+edita.getCorreo()+"' , telefono= '"+edita.getTelefono()+"', genero= '"+edita.getGenero()+"'   WHERE (idpersona=" + edita.getIdpersona()+")");
        try {
            Conexiónbd co = new Conexiónbd();
            con = co.Conectar();
            stm = con.createStatement();
            stm.execute(sql);
            stm.close();
            con.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error de clase editar" + ex.getLocalizedMessage());
        }
        return false;
    }

    //Sirve para traer todos los registros de persona de la base de datos 
    public List<Persona> obtenerPersonas() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM persona";
        List<Persona> listaPersonas = new ArrayList<>();
        try {
            co = new Conexiónbd().Conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdpersona(rs.getInt("idpersona"));
                c.setCedula(rs.getString("cedula"));
                c.setNombres(rs.getString("nombres"));
                c.setApellidos(rs.getString("apellidos"));
                c.setDireccion(rs.getString("direccion"));
                c.setCorreo(rs.getString("correo"));
                c.setTelefono(rs.getString("telefono"));
                c.setGenero(rs.getString("genero"));
                listaPersonas.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaPersonas;
    }

    public List<Persona> obtenerPersonas(String subSql) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM persona where " + subSql;
        List<Persona> listaPersonas = new ArrayList<>();
        try {
            co = new Conexiónbd().Conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdpersona(rs.getInt("idpersona"));
                c.setCedula(rs.getString("cedula"));
                c.setNombres(rs.getString("nombres"));
                c.setApellidos(rs.getString("apellidos"));
                c.setDireccion(rs.getString("direccion"));
                c.setCorreo(rs.getString("correo"));
                c.setTelefono(rs.getString("telefono"));
                c.setGenero(rs.getString("genero"));
                listaPersonas.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            for (StackTraceElement stackTrace : e.getStackTrace()) {
                System.out.println(stackTrace);
            }
//            System.out.println("Error:" + e.getMessage());
        }

        return listaPersonas;
    }

    //Metodo para buscar una persona por cedula
    public Persona getPersonaCedula(String cedula) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        Persona c = null;
        String sql = "SELECT * FROM persona where cedula like " + cedula + ";";
        try {
            co = new Conexiónbd().Conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Persona();
                c.setIdpersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setGenero(rs.getString(8));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return c;
    }

    //Metodo para buscar una persona por cedula
    public List<Persona> getPersonaNombre(String nombre) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM persona where nombres like \"%" + nombre + "%\"";
        try {
            co = new Conexiónbd().Conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdpersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setGenero(rs.getString(8));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return personasEncontradas;
    }

}
