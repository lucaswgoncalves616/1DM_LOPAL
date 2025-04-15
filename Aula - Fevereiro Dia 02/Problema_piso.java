import java.util.Scanner;

public class Problema_piso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valorMetro, area, custoTotal;
		
		System.out.println("Digite a largura do cômodo: ");
		largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento do cômodo: ");
		comprimento = sc.nextDouble();
		
		System.out.println("Digite o valor do metro quadrado do piso: ");
		valorMetro = sc.nextDouble();
		
		area = largura * comprimento;
		
		custoTotal = area * valorMetro;
		
		System.out.println("Com a largura " + String.format("%.1f", largura) + " e o comprimento: " + String.format("%.2f", comprimento));
		System.out.println("E com o valor do custo a: " + String.format("%.2f", valorMetro));
		System.out.println("Custo total do piso: " + String.format("%.2f", custoTotal));
		
		sc.close();
	}

}
