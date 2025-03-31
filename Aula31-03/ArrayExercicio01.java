import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int i = 0;
        System.out.println("Digite cinco numeros: ");

        while (i < 5) {
            numeros [i] = sc.nextInt();
            i++;
        }

        System.out.println(Arrays.toString(numeros));

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

    }
}
