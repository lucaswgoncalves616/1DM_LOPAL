package Jogo_de_Pedra_Papel_Tesoura_2;

import java.util.Random;
import java.util.Scanner;

/*
    Jogo de Pedra, Papel, Tesoura, Lagarto e Spock
    Descrição: Implemente a versão estendida do jogo, jogando contra o computador.
    Utilize estrutura de decisão para determinar o vencedor.
* */

public class Jokenpo2 {
    public static int recebeJogada() {
        Scanner sc = new Scanner(System.in);
        int jogadaPlayer;
        System.out.println("""
                Selecione uma das opções:
                1. Pedra
                2. Papel
                3. Tesoura
                4. Lagarto
                5. Spock
                """);
        System.out.print("Sua jogada: ");

        do {
            jogadaPlayer = sc.nextInt();
            if (jogadaPlayer >= 1 && jogadaPlayer < 6) {
                jogadaPlayer = switch (jogadaPlayer) {
                    case 1 -> 1;
                    case 2 -> 2;
                    case 3 -> 3;
                    case 4 -> 4;
                    case 5 -> 5;
                    default -> jogadaPlayer;
                };
                break;
            } else {
                System.out.print("Opção inválida!\nDigite novamente: ");
            }
        } while (true);
        return jogadaPlayer;
    }

    public static String escolhaJogada(int recebeJogada) {
        String jogada = "";
        switch (recebeJogada) {
            case 1: jogada = "Pedra";
                break;
            case 2: jogada = "Papel";
                break;
            case 3: jogada = "Tesoura";
                break;
            case 4: jogada = "Lagarto";
                break;
            case 5: jogada = "Spock";
                break;
        }
        return jogada;
    }

    public static String compara(String player, String cpu) {
        String[][] regraVitoria = {
                {"Tesoura", "Papel", "Tesoura corta o papel!"},
                {"Papel", "Pedra", "Papel cobre a pedra!"},
                {"Pedra", "Lagarto", "Pedra esmaga o lagarto!"},
                {"Lagarto", "Spock", "Lagarto envenena o spock!"},
                {"Spock", "Tesoura", "Spock esmaga a tesoura!"},
                {"Tesoura", "Lagarto", "Tesoura decapita o lagarto!"},
                {"Lagarto", "Papel", "Lagarto come o papel!"},
                {"Papel", "Spock", "Papel desmente o spock!"},
                {"Spock", "Pedra", "Spock destrói a pedra!"},
                {"Pedra", "Tesoura", "Pedra quebra a tesoura!"},
        };
        for (String[] strings : regraVitoria) {
            if (player.equals(strings[0]) && cpu.equals(strings[1])) {
                return "\nVoce venceu! " + strings[2];
            } else if (cpu.equals(strings[0]) && player.equals(strings[1])) {
                return "\nVoce perdeu! " + strings[2];
            }
        }
        return "Empate!";
    }

    public static void main(String[] args) {
        Random rand = new Random();
        String jogadaPlayer;
        String jogadaCpu;

        System.out.println("Vamos começar o jogo...\n");

        jogadaPlayer = escolhaJogada(recebeJogada());
        System.out.println("Voce escolheu: " + jogadaPlayer + "!");

        jogadaCpu = escolhaJogada(rand.nextInt(1, 6));
        System.out.println("CPU escolheu: " + jogadaCpu + "!");

        System.out.println(compara(jogadaPlayer, jogadaCpu));
    }
}
