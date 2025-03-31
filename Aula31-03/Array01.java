import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        /*
            int[] numeros;
            int[] numeros = new int[10];
            int[] numeros = {1, 2, 3};

        */

        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(vetor));

        for (int i = vetor.length - 1 ; i > 0 ; i--) {
            System.out.println(vetor[i]);
        }
    }
}
