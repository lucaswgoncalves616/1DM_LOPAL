
public class ArrayExercicio06 {
    public static void main(String[] args) {
        int[] numeros = {3,7,1,9,4,2};
        int[] invertido = new int[6];
        int add = 0;

        System.out.print("Vetor original: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[add] + " " );
            invertido[add] = numeros[i];
            add++;
        }

        System.out.print("\nVetor invertido: ");
        for (int num : invertido) {
            System.out.print(num + " ");
        }
    }
}
