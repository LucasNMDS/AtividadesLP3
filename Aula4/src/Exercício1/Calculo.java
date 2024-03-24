package Exercício1;

public class Calculo {

	public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double num1 = 5;
        double num2 = 2;

        System.out.println("Soma: " + calculadora.somar(num1, num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2));

        try {
            System.out.println("Divisão: " + calculadora.dividir(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
