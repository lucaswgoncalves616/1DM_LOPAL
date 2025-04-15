import java.util.Scanner;

public class Problema_quadro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double largura, altura, area, perimetro, diagonal;
		
		System.out.println("Digite a altura: ");
		largura = sc.nextDouble();
		
		System.out.println("Digite a largura: ");
		altura = sc.nextDouble();
		
		area = largura * altura;
		
		perimetro = (altura * 2) + (largura * 2);
		
		diagonal = Math.sqrt((largura * largura) + (altura * altura));
		
		System.out.println("Largura do quadro: " + String.format("%.1f", largura));
		System.out.println("Altura do quadro: " + String.format("%.1f", altura));
		
		System.out.println("Área: " + String.format("%.2f", area));
		System.out.println("Perímetro: " + String.format("%.2f", perimetro));
		System.out.println("Diagonal: " + String.format("%.2f", diagonal));
		
		
	}

}
