/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Julio Cesar
 * 
 * La factorial de un numero es la sucesión numerica de ese mismo numero multiplica.  
 * Es decir que el factorial de 5 es 5*4*3*2*1 = 120
 * 
 * Basicamente funciona como la suma sucesiva, pero en este caso es una multiplicacion. 
 */
public class Factorial {

    public static void main(String[] args) {
        
        //Dado que nuestro metodo retorna un entero, solo debemos concatenar nuestra funcion.  
        System.out.println("El factorial es: " + numero_factorial(5));
        
    }
    
    public static int numero_factorial(int numero) {
        
        if (numero == 1) { // caso base
            return 1;
        } else {
            return numero_factorial(numero - 1) * numero; //llamada recursiva
        }
    }
}
