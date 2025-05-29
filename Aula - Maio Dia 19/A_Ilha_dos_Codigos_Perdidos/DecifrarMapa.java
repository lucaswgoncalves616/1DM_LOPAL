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
    public static String decifrarCodigo(String codigo) {
        StringBuilder codigoDecifrado = new StringBuilder();
        for (int i = 0; i < codigo.length(); i++) {
            if (Character.isDigit(codigo.charAt(i))){
                int num = Character.getNumericValue(codigo.charAt(i));
                codigoDecifrado.append(String.valueOf(codigo.charAt(i + 1)).repeat(Math.max(0, num)));
//                 for (int j = 0; j < num; j++) {
//                    codigoDecifrado += codigo.charAt(i + 1);
//                }
            }
        }
        return codigoDecifrado.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código para ser decifrado: ");
        String codigo = sc.next();

        System.out.println(decifrarCodigo(codigo));
    }
}