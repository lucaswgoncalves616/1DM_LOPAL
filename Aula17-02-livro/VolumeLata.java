import java.util.Scanner;

public class VolumeLata {

	public static void main(String[] args) {
		double volume;
		double height;
		double radius;
		
		Scanner sc = new Scanner(System.in);		

		// Entrada de dados do usuário
		System.out.println("Digite o valor da height da lata: ");
		height = sc.nextDouble();
		
		System.out.println("Digite o valor do raio da lata: ");
		radius = sc.nextDouble();

		// Calculo para achar o volume da lata
		volume = 3.14159 * (radius * radius) * height;

		// Mostra o resultado no console
		System.out.println("O volume da lata é " + volume);

		sc.close();
	}

}
