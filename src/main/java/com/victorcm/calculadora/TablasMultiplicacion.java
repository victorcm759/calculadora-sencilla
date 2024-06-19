package com.victorcm.calculadora;

import java.util.Scanner;

/**
 * @author Víctor
 */
public class TablasMultiplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, rango;
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        System.out.println("Introduce un rango: ");
        rango = sc.nextInt();
        System.out.println("Tabla del " + num);
        int i = 0;
        while (i <= rango) {
            System.out.printf("%d * %d = %d\n", num, i, (num*i));
            i++;
        }
    }
    
}
