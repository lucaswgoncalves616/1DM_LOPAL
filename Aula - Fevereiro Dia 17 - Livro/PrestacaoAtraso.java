import java.util.Scanner;

public class PrestacaoAtraso {

	public static void main(String[] args) {
		System.out.println("Vamos calcular a prestação do produto");

		Scanner sc = new Scanner(System.in);

		double prestacao, valor, taxa, tempo;

		// Entrada de dados
		System.out.println("Digite o valor do produto: ");
		valor = sc.nextDouble();

		System.out.println("Digite o valor de taxa do produto: ");
		taxa = sc.nextDouble();

		System.out.println("Digite em quantas vezes foi parcelado o produto: ");
		tempo = sc.nextDouble();

		// Calculo do juros
		prestacao = valor + (valor * (taxa / 100) * tempo);

		System.out.println("O valor do produto com juros é de R$" + String.format("%.2f", prestacao));

		sc.close();
	}

}
