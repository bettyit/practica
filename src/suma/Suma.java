/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author ifrem
 */
public class Suma {

    /**
     * @param args the command line arguments2
     */
    public static void main(String[] args) {
        int num1, num2, suma;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca primer número: ");
        num1 = teclado.nextInt();

        System.out.print("Introduzca segundo número: ");
        num2 = teclado.nextInt();

        suma = num1 + num2;

        System.out.println("La suma de " + num1 + " más " + num2 + " es " + suma + ".");
    }

}
