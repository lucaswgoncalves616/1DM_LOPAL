import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double media = 0;

        System.out.println("Digite a nota dos 4 alunos: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            media += notas[i];
        }

        media = media / notas.length;

        System.out.println("Notas armazenadas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }

        System.out.println("\nTotal: " + String.format("%.1f", media));
    }
}
