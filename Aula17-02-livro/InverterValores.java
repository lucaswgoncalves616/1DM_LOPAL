import java.util.Scanner;

public class InverterValores {
    public static void main(String[] args) {
        // Variavel temporaria
        int valueT;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valueA = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valueB = sc.nextInt();

        System.out.println("Valores recebidos: " + valueA + " " + valueB);

        // Troca dos valores usando a variavel temporaria
        valueT = valueA;
        valueA = valueB;
        valueB = valueT;

        System.out.println("Valores recebidos depois da troca: " + valueA + " " + valueB);

        sc.close();
    }
}
