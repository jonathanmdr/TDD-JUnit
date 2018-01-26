package br.com.sta.tddjunit.classes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonat_000
 */
public class CalculadoraTest {
    
    private final Calculadora calc = new Calculadora();
    
    public CalculadoraTest() {
    }

    /**
     * Test of somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
        assertEquals(30, calc.somar(10, 20), 0);
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
        assertEquals(20, calc.subtrair(50, 30), 0);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        assertEquals(4, calc.multiplicar(2, 2), 0);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test 
    public void testDividir() {
        try {
            calc.dividir(10, 0);
        } catch(ArithmeticException ex) {
            System.out.println("Divisão por zero!");
        }
    }
    
}
