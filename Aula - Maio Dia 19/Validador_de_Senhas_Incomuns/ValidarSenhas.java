package Validador_de_Senhas_Incomuns;

/*
*   Validador de Senhas Incomuns
    Descrição: Verifique se uma senha contém ao menos
    uma letra maiúscula, um número primo, um caractere especial
    e não pode conter vogais duplicadas seguidas.

    Exemplo válido: “B7!tP”

    Exemplo inválido: “A33aaa!”
* */

import java.util.Scanner;

public class ValidarSenhas {

    // Percorre a string usando a classe Character para verificar se é maiusculo
    public static boolean verificarMaiuscula(String senha) {
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isLetter(senha.charAt(i)) && Character.isUpperCase(senha.charAt(i))){
                return true;
            }
        }
        return false;
    }

    // Percorre os principais numeros primos
    public static boolean verificarPrimo(String senha) {
        String num;
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
                num = String.valueOf(senha.charAt(i));
                if (num.equals("2") || num.equals("3") || num.equals("5") || num.equals("7")) {
                    return true;
                }
            }
        }
        return false;
    }

    // Percorre as duas strings para verificar se contém algum caracter especial
    public static boolean verificarEspecial(String senha) {
        String especial = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        for (int i = 0; i < senha.length(); i++) {
            for (int j = 0; j < especial.length(); j++) {
                if (senha.charAt(i) == especial.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Percorre as duas Strings comparando as vogais
    public static boolean verificaVogal(String senha) {
        String vogais = "aeiouAEIOU";
        for (int i = 1; i < senha.length(); i++) {
            for (int j = 0; j < vogais.length(); j++) {
                if (senha.charAt(i) == vogais.charAt(j)) {
                    if (senha.charAt(i) == senha.charAt(i - 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha para ser testada: ");
        String senha = sc.next();

        System.out.print("\nTem Maiuscula? ");
        System.out.println(verificarMaiuscula(senha));

        System.out.print("Tem número primo? ");
        System.out.println(verificarPrimo(senha));

        System.out.print("Tem caracter especial? ");
        System.out.println(verificarEspecial(senha));

        System.out.print("Tem vogal duplicada? ");
        System.out.println(verificaVogal(senha));

    }
}
