public class ArrayExercicio03 {
    public static void main(String[] args) {
        int[] numeros = {5,3,9,1,7,8,4,2};
        int maior = 0;
        int menor = 10;

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O menor numero é: " + menor);
        System.out.println("O maior numero é: " + maior);


    }
}
