package com.victorcm.calculadora;
import static com.victorcm.calculadora.EntradaTexto.*;
import static com.victorcm.calculadora.Calculo.*;
/**
 * @author Víctor
 */
public class Main {

    public static void main(String[] args) {
        int a = 0, b = 0, opcion = 0;
        mostrarMenu();
        opcion = introducirValorEntero(opcion, "Selecciona una opción");
        if (opcion <= 4 && opcion >= 1) {
            a = introducirValorEntero(a, "Introduce el primer número");
            b = introducirValorEntero(b, "Introduce el segundo número");
            Calculo.decidirOperacion(a, b, opcion);
        } else {
            System.out.println("Opción no válida");
        }
        
    }
    
}
