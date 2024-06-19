package com.victorcm.calculadora;

/**
 * @author Víctor
 */
public class Calculo {

    public static void mostrarMenu() {
        System.out.println("CALCULADORA\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir");
    }

    static void decidirOperacion(int a, int b, int opcion) {
        switch (opcion) {
            case 1:
                sumar(a, b);
                break;
            case 2:
                restar(a, b);
                break;
            case 3:
                multiplicar(a, b);
                break;
            case 4:
                if (a != 0 || b != 0) {
                    dividir(a, b);
                } else {
                    System.out.println("No se puede dividir entre cero");
                }
                break;
        }
    }

    private static int sumar(int a, int b) {
        int resultado = a + b;
        System.out.println(a + " + " + b + " = " + resultado);
        return resultado;
    }

    private static int restar(int a, int b) {
        int resultado = a - b;
        System.out.println(a + " - " + b + " = " + resultado);
        return resultado;
    }

    private static int multiplicar(int a, int b) {
        int resultado = a * b;
        System.out.println(a + " * " + b + " = " + resultado);
        return resultado;
    }

    private static int dividir(int a, int b) {
        int resultado = a / b;
        System.out.println(a + " / " + b + " = " + resultado);
        return resultado;
    }
    
}
