package com.Istl.controlador;

import com.Istl.modelos.Persona;
import java.sql.Connection;
import java.sql.Statement;
import com.Istl.conexión.Conexiónbd;
import java.sql.SQLException;

public class Personabd {

    //Creamos el método para ingresar una persona
    public boolean CrearPersona(Persona persona) {
        Statement stm = null;
        Connection con = null;
        
        String sql = "INSERT INTO `bdejercicio1`.`persona` (`idpersona`,`cédula`, `nombres`, `apellidos`, `dirección`, `correo`, `teléfono`) "
                + "VALUES ('" + String.valueOf(persona.getIdpersona()) + "','"
                + "" + persona.getCédula() + "', '"
                + "" + persona.getNombres() + "', '"
                + "" + persona.getApellidos() + "', '"
                + "" + persona.getDirección() + "', '"
                + "" + persona.getCorreo() + "', '"
                + "" + persona.getTeléfono() + "')";
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
        String sql = ("UPDATE persona SET cédula=" + edita.getCédula() + "  WHERE (idpersona=" + edita.getIdpersona() + ")");
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
}
