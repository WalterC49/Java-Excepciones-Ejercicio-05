/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_excepciones_05.entidades;

/**
 *
 * @author Walter
 */
public final class Juego {
    private Integer numeroParaAdivinar;

    public Juego() {
    }

    public Juego(Integer numeroParaAdivinar) {
        this.numeroParaAdivinar = numeroParaAdivinar;
    }

    public Integer getNumeroParaAdivinar() {
        return numeroParaAdivinar;
    }
}
