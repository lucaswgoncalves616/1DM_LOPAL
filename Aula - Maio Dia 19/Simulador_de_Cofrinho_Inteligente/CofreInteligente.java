package Simulador_de_Cofrinho_Inteligente;

import java.util.Scanner;
/*
    Desafio:
    Simulador de Cofrinho Inteligente
    Descrição: O usuário informa quantas moedas de cada valor ele inseriu no cofre (0.01, 0.05, 0.10, 0.25, 0.50 e 1 real).
    Calcule o total e dê sugestões de quanto falta para atingir R$ 100.

    Extra: Mostre quanto tempo levaria para juntar R$ 100 se ele repetir o mesmo depósito a cada semana.
 */

public class CofreInteligente {
    public static double calcularMoeda(double moeda, double quantidade) {
        return moeda * quantidade;
    }

    // Verificar o tipo de moeda que o usuário colocou
    public static double entradaMoeda() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double moeda = 0;

        System.out.println("Escolha a opção do valor da moeda que foi adicionado: ");
        System.out.println("""
                Opção 1 = 1 Centavo
                Opção 2 = 5 Centavos
                Opção 3 = 10 Centavos
                Opção 4 = 25 Centavos
                Opção 5 = 50 Centavos
                Opção 6 = 1 Real""");
        System.out.print("Digite a opção: ");

        do {
            opcao = sc.nextInt();
            System.out.print("\n");
            if (opcao >= 1 && opcao < 7) {
                moeda = switch (opcao) {
                    case 1 -> 0.01;
                    case 2 -> 0.05;
                    case 3 -> 0.10;
                    case 4 -> 0.25;
                    case 5 -> 0.50;
                    case 6 -> 1;
                    default -> moeda;
                };
                break;
            } else {
                System.out.print("Opção inválida!\nDigite novamente: ");
            }
        } while (true);
        return moeda;
    }

    // Calcular quantas semanas falta para chegar em 100
    public static String semanasParaCem(double total) {
        if (total < 100) {
            return "Com esse mesmo depósito, levaria aproximadamente\n" + String.format("%.1f", 100 / total) +
                    " semanas para chegar em RS 100,00";
        } else {
            return "Meta atingida";
        }
    }

    // Entrada da quantidade de moedas
    public static double entradaQuantidade() {
        Scanner sc = new Scanner(System.in);
        double quantidade;

        System.out.print("Digite a quantidade dessa moeda: ");
        do {
            quantidade = sc.nextDouble();
            if (quantidade > 0) {
                break;
            } else {
                System.out.print("Valor inválido!\nDigite novamente: ");
            }
        } while (true);

        return quantidade;
    }
    
    // Calcula quantas moedas faltam caso o valor colocado não chegou a 100
    public static String paraCem(double total) {
        if (total > 100) {
            return "Parabéns! Voce ultrapassou a meta de R$ 100,00 por " + formatarReal(total - 100);
        } else if (total == 100) {
            return "Parabéns! Voce atingiu a meta de R$ 100,00";
        } else {
            return "Falta " + formatarReal(100 - total) + " para chegar em R$ 100,00";
        }
    }

    // Formatar o valor para mostrar com duas casas decimais e R$
    public static String formatarReal(double valor) {
        return "R$ " + String.format("%.2f", valor);
    }

    // Parte principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moeda;
        double quantidade;
        double total;
        String opcao;

        System.out.println("Vamos calcular o valor do cofrinho:");
        moeda = entradaMoeda();
        quantidade = entradaQuantidade();
        total = calcularMoeda(moeda, quantidade);

        // Lógica para repetir a entrada de dados caso necessário
        do {
            System.out.println("Deseja adicionar mais moedas? (s/n)");
            opcao = sc.nextLine();
            if (opcao.equals("s") || opcao.equals("S") || opcao.equals("sim") || opcao.equals("Sim") || opcao.equals("SIM")) {
                moeda = entradaMoeda();
                quantidade = entradaQuantidade();
                total += calcularMoeda(moeda, quantidade);
            } else {
                break;
            }
        } while (true);

        System.out.println("---------------------------------------------");

        System.out.println("Voce colocou no cofrinho " + formatarReal(total));
        System.out.println(paraCem(total));
        System.out.println(semanasParaCem(total));
    }
}
