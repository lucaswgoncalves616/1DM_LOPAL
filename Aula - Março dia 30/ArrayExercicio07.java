import java.util.Scanner;

public class ArrayExercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {2,4,6,8,10};
        int[] multiplicado = new int[numeros.length];

        System.out.print("Vetor original: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println("\nDigite um número para multiplicar: ");
        int multi = sc.nextInt();

        System.out.print("Novo vetor: ");
        for (int i = 0; i < numeros.length; i++) {
            multiplicado[i] = numeros[i] * multi;
            System.out.print(multiplicado[i] + " ");
        }
    }
}
