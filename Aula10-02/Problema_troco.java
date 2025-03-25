import java.util.Scanner;

public class Problema_troco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precoUnitario, quantidade, valorProduto, dinheiro, troco;
		
		System.out.println("Digite o valor do produto unitário: ");
		precoUnitario = sc.nextDouble();
		
		System.out.println("Digite a quantidade do produto a ser comprado: ");
		quantidade = sc.nextDouble();
		
		valorProduto = precoUnitario * quantidade;
		
		System.out.println("Qual valor em dinheiro recebido? ");
		dinheiro = sc.nextDouble();
		
		troco = dinheiro - valorProduto;
		
		System.out.println(quantidade + " unidades do produto no valor de " + "R$" + String.format("%.2f", valorProduto));
		System.out.println("Dinheiro recebido: " + "R$" + String.format("%.2f", dinheiro));
		System.out.println("Troco: " + "R$" + String.format("%.2f", troco));
	}

}
