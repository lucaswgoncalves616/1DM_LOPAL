package Ranking_de_Super_Herois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

/*
    Ranking de Super-Heróis
    Descrição: Crie uma lista de heróis com atributos
    (força, inteligência, velocidade).
    Ordene-os com base em uma fórmula de "poder total" (personalizável).

    Extras: Permitir que o usuário crie novos heróis e compare dois.
* */

public class RankearHeroi {

    // Adiciona novos heróis dinamicamente
    public static ArrayList adicionarHeroi() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> heroi = new ArrayList<>();

        System.out.println("\nVamos adicionar um novo herói.");

        System.out.print("Digite o nome do herói: ");
        heroi.add(sc.nextLine());
        System.out.println(" ");

        heroi.add(validarPoder("força"));
        heroi.add(validarPoder("inteligencia"));
        heroi.add(validarPoder("velocidade"));
        heroi.add(((int) heroi.get(1) + (int) heroi.get(2) + (int) heroi.get(3)) / (heroi.size() - 1));

        return heroi;
    }

    // Formata os herois para mostrar na tela
    public static String mostrarHerois(ArrayList<ArrayList<Object>> herois) {
        Collections.sort(herois, (a, b) -> {
            int totalA = (int) a.get(4);
            int totalB = (int) b.get(4);
            return Integer.compare(totalB, totalA); // decrescente
        });

        StringBuilder mostrarHerois = new StringBuilder();

        System.out.print("\nHeróis: ");
        for (ArrayList<Object> objects : herois) {
            mostrarHerois.append("\nNome:").append(objects.get(0)).append("\tForça: ").append(objects.get(1)).append("\tInteligencia: ").append(objects.get(2)).append("\t\tVelocidade: ").append(objects.get(3)).append("\tTotal: ").append(objects.get(4));
        }

        return mostrarHerois.toString();
    }

    // Validação para atribuir o poder ao super heroi
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
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Object>> herois = new ArrayList<>();
        int opcao = 0;

        System.out.println("Bem vindo ao cadastro de heróis!");
        System.out.println("Vamos adicionar heróis: ");
        herois.add(adicionarHeroi());

        do {
            System.out.println("\nDigite o numero da opção desejada: ");
            System.out.println("""
                    1. Mostrar heróis existentes
                    2. Adicionar um novo herói
                    3. Sair
                    """);
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println(mostrarHerois(herois));
            } else if (opcao == 2) {
                System.out.println(herois.add(adicionarHeroi()));
            } else if (opcao == 3) {
                break;
            }
        } while (true);

    }
}
