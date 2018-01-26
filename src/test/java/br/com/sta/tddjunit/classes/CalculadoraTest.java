package br.com.sta.tddjunit.classes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonat_000
 */
public class CalculadoraTest {
    
    /**
     * Instanciando a classe calculadora para realizar os calculos
     * e assim obtermos os retornos para os testes             
    */
    private final Calculadora calc = new Calculadora();
    
    public CalculadoraTest() {
    }

    /**
     * Método recebe como entrada os valores 10 e 20
     * esperando uma saída igual a 30
     */
    @Test
    public void testSomar() {
        assertEquals(30, calc.somar(10, 20), 0);
    }

    /**
     * Método recebe como entrada os valores 50 e 30
     * esperando uma saída igual a 20
     */
    @Test
    public void testSubtrair() {
        assertEquals(20, calc.subtrair(50, 30), 0);
    }

    /**
     * Método recebe como entrada os valores 2 e 2
     * esperando uma saída igual a 4
     */
    @Test
    public void testMultiplicar() {
        assertEquals(4, calc.multiplicar(2, 2), 0);
    }

    /**
     * Método recebe como entrada os valores 10 e 0
     * esperando como saída uma exceção do tipo ArithmeticException
     * que neste caso representa uma divisão por ZERO
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
