import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {
	int guess;
    int randomInt;


    public DesafioAdivinhacao() {
        Random rand = new Random();
        randomInt = rand.nextInt(10);
    }
    
    public void adivinhar(int guess) {
    	this.guess = guess;
    	
    	System.out.println("O número sorteado foi: " + randomInt);
    	
    	if (guess == randomInt) {
    		System.out.println("Você acertou!");
    	} else {
    		System.out.println("Você errou!");
    	}
    }
	
	public static void main(String[] args) {
		int numero;
		
		System.out.println("Tente adivinhar um número de 0 a 10");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		DesafioAdivinhacao jogo = new DesafioAdivinhacao();
		
		jogo.adivinhar(numero);
	}
}
