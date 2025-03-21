package test.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.Stack;

import org.junit.jupiter.api.Test;
import main.dominio.Metodos;

public class MetodosTest {
@Test
public void testCalcularExIterativoCasoBase() {
    double resultado = Metodos.calcularExIterativo(0);
    assertEquals(1.0, resultado, 0.0001); // e^0 = 1
}

@Test
public void testCalcularExIterativo1() {
    assertEquals(2.71828, Metodos.calcularExIterativo(1), 0.0001); // e^1 ≈ 2.71828
}

@Test
public void testCalcularExIterativo2() {
    assertEquals(7.38906, Metodos.calcularExIterativo(2), 0.0001); // e^2 ≈ 7.38906
}

@Test
public void testCalcularExIterativoNegativo() {
    assertEquals(0.36788, Metodos.calcularExIterativo(-1), 0.0001); // e^(-1) ≈ 0.36788
}

@Test
public void testCalcularExRecursivoCasoBase() {
    assertEquals(1.0, Metodos.calcularExRecursivo(0, 10), 0.0001); // e^0 = 1
}

@Test
public void testCalcularExRecursivo1() {
    assertEquals(2.71828, Metodos.calcularExRecursivo(1, 10), 0.0001); // e^1 ≈ 2.71828
}

@Test
public void testCalcularExRecursivo2() {
    assertEquals(7.38906, Metodos.calcularExRecursivo(2, 10), 0.0001); // e^2 ≈ 7.38906
}

@Test
public void testCalcularExRecursivoNegativo() {
    assertEquals(0.36788, Metodos.calcularExRecursivo(-1, 10), 0.0001); // e^(-1) ≈ 0.36788
}

@Test
public void testSumaIterativaElementosPilaVacio() {
    Stack<BigDecimal> stack = new Stack<>();
    assertEquals(BigDecimal.ZERO, Metodos.sumaIterativaElementosPila(stack)); // Suma de pila vacía = 0
}

@Test
public void testSumaIterativaElementosPilaUnElemento() {
    Stack<BigDecimal> stack = new Stack<>();
    stack.push(BigDecimal.valueOf(5));
    assertEquals(BigDecimal.valueOf(5), Metodos.sumaIterativaElementosPila(stack)); // Suma de pila con un elemento = 5
}

@Test
public void testSumaIterativaElementosPilaVariosElementos() {
    Stack<BigDecimal> stack = new Stack<>();
    stack.push(BigDecimal.valueOf(3));
    stack.push(BigDecimal.valueOf(7));
    assertEquals(BigDecimal.valueOf(10), Metodos.sumaIterativaElementosPila(stack)); // Suma de 3 + 7 = 10
}

@Test
public void testSumaRecursivaElementosPilaVacio() {
    Stack<BigDecimal> stack = new Stack<>();
    assertEquals(BigDecimal.ZERO, Metodos.sumaRecursivaElementosPila(stack)); // Suma de pila vacía = 0
}

@Test
public void testSumaRecursivaElementosPilaUnElemento() {
    Stack<BigDecimal> stack = new Stack<>();
    stack.push(BigDecimal.valueOf(5));
    assertEquals(BigDecimal.valueOf(5), Metodos.sumaRecursivaElementosPila(stack)); // Suma de pila con un elemento = 5
}

@Test
public void testSumaRecursivaElementosPilaVariosElementos() {
    Stack<BigDecimal> stack = new Stack<>();
    stack.push(BigDecimal.valueOf(3));
    stack.push(BigDecimal.valueOf(7));
    assertEquals(BigDecimal.valueOf(10), Metodos.sumaRecursivaElementosPila(stack)); // Suma de 3 + 7 = 10
}

@Test
public void testSumaRecursivaElementosPilaElementosDistintoValor() {
    Stack<BigDecimal> stack = new Stack<>();
    stack.push(BigDecimal.valueOf(1));
    stack.push(BigDecimal.valueOf(2));
    stack.push(BigDecimal.valueOf(3));
    assertEquals(BigDecimal.valueOf(6), Metodos.sumaRecursivaElementosPila(stack)); // Suma de 1 + 2 + 3 = 6
}
    
}

