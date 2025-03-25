package aula24_02;
import java.util.Scanner;

public class ExercicioAprovarAluno {
	String nome;
	int nota;
	
	
	public ExercicioAprovarAluno(String nome, int nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public void verificarNota (int nota) {
		if (nota >= 7) {
			System.out.println("Aluno foi aprovado!");
		} else {
			System.out.println("Aluno foi reprovado!");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ExercicioAprovarAluno aluno1 = new ExercicioAprovarAluno(null, 0);
		
		System.out.println("Digite o nome do(a) aluno: ");
		aluno1.nome = sc.next();
		
		System.out.println("Digite a nota do(a) aluno: ");
		aluno1.nota = sc.nextInt();
		
		aluno1.verificarNota(aluno1.nota);
	}
}
