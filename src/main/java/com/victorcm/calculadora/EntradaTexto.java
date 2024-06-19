package com.victorcm.calculadora;

import java.util.Scanner;

/**
 * @author Víctor
 */
public class EntradaTexto {

    public static int introducirValorEntero(int num, String texto) {
        Scanner sc = new Scanner (System.in);
        System.out.println(texto + ": ");
        if (!sc.hasNextInt()) {
            System.out.println("Tiene que ser un número");
        }
        if (num < 0) {
            System.out.println("Tiene que ser un número entero positivo");
        }
        num = sc.nextInt();
        return num;
    }
    
}
