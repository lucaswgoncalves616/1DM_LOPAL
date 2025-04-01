import java.util.Scanner;

public class Media_altura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double altura1, altura2, media;
		String nome1, nome2;
		
		System.out.println("Entre o nome e altura da primeira pessoa: ");
		nome1 = sc.nextLine();
		altura1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Entre o nome e altura da segunda pessoa: ");
		nome2 = sc.nextLine();
		altura2 = sc.nextDouble();
		
		media = (altura1 + altura2) / 2;
		
		System.out.println("A altura média de " + nome1 + " e " + nome2 + " é de " + String.format("%.2f", media));
		

	}

}
