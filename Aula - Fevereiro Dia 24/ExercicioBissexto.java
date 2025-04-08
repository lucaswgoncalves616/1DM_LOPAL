import java.util.Scanner;

public class ExercicioBissexto {
	
	static void verificarAno(int ano) {
		if (ano % 4 == 0) {
			System.out.println("Sim, é um ano bissexto");
		} else {
			System.out.println("Não é um ano bissexto");
		}
	}

	public static void main(String[] args) {
		System.out.println("Digite um ano para verificar se é um ano bissexto: ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = sc.nextInt();
		
		verificarAno(ano);

	}

}
