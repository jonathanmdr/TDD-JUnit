package br.com.sta.tddjunit.classes;

/**
 *
 * @author jonat_000
 */
public class Calculadora {

    public double somar(double num1, double num2) {
        return num1 + num2;
    }

    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) throws ArithmeticException {
        try {
            return num1 / num2;
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("Possível divisao por zero!");
        }
    }

}
