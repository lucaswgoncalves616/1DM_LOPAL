import java.util.Scanner;

public class ConverterFahrenheit {

	public static void main(String[] args) {
		System.out.print("Vamos calcular o valor em celsius...");

		Scanner sc = new Scanner(System.in);

		int fahrenheit;
		int celsius;

		// Entrada de dados pelo usuário
		System.out.println("Digite a temperatura em Farenheit");
		fahrenheit = sc.nextInt();

		// Conversão de celsius para fahrenheit
		celsius = ((fahrenheit - 32) * 5) / 9;

		// Mostra o resultado da conversão para o usuário
		System.out.println("O valor em Celsius é " + celsius);

		sc.close();

	}

}
