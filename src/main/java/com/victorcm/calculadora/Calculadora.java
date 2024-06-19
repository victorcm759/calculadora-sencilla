package com.victorcm.calculadora;

import java.util.Scanner;

/**
 * @author Víctor
 */
public class Calculadora {

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int opcion, a, b, x;
        System.out.println("CALCULADORA\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n");
        System.out.print("Elige una opción (1 - 4): ");
        opcion = sc.nextInt();
        System.out.println("Introduce un número: ");
        a = sc.nextInt();
        System.out.println("Introduce un número: ");
        b = sc.nextInt();
        switch (opcion) {
            case 1:
                x = a + b;
                System.out.println(a + " + " + b + " = " + x);
                break;
            case 2:
                x = a - b;
                System.out.println(a + " - " + b + " = " + x);
                break;
            case 3:
                x = a * b;
                System.out.println(a + " * " + b + " = " + x);
                break;
            case 4:
                if (a != 0 || b != 0) {
                    x = a / b;
                    System.out.println(a + " / " + b + " = " + x);
                } else {
                    System.out.println("No es posible dividir entre cero");
                }
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
