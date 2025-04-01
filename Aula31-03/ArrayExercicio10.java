import java.util.Random;

public class ArrayExercicio10 {
    public static void main(String[] args) {
        Random rand = new Random();

        double[] notas = new double[6];
        double media = 0;
        double soma = 0;

        for(int i = 0; i < notas.length; i++) {
            notas[i] = rand.nextDouble(0, 10);
        }

        System.out.print("Notas: ");
        for (double nota : notas) {
            System.out.print(String.format("%.1f", nota) + " ");
        }

        System.out.print("\nMédia: ");
        for (double nota : notas) {
            soma += nota;
        }
        media = soma / notas.length;
        System.out.printf("%.1f", media);

        System.out.print("\nResultado: ");
        if (media >= 7) {
            System.out.print("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
