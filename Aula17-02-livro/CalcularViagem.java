import java.util.Scanner;

public class CalcularViagem {

	public static void main(String[] args) {
		System.out.println("Vamos calcular a distancia da viagem");
		Scanner sc = new Scanner(System.in);

		double time;
		double speed;
		double distance;
		double usedLiters;

		//Entrada de dados
		System.out.println("Digite o tempo gasto na viagem: ");
		time = sc.nextDouble();

		System.out.println("Digite a velocidade media da viagem: ");
		speed = sc.nextDouble();

		// Calculo da distancia percorrida
		distance = time * speed;
		usedLiters = distance / 12;
		System.out.println("Em uma viagem com um tempo de " + time + " horas em uma velocidade de " + speed
				+ " com uma distancia percorrida de " + distance + " gastou " + usedLiters
				+ " litros de combustivel.");

		sc.close();
	}

}
