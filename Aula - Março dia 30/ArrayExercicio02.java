import java.util.Random;

public class ArrayExercicio02 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numeros = new int[10];
        int total = 0;

        System.out.print("Números gerados: ");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt(0, 100);
            System.out.print(numeros[i] + " ");
            total += numeros[i];
        }

        System.out.println("\nSoma total: " + total);

    }
}
