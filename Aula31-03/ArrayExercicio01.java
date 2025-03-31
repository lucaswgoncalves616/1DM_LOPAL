import java.util.Scanner;

public class ArrayExercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int i = 0;

        while (i < 5) {
            System.out.println("Digite um número: ");
            numeros [i] = sc.nextInt();
            i++;
        }

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

    }
}
