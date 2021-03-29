/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Istl.utilidades;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author johnp
 */
public class Utilidades {

    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
// Coeficientes de validación cédula
// El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }
        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }

    //Metodo sirve para validar los numeros de cedula de las personas.
    public boolean validarNumeros(String numero) {
        //Coleccion caracteres
        if (numero.charAt(0) != '0') {
            return false;
        }
        if (numero.isEmpty()) {
            return false;
        } else if (numero.length() < 10) {
            return false;
        }
        try {
            int validarNumero = Integer.parseInt(numero);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //Metodo para validar correo
    public boolean validarCorreo(String correo) {
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i) == '@') {
                return true;
            }
        }
        return false;
    }

    public String devolverFecha(Date fecha) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        return f.format(fecha);
    }

    //<editor-fold defaultstate="collapsed" desc="Formatear fecha de Date a String, en formato (Corto o Largo)">
    /**
     * Proceso que permite el formateo de fecha corto. Parametros fecha y el
     * tipo (Corto o Largo)
     *
     * @param fecha
     * @return
     */
    public String formatearFecha(Date fecha) {
        SimpleDateFormat formatoFecha;
        String fecha_formateada;
//        if (tipo.equals("Corto")) {
        formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        fecha_formateada = formatoFecha.format(fecha);
        return fecha_formateada;
//        } else {
//            formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            fecha_formateada = formatoFecha.format(fecha);
//            return fecha_formateada;
//        }
    }
    //</editor-fold>

}
