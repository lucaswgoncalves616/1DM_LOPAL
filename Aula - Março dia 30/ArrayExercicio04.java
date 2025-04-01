public class ArrayExercicio04 {
    public static void main(String[] args) {
        int[] numeros = {4,7,2,9,10,23,42,11,6,8,15,16,13,14,18};
        int pares = 0;

        System.out.print("Vetor: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
            if (numero % 2 == 0) {
                pares++;
            }
        }

        System.out.println("\nTotal de números pares: " + pares);

    }
}
