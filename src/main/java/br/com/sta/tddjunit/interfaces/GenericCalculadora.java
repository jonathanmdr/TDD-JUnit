package br.com.sta.tddjunit.interfaces;

/**
 *
 * @author jonat_000
 */
public interface GenericCalculadora {
    
    /*
    * Responsável por somar 2 números
    */
    double somar(double num1, double num2);    

    /*
    * Responsável por subtrair 2 números
    */
    double subtrair(double num1, double num2);

    /*
    * Responsável por multiplicar 2 números
    */
    double multiplicar(double num1, double num2);

    /*
    * Responsável por dividir dois números
    * Tratativa de possível divisão por ZERO
    */
    double dividir(double num1, double num2) throws ArithmeticException;
    
}
