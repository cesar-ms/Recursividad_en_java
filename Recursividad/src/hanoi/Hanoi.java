/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import java.util.Scanner;

/**
 *
 * @author Julio Cesar
 * 
 *  El programa simula los movimientos realizados para mover los discos de una torre a otra, en este caso de “A” a “C”.  
 *  Ademas, obtiene el numero de movimientos que se necesitan para resolverlo. Formula de 2^n - 1
 * 
 */
public class Hanoi {

    /**
     * @param args the command line arguments
     */
    static int c = 0; // Sirve para contar los movimientos

    public static void main(String[] args) {
        int numDiscos = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de Discos: ");
        numDiscos = entrada.nextInt(); // Solicita el numero de discos para la torre

        hanoi(numDiscos, 'A', 'B', 'C'); // llamamos a la funcion y le ingresamos el numero de discos asi como los nombres de las torres. 
        System.out.println("Numero de movimientos requeridos: " + c); // mostramos el numero de moviminetos
    }

    public static void hanoi(int numeroDiscos, char torreA, char torreB, char torreC) {
        c++;
        if (numeroDiscos == 1) {
            System.out.println("Mover disco de Torre " + torreA + " a Torre " + torreC);
        } else {
            hanoi(numeroDiscos - 1, torreA, torreC, torreB);
            System.out.println("Mover disco de Torre " + torreA + " a Torre " + torreC);
            hanoi(numeroDiscos - 1, torreB, torreA, torreC);
        }
        /**
         * Es un algoritmo en la que los pasos son repetitivos, es decir, empiezan y terminan de la misma forma.  
         * Dependiendo si los el numero de discos es par o impar. 
         * 
         * Por ejemplo, si el numero de discos es 2 entonces el ultimo movimiento terminara en “B” a ”C” y 
         * si los números de discos son  3 entonces el ultimo movimiento terminara en “A” a “C”.   
         */
         
    }
}
