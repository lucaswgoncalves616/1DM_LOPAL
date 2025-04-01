package aula24_02;

import java.util.Scanner;

public class DesafioBanco {

	double saldo;

	public DesafioBanco(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public double deposito(double saldoDeposito) {
		return saldo + saldoDeposito;
	}

	public double saque(double saldoSaque) {
		return saldo - saldoSaque;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcao;

		System.out.println("Digite o saldo da sua conta: ");
		double saldo = sc.nextDouble();
		DesafioBanco cliente = new DesafioBanco((saldo));

		System.out.println("Digite um valor para deposito: ");
		saldo = cliente.deposito(sc.nextDouble());

		/*
		System.out.println("Digite uma das operações: ");
		System.out.println("1 para consultar saldo");
		System.out.println("2 para fazer um depósito");
		System.out.println("3 para fazer um saque");
		System.out.println("0 para sair...");
		opcao = sc.nextLine();
*/
	}

}
