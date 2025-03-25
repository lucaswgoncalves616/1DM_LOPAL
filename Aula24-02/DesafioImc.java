package aula24_02;

import java.util.Scanner;

public class DesafioImc {

	double altura;
	double peso;
	double imc;
	String nome;
	String classificacao;

	public DesafioImc(String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}

	public double calcularImc(double altura, double peso) {
		imc = peso / (altura * altura);
		return imc;
	}

	public void classificar() {
		if (imc < 18.5) {
			classificacao = "abaixo do peso";
			System.out.println("Você está " + classificacao);
		} else if (imc < 25) {
			classificacao = "no peso ideal";
			System.out.println("Você está " + classificacao);
		} else if (imc < 30) {
			classificacao = "levemente acima do peso";
			System.out.println("Você está " + classificacao);
		} else if (imc < 35) {
			classificacao = "com obesidade grau 1";
			System.out.println("Você está " + classificacao);
		} else if (imc < 40) {
			classificacao = "com obesidade grau 2";
			System.out.println("Você está " + classificacao);
		} else if (imc > 40) {
			classificacao = "com obesidade grau 3";
			System.out.println("Você está " + classificacao);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double imc;

		System.out.println("Vamos calcular o imc");

		DesafioImc pessoa1 = new DesafioImc(null, 0, 0);

		System.out.println("Digite seu nome: ");
		pessoa1.nome = sc.next();

		System.out.println("Digite sua altura em metros separado por vírgula:");
		pessoa1.altura = sc.nextDouble();

		System.out.println("Digite seu peso:");
		pessoa1.peso = sc.nextDouble();

		imc = pessoa1.calcularImc(pessoa1.altura, pessoa1.peso);

		System.out.println("Paciente: " + pessoa1.nome + " de altura " + pessoa1.altura + " e peso " + pessoa1.peso);
		System.out.println("Seu IMC é " + String.format("%.2f", imc));
		pessoa1.classificar();

		sc.close();
	}

}
