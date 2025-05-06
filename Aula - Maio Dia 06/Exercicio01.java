import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior = 0;

        System.out.println("Digite 5 valores para ser adicionado ao array");

        // Percorre o array para adicionar os valores e colocar na variável o maior valor
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.print("Números: ");

        // Mostra o array no console
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("Maior número: " + maior);
    }
}
