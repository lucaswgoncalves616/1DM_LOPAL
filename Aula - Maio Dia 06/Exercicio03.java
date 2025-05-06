import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][3];
        int total = 0;

        // Adiciona os valores a matriz com o input do usuário
        System.out.println("Digite os valores para adicionar na matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostra os elementos da matriz
        System.out.println("Elementos: ");
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
                total += anInt;
            }
            System.out.println(" ");
        }

        // Resultado da soma
        System.out.println("\nElementos somados: " + total);
    }
}
