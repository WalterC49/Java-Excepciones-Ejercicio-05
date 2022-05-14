/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_excepciones_05.servicios;

import ejercicio_excepciones_05.entidades.Juego;
import ejercicio_excepciones_05.excepciones.JuegoException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class JuegoServicio {
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static Juego ComenzarJuego(){
        Juego juego = new Juego();
        
        int adivinar = (int) (Math.random() * 500)+1;
        
        return new Juego(adivinar);
    }
    
    public static void Menu(Juego juego)throws JuegoException, Exception{
        String respuesta;
        try {
            System.out.println("Adivina un número entre 1 y 500."
                + "\n1- Comenzar juego."
                + "\n2- Salir del programa.");
            System.out.print("Opción: ");
            respuesta=leer.next();
                
            if(!(respuesta.equals("1")||respuesta.equals("2"))){
                throw new JuegoException("Opción no valida.");
            }
            
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Ingreso no valido.");
        } catch (JuegoException e) {
            throw e;
        } catch (Exception e){
            throw new Exception("Error del sistema.");
        }
        
        if(respuesta.equals("1")){
            AdivinarNumero(juego);
        }
    }
    
    private static void AdivinarNumero(Juego juego){
        int intentos=1;
        int numUsuario;
        
        System.out.println("\nAdivina un número entre 1 y 500.");
        boolean repetir;
        do {            
            repetir=false;
            
            try {
                System.out.print("Ingrese un número: ");
                numUsuario=leer.nextInt();
                
                if(numUsuario<1 || numUsuario>500){
                    throw new JuegoException("Ingrese valores entre 1 y 500.");
                }
                
                if(numUsuario==juego.getNumeroParaAdivinar()){
                    break;
                }
                
                if(numUsuario>juego.getNumeroParaAdivinar()){
                    throw new JuegoException("Ingrese un valor más bajo.");
                }
                
                if(numUsuario<juego.getNumeroParaAdivinar()){
                    throw new JuegoException("Ingrese un valor más alto.");
                }
                
            } catch (InputMismatchException e) {
                leer.nextLine();
                System.out.println("Ingrese un número entero por favor.");
                repetir=true;
                intentos++;
            } catch (JuegoException e){
                System.out.println(e.getMessage());
                repetir=true;
                intentos++;
            }
            
        } while (repetir);
        
        System.out.println("\nBien hecho el número a adivinar era el "+juego.getNumeroParaAdivinar());
        System.out.println("Número de intentos: "+intentos);
    }
    
    
}
