import java.util.Arrays;
import java.util.Random;

public class ExercicioRefeicoes {
    public static int totalLength(int[][] nestedArray) {
        int length = 0;
        for (int[] ints : nestedArray) {
            for (int j = 0; j < ints.length; j++) {
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int[][] refeicoes = new int[10][3];
        int totalMinutos = 0;
        int mediaMinutos;

        for (int i = 0; i < refeicoes.length; i++) {
            for (int j = 0; j < refeicoes[i].length; j++ ){
                refeicoes[i][j] = rand.nextInt(20, 45);
                totalMinutos += refeicoes[i][j];
            }
        }

        System.out.println("Tempo em minutos de cada refeição separado por array: ");
        for (int[] refeicao : refeicoes) {
            System.out.print(Arrays.toString(refeicao) + " ");
        }

        mediaMinutos = totalMinutos / totalLength(refeicoes);

        System.out.println("\nQuantidade de refeições: " + totalLength(refeicoes) + " refeições.");
        System.out.println("Tempo gasto no total: " + totalMinutos + " minutos.");
        System.out.println("Quantidade media de tempo gasto: " + mediaMinutos + " minutos.");
    }
}
