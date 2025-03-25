import java.util.Scanner;

public class ConverterCelsius {

	public static void main(String[] args) {
		System.out.println("Ola! Vamos calcular o valor em fahrenheit...");
		Scanner sc = new Scanner(System.in);
		
		int celsius;
		int fahrenheit;

		// Entrada de dados pelo usuário
		System.out.println("Digite o valor da temperatura em Celsius: ");
		celsius = sc.nextInt();

		// Valor em Celsius recebido pelo usuário será convertido em Fahrenheit
		fahrenheit = celsius * 9 / 5 + 32;

		// Mostra o resultado no console
		System.out.println("O valor em Farenheit é " + fahrenheit);

		sc.close();
	}

}
