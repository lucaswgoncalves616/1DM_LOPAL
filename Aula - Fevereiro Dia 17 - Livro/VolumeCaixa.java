import java.util.Scanner;

public class VolumeCaixa {
    public static void main(String[] args) {
        System.out.println("Vamos calcular o volume de uma caixa");

        double comprimento, largura, altura, volume;

        Scanner sc = new Scanner(System.in);

        // Entrada de dados pelo usuario
        System.out.print("Digite o comprimento da caixa: ");
        comprimento = sc.nextDouble();

        System.out.print("Digite o largura da caixa: ");
        largura = sc.nextDouble();

        System.out.print("Digite o altura da caixa: ");
        altura = sc.nextDouble();

        volume = comprimento * largura * altura;

        System.out.println("O volume da caixa é de " + volume);

        sc.close();
    }
}
