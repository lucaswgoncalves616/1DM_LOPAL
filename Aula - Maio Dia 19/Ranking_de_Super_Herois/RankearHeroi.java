package Ranking_de_Super_Herois;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Ranking de Super-Heróis
    Descrição: Crie uma lista de heróis com atributos
    (força, inteligência, velocidade).
    Ordene-os com base em uma fórmula de "poder total" (personalizável).

    Extras: Permitir que o usuário crie novos heróis e compare dois.
* */

public class RankearHeroi {
    public static ArrayList adicionarHeroi() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> heroi = new ArrayList<>();
        int forca;

        System.out.println("\nVamos adicionar um novo herói.");

        System.out.print("Digite o nome do herói: ");
        heroi.add(sc.nextLine());
        System.out.println(" ");

        heroi.add(validarPoder("força"));
        heroi.add(validarPoder("inteligencia"));
        heroi.add(validarPoder("velocidade"));

        return heroi;
    }

    public static String mostrarHerois(ArrayList<ArrayList<Object>> herois) {
        String mostrarHerois = "";

        System.out.print("\nHeróis: ");
        for (int i = 0; i < herois.size(); i++) {
            mostrarHerois += "\nNome:" + herois.get(i).get(0) + "\tForça: " + herois.get(i).get(1) + "\tInteligencia: " + herois.get(i).get(2) + "\t\tVelocidade: " + herois.get(i).get(3);
        }

        return mostrarHerois;
    }

    public static int validarPoder(String tipoPoder) {
        Scanner sc = new Scanner(System.in);
        int poder;

        do {
            System.out.print("Digite a " + tipoPoder  + " do herói (0 a 10): ");
            poder = sc.nextInt();
            if (poder >= 0 && poder <= 10){
                break;
            } else {
                System.out.println("Valor de " + tipoPoder + " do herói inválido!");
            }
        } while (true);

        return poder;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Object>> herois = new ArrayList<ArrayList<Object>>();

        herois.add(adicionarHeroi());
        herois.add(adicionarHeroi());
        herois.add(adicionarHeroi());

        System.out.println(mostrarHerois(herois));
    }
}
