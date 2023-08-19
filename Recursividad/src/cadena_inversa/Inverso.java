/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena_inversa;

/**
 *
 * @author Julio Cesar
 * 
 * Explicación del algoritmo: 
 * 
 * Basicamente estamos eliminando la cadena inicial para luego concatenar los caracteres que estamos seleccionando. 
 * Cuando el programa termino su recursividad, empezara a concatenar desde el ultimo caracter seleccionado 
 * hasta el primero y como resultado la cadena se imprime “aloH”. 
 * 
 */
public class Inverso {

    public static void main(String[] args) {

        System.out.println("Cadena inversa: " + cadena_inversa("Hola")); //aloH
        
        System.out.println("Cadena inversa: " + cadena_inversa("¿Hola como estas?")); //?satse omoc aloH¿
    }

    public static String cadena_inversa(String cadena) {

        if (cadena.length() == 1) {
            return cadena;
        } else {
            return cadena_inversa(cadena.substring(1)) + cadena.charAt(0);
        }
    }

}
