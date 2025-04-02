import java.util.Random;

public class ExercicioComprasSemanais {
    public static void main(String[] args) {
        Random rand = new Random();

        double[] compras = new double[7];
        double total = 0;
        double media;

        for (int i = 0; i < compras.length; i++) {
            compras[i] = rand.nextDouble(50, 200);
        }

        System.out.println("Valor das compras: ");
        int dia = 1;
        for (double num : compras) {
            System.out.println("Dia " + dia + ": R$ " + String.format("%.2f", num));
            dia++;
            total += num;
        }

        media = total / compras.length;

        System.out.println("Total gasto: " + "R$ " + String.format("%.2f", total));
        System.out.println("Média: " + "R$ " + String.format("%.2f", media));

    }
}
