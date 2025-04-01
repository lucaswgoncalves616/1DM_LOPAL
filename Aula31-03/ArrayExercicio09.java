import java.util.Random;

public class ArrayExercicio09 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numeros = new int[10];

        System.out.println("Vetor original: ");
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(0,50);
            System.out.print(numeros[i] + " ");
        }

        System.out.print("\nNúmeros pares: ");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nNúmeros impares: ");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
