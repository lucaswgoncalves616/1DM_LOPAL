import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] matriz = new int[3][3];

        // Adiciona os valores a matriz de números aleatórios de 0 a 99
        System.out.println("Valores da matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(100);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }

        // Mostra apenas os números na diagonal
        System.out.println("\nValores na diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.println(matriz[i][j]);
                }
            }
        }

        System.out.println("\n" + matriz[0][0]);
        System.out.println("\t" + matriz[1][1]);
        System.out.println("\t\t" + matriz[2][2]);
    }
}
