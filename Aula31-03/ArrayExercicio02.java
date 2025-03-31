import java.util.Arrays;
import java.util.Random;

public class ArrayExercicio02 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numeros = new int[10];
        int total = 0;

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = rand.nextInt(0, 100);
            total += numeros[i];
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(total);

    }
}
