package br.com.sta.tddjunit.classes;

import br.com.sta.tddjunit.interfaces.GenericCalculadora;

/**
 *
 * @author jonat_000
 */
public class Calculadora implements GenericCalculadora {

    @Override
    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public int dividir(int num1, int num2) throws ArithmeticException {
        try {
            return num1 / num2;
        } catch(ArithmeticException arithmeticException) {
            throw arithmeticException;
        }
    }

}
