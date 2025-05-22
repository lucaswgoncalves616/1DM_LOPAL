package Jogo_de_Pedra_Papel_Tesoura_2;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int jogada;

        System.out.println("Vamos começar o jogo...");
        System.out.println("""
                Selecione uma das opções:
                1. Pedra
                2. Papel
                3. Tesoura
                4. Lagarto
                5. Spock
                """);
        System.out.print("Sua jogada: ");
        jogada = sc.nextInt();

        System.out.println("Jogada do computador: ");
    }
}
