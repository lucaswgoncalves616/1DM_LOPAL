package Calculadora_de_Calculos_Matematicamente_Errados;

/*
    Calculadora de Cálculos Matematicamente Errados
    Descrição: Crie uma calculadora simples que, ao realizar cálculos,
    adicione um erro proposital de 1% no resultado final.
    Isso representa uma "falha" na precisão dos cálculos, como se fosse um "erro de arredondamento".

    Exemplo: Se o cálculo for 10 + 5, o resultado correto é 15, mas a calculadora deve retornar 15,15 (com erro de 1%).

    Extras: O erro deve ser calculado aleatoriamente (mas sempre dentro de uma margem de 1%).
*/

import java.util.Random;
import java.util.Scanner;

public class Calcular {
    public static double fazerSoma(double a, double b){
        double rand = Math.random();
        double res = a + b;
        return res + ((rand * res) / 100);
    }

    public static double fazerSub(double a, double b){
        double rand = Math.random();
        double res = a - b;
        return res + ((rand * res) / 100);
    }

    public static double fazerMulti(double a, double b){
        double rand = Math.random();
        double res = a * b;
        return res + ((rand * res) / 100);
    }

    public static double fazerDiv(double a, double b){
        double rand = Math.random();
        double res = a / b;
        return res + ((rand * res) / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero para fazer o calculo");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo numero para fazer o calculo");
        double num2 = sc.nextDouble();

        double resSoma = fazerSoma(num1, num2);
        double resSub = fazerSub(num1, num2);
        double resMulti = fazerMulti(num1, num2);
        double resDiv = fazerDiv(num1, num2);


        System.out.println("\nO resultado da soma é " + resSoma);
        System.out.println("O resultado da subtração é " + resSub);
        System.out.println("O resultado da multiplicação é " + resMulti);
        System.out.println("O resultado da divisão é " + resDiv);

    }
}
