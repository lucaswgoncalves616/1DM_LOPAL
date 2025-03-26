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

		System.out.println("Digite o saldo da sua conta: ");
		double saldo = sc.nextDouble();
		DesafioBanco cliente = new DesafioBanco((saldo));



	}

}
