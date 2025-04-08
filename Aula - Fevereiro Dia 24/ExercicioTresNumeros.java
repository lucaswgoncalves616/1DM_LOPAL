import java.util.Scanner;

public class ExercicioTresNumeros {

	static void ordemCrescente(int num1, int num2, int num3) {
		if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }
	}
	
	public static void main(String[] args) {
		System.out.println("Vamos mostrar três números em ordem crescente: ");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		int num3 = sc.nextInt();
		
		ordemCrescente(num1, num2, num3);
	}

}
