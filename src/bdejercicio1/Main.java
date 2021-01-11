package bdejercicio1;

import com.Istl.controlador.Personabd;
import com.Istl.modelos.Persona;
import com.Istl.conexión.Conexiónbd;

/**
 *
 * @author FABY
 */
public class Main {

    public static void main(String[] args) {

        Personabd personabd = new Personabd();
        
        
        Persona persona = new Persona(3, "1150262432", "Soviet","Cabrera", "Loja", "Fabriciocabrera.56@gmail.com", "0990784634");
         if (personabd.CrearPersona(persona)) {
            System.out.println("Persona guardada con éxito");
        } else {
            System.out.println("Error al guardar");
        }
         
         
        /*Persona eliminar= new Persona(3);
        
        if (personabd.eliminarPersona(eliminar)) {
            System.out.println("Persona eliminada con éxito");
        } else {
            System.out.println("Error al eliminar");
        }
        
        /*Persona edita= new Persona("1145454550",2);
         if (personabd.editaPersona(edita)) {
            System.out.println("Persona edita con éxito");
        } else {
            System.out.println("Error al editar");
        }*/
    }
}
