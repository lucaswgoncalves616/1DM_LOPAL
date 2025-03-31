public class ArrayExercicio03 {
    public static void main(String[] args) {
        int[] numeros = {5,3,9,1,7,8,4,2};
        int maior = 0;
        int menor = 10;

        System.out.print("Vetor: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("\nO menor numero é: " + menor);
        System.out.println("O maior numero é: " + maior);


    }
}
