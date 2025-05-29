package Sistema_de_Votacao_para_o_Mascote_da_Turma;

/*
    Sistema de Votação para o Mascote da Turma
    Descrição: Crie um sistema de votação simples com candidatos
    Permita múltiplos votos até que o usuário digite "fim".
    Mostre o resultado com porcentagens.
*/

import java.util.Scanner;

public class SistemaVotacao {
    String nome;
    int votos;

    public SistemaVotacao (String nome, int votos) {
        this.nome = nome;
        this.votos = votos;
    }

    public static void mostrarResultado(SistemaVotacao candidato1, SistemaVotacao candidato2, SistemaVotacao candidato3, int total) {
        System.out.println( "\nNome: " + candidato1.nome + "\tVotos: " + candidato1.votos +
                            "\nNome: " + candidato2.nome + "\tVotos: " + candidato2.votos +
                            "\nNome: " + candidato3.nome + "\tVotos: " + candidato3.votos);
        System.out.println(" ");


        if (candidato1.votos >= candidato2.votos && candidato1.votos >= candidato3.votos) {
            System.out.println(candidato1.nome + " Ganhou!");
        } else if (candidato2.votos >= candidato1.votos && candidato2.votos >= candidato3.votos) {
            System.out.println(candidato2.nome + " Ganhou!");
        } else {
            System.out.println(candidato3.nome + " Ganhou!");
        }

        System.out.println("Resultado: ");
        System.out.print(candidato1.nome + ": " + ((candidato1.votos * 100) / total) + "%");
        System.out.print("\t" + candidato2.nome + ": " + ((candidato2.votos * 100) / total) + "%");
        System.out.print("\t" + candidato3.nome + ": " + ((candidato3.votos * 100) / total) + "%");
    }

    public static int votacao(SistemaVotacao candidato1, SistemaVotacao candidato2, SistemaVotacao candidato3) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        int quantidadeVotos = 0;

        System.out.println("Escolha um candidato para votar: ");
        System.out.println("1. " + candidato1.nome);
        System.out.println("2. " + candidato2.nome);
        System.out.println("3. " + candidato3.nome);

        do {
            System.out.println("\nDigite o nome do candidato para votar ou 'fim' para ver o resultado:");
            opcao = sc.next();
            if (opcao.equalsIgnoreCase("fim")) {
                break;
            } else if (opcao.equalsIgnoreCase("bob")) {
                candidato1.votos++;
                quantidadeVotos++;
            } else if (opcao.equalsIgnoreCase("luna")) {
                candidato2.votos++;
                quantidadeVotos++;
            } else if (opcao.equalsIgnoreCase("max")) {
                candidato3.votos++;
                quantidadeVotos++;
            } else {
                System.out.println("\nNome inválido!");
            }
        } while (true);

        return quantidadeVotos;
    }

    public static void main(String[] args) {
        int totalVotos;
        SistemaVotacao bob = new SistemaVotacao("Bob", 0);
        SistemaVotacao luna = new SistemaVotacao("Luna", 0);
        SistemaVotacao max = new SistemaVotacao("Max", 0);

        totalVotos = votacao(bob, luna, max);

        mostrarResultado(bob, luna, max, totalVotos);
    }
}
