import java.util.Scanner;

public class DesafioBanco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int acao;

		MetodosBanco client001 = new MetodosBanco(null, 0);

		System.out.println("Digite seu nome: ");
		client001.setName(sc.nextLine());

		System.out.println("Digite o saldo da sua conta: ");
		client001.setBalance(sc.nextDouble());

		System.out.println("Digite a ação que deseja realizar: ");
		System.out.println("Digite 1 para consultar saldo.");
		System.out.println("Digite 2 para fazer depósito.");
		System.out.println("Digite 3 para fazer saque.");
		System.out.println("Digite 0 para sair");

		acao = sc.nextInt();
		while (acao != 0) {
			if (acao > 4 || acao < 0) {
				System.out.println("Opção inválida, saindo do programa...");
				break;
			} else if (acao == 1){
				System.out.println("Olá " + client001.getName() + " o saldo da sua conta é: R$" + String.format("%.2f", client001.getBalance()));
				System.out.println("Digite outra função ou 0 para sair: ");
				acao = sc.nextInt();
			} else if (acao == 2){
				System.out.println("Digite o valor para depósito: ");
				client001.deposit(sc.nextDouble());
				System.out.println("Digite outra função ou 0 para sair: ");
				acao = sc.nextInt();
			} else if (acao == 3){
				System.out.println("Digite o valor para saque: ");
				client001.withDraw(sc.nextDouble());
				System.out.println("Digite outra função ou 0 para sair: ");
				acao = sc.nextInt();
			}
		}
	}

}
