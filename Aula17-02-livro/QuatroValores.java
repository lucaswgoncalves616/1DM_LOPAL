import java.util.Scanner;

public class QuatroValores {
    public static void main(String[] args) {
        System.out.println("Vamos fazer adição e multiplicação com quatro valores");
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4;

        // Entrada de dados
        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite um numero: ");
        num2 = sc.nextInt();
        System.out.print("Digite um numero: ");
        num3 = sc.nextInt();
        System.out.print("Digite um numero: ");
        num4 = sc.nextInt();

        // Mostrando os resultados no console
        System.out.println("Combinações das adições:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " + " + num3 + " = " + (num1 + num3));
        System.out.println(num1 + " + " + num4 + " = " + (num1 + num4));
        System.out.println(num2 + " + " + num3 + " = " + (num2 + num3));
        System.out.println(num2 + " + " + num4 + " = " + (num2 + num4));
        System.out.println(num3 + " + " + num4 + " = " + (num3 + num4));

        System.out.println("Combinações das multiplicações:");
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " * " + num3 + " = " + (num1 * num3));
        System.out.println(num1 + " * " + num4 + " = " + (num1 * num4));
        System.out.println(num2 + " * " + num3 + " = " + (num2 * num3));
        System.out.println(num2 + " * " + num4 + " = " + (num2 * num4));
        System.out.println(num3 + " * " + num4 + " = " + (num3 * num4));

        sc.close();
    }
}
