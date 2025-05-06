import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int linhas, colunas;

        System.out.println("Digite o número de linhas: ");
        linhas = sc.nextInt();

        System.out.println("Digite o número de colunas: ");
        colunas = sc.nextInt();

        int[][] matrizRand = new int[linhas][colunas];

        for (int i = 0; i < matrizRand.length; i++) {
            for (int j = 0; j < matrizRand[i].length; j++) {
                matrizRand[i][j] = rand.nextInt(100);
            }
        }

        for (int[] ints : matrizRand) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println(" ");
        }
    }
}
