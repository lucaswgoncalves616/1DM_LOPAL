import java.util.Scanner;

public class ExercicioDoisNumeros {
	
	static void compararNumeros(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " é maior que " + num2);
		} else {
			System.out.println(num2 + " é maior que " + num1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Vamos fazer a comparação de dois números: ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		
		compararNumeros(numero1, numero2);
		
		sc.close();

	}

}
