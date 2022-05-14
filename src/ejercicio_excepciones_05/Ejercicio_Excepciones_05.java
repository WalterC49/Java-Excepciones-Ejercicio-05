/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que
intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora
debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que
ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en
pantalla el número de veces que el usuario ha intentado adivinar el número. Si el usuario
introduce algo que no es un número, se debe controlar esa excepción e indicarlo por
pantalla. En este último caso también se debe contar el carácter fallido como un intento.
*/
package ejercicio_excepciones_05;

import ejercicio_excepciones_05.excepciones.JuegoException;
import ejercicio_excepciones_05.servicios.JuegoServicio;
import java.util.InputMismatchException;

/**
 *
 * @author Walter
 */
public class Ejercicio_Excepciones_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean repetir;
        do {            
            repetir=false;
            
            try {
                JuegoServicio.Menu(JuegoServicio.ComenzarJuego());
            } catch (JuegoException | InputMismatchException e) {
                System.out.println(e.getMessage());
                repetir=true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        } while (repetir);

        System.out.println("\nFIN DEL PROGRAMA.");
        
    }
    
}
