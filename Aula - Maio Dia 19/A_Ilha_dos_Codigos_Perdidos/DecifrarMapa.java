package A_Ilha_dos_Codigos_Perdidos;

/*
    Descrição: Imagine que você encontrou um mapa com códigos misteriosos.
    Cada código é uma sequência de números e letras (como "4H", "7A", "2C").
    Cada número representa a quantidade de vezes que a letra deve ser repetida.
    Escreva um programa que reconstrua o código original.

    Entrada: ["4H", "7A", "2C"]

    Saída esperada: "HHHHAAAAAAAC"
*/

import java.util.Scanner;

public class DecifrarMapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código para ser decifrado: ");
        String codigo = sc.next();

        System.out.println(codigo);

    }
}
