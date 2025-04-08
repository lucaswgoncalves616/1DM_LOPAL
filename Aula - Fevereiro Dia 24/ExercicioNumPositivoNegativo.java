import java.util.Scanner;

public class ExercicioNumPositivoNegativo {
	
	static void verificarNum(int num) {
		if (num == 0) {
			System.out.println("É zero");
		} else if (num > 0) {
			System.out.println("É um número positivo");
		} else if (num < 0) {
			System.out.println("É um número negativo");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para verificar: ");
		int num = sc.nextInt();
		
		verificarNum(num);

	}

}
