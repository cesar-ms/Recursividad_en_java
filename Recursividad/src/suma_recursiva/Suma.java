/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_recursiva;

/**
 *
 * @author Julio Cesar
 * 
 * Objetivo: Hacer uso de la recursividad en una suma sucesiva. 
 * 
 * Es un programa el cual ayuda a comprender el uso o funcionamiento de la recursividad en un ejercicio básico. 
 * 
 * Funciona de la siguiente manera: 
 * Si queremos hacer una suma sucesiva del numero 5, tenemos que sumar toda la sucesión del numero 5 hasta el 1. 
 * 
 * Por ejemplo: 5+4+3+2+1 = 15 
 */
public class Suma {
    
    public static int suma;
    
    public static void main(String[] args) {
        
        System.out.println("Suma sucesiva: " + sumaSucesiva(5));
        
    }
    
    public static int sumaSucesiva(int numero){
        
        if(numero == 1){ // caso base, este ayudara a que la funcion finalice y no entre en un bucle infinito. 
            return 1;
        }else{            
            return sumaSucesiva(numero-1)+ numero; // Hacemos uso de la recursividad utilizando la misma funcion para que sume el numero.
        }                                           //Al llamar la funcion agregamos el -1 para decrementar el numero y asi obtener la suma deseada.
    }
    /* 
      Cuando llega al caso base, simplemente retorna la suma del numero con el que ingreso cuando se hizo la llamada del metodo.
    */
    
}
