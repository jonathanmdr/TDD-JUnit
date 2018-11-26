package br.com.sta.tddjunit.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author jonat_000
 */
public class CalculadoraTest {
        
    private Calculadora calc;
    
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void before() {
        this.calc = new Calculadora();
    }

    /**
     * Método recebe como entrada os valores 10 e 20 
     * e espera uma saída igual a 30
     */
    @Test
    public void testSomar() {
        assertEquals(30, calc.somar(10, 20), 0);
    }

    /**
     * Método recebe como entrada os valores 50 e 30 
     * e espera uma saída igual a 20
     */
    @Test
    public void testSubtrair() {
        assertEquals(20, calc.subtrair(50, 30), 0);
    }

    /**
     * Método recebe como entrada os valores 2 e 2 
     * e espera uma saída igual a 4
     */
    @Test
    public void testMultiplicar() {
        assertEquals(4, calc.multiplicar(2, 2), 0);
    }

    /**
     * Método recebe como entrada os valores 10 e 2
     * e espera como saída igual a 5.
     * 
     * Método recebe como entrada os valores 10 e 0 
     * e espera como saída uma exceção do tipo ArithmeticException 
     * que neste caso representa uma divisão por ZERO
     */
    @Test
    public void testDividir() throws ArithmeticException {
        assertEquals(5, calc.dividir(10, 2), 0);
        
        expectedException.expect(ArithmeticException.class);
        calc.dividir(10, 0);
    }

}
