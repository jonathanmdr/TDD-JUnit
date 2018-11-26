package br.com.sta.tddjunit.interfaces;

/**
 *
 * @author jonat_000
 */
public interface GenericCalculadora {

    /**
     * Responsável por somar 2 números
     *
     * @param num1 -> recebe um valor do tipo double
     * @param num2 -> recebe um valor do tipo double
     * @return -> retorna um resultado do tipo double
     */
    public double somar(double num1, double num2);

    /**
     * Responsável por subtrair 2 números
     *
     * @param num1 -> recebe um valor do tipo double
     * @param num2 -> recebe um valor do tipo double
     * @return -> retorna um resultado do tipo double
     */
    public double subtrair(double num1, double num2);

    /**
     * Responsável por multiplicar 2 números
     *
     * @param num1 -> recebe um valor do tipo double
     * @param num2 -> recebe um valor do tipo double
     * @return -> retorna um resultado do tipo double
     */
    public double multiplicar(double num1, double num2);

    /**
     * Responsável por dividir dois números 
     * tratativa de possível divisão por ZERO
     *     
     * @param num1 -> recebe um valor do tipo int
     * @param num2 -> recebe um valor do tipo int
     * @return -> retorna um resultado do tipo int
     */
    public int dividir(int num1, int num2) throws ArithmeticException;

}
