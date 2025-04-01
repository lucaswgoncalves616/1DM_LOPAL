public class ArrayExercicio11 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int[] caesar = new int[numeros.length];

        caesar[0] = numeros[numeros.length - 1];
        for(int i = 1; i < numeros.length ; i++){
            caesar[i] = numeros[i - 1];
        }

        System.out.print("Vetor original: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.print("\nVetor rotacionado: ");
        for (int num : caesar) {
            System.out.print(num + " ");
        }
    }
}
