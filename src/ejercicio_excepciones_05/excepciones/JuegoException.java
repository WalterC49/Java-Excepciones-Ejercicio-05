/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_excepciones_05.excepciones;

/**
 *
 * @author Walter
 */
public class JuegoException extends Exception {

    /**
     * Creates a new instance of <code>JuegoException</code> without detail
     * message.
     */
    public JuegoException() {
    }

    /**
     * Constructs an instance of <code>JuegoException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public JuegoException(String msg) {
        super(msg);
    }
}
