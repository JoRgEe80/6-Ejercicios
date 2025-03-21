package main.dominio;

import java.math.BigDecimal;
import java.util.Stack;

public class Metodos {

    // Método iterativo para calcular e^x
    public static double calcularExIterativo(double x) {
        double resultado = 1.0; // Primer término de la serie, 0! = 1
        double termino = 1.0;   // Factor acumulador
        for (int k = 1; k <= 10; k++) {
            termino *= x / k;   // Calcula el término actual
            resultado += termino; // Suma el término al resultado
        }
        return resultado;
    }

    public static double calcularExRecursivo(double x){
        return calcularExRecursivo(x, 10);
    }

    // Método recursivo para calcular e^x
    public static double calcularExRecursivo(double x, int n) {
        if (n == 0) return 1.0; // Caso base
        return calcularExRecursivo(x, n - 1) + Math.pow(x, n) / factorial(n);
    }

    // Método para calcular el factorial de un número
    private static double factorial(int n) {
        if (n == 0) return 1.0;
        return n * factorial(n - 1);
    }
    /*La exactitud mejora con un mayor número de términos n,
     sin embargo tambien aumenta el tiempo de calculo*/


    // Método iterativo para sumar los elementos de una pila
    static public BigDecimal sumaIterativaElementosPila(Stack<BigDecimal> pila) {//O(n)
        BigDecimal suma = BigDecimal.ZERO;
        Stack<BigDecimal> copiaPila = new Stack<>();
        copiaPila.addAll(pila); // Copia la pila original para no modificarla

        while (!copiaPila.empty()) {
            suma = suma.add(copiaPila.pop());
        }

        return suma;
    }

    // Método recursivo para sumar los elementos de una pila
    public static BigDecimal sumaRecursivaElementosPila(Stack<BigDecimal> pila) {//O(n)
        if (pila.isEmpty()) return BigDecimal.ZERO; // Caso base
        BigDecimal top = pila.pop();               // Extrae el elemento superior
        BigDecimal suma = top.add(sumaRecursivaElementosPila(pila)); // Llamada recursiva
        pila.push(top);                            // Restaura la pila
        return suma;
    }
}