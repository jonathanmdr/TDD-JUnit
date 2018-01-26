package br.com.sta.tddjunit.classes;

/**
 *
 * @author jonat_000
 */
public class Calculadora implements br.com.sta.tddjunit.interfaces.Calculadora{

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
    public double dividir(double num1, double num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("Valores informados não suportados pela operação!");
        }
    }

}
