package Busca_Binaria_no_Mundo_dos_Feiticos;

/*
    Descrição: Em um mundo mágico, os feitiços são armazenados em uma lista ordenada.
    Implemente uma busca binária para encontrar o feitiço específico em um conjunto de feitiços.

    Exemplo: A lista de feitiços: ["Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"].

    Entrada: Feitiço a ser encontrado: "Expelliarmus"

    Saída esperada: "Feitiço encontrado na posição 2"
*/

import java.util.Arrays;
import java.util.Scanner;

public class BuscarFeiticos {

    // Busca o array de feitiços e retorna a mensagem formatada
    public static String verificarFeitico(String[] feiticos, String feitico) {
        String mensagem = "";
        for (int i = 0; i < feiticos.length; i++) {
            if(feitico.equals(feiticos[i])) {
                mensagem = "Feitiço " + feiticos[i] + " foi encontrado na posição " + (i + 1);
            }
        }
        return mensagem;
    }

    // Metodo principal com todos os feitiços para serem pesquisados
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] feiticos = {
                "Expecto Patronum", "Densaugeo", "Nox", "Protego Horribilis", "Silencio",
                "Avada Kedavra", "Wingardium Leviosa", "Conjunctivitis", "Expelliarmus", "Oppugno",
                "Morsmordre", "Riddikulus", "Incendio", "Tarantallegra", "Colloportus",
                "Protego Totalum", "Bombarda", "Reducto", "Sonorus", "Imperio",
                "Alohomora", "Petrificus Totalus", "Legilimens", "Scourgify", "Obliviate",
                "Finite Incantatem", "Accio", "Crucio", "Levicorpus", "Flagrate",
                "Reparo", "Diffindo", "Locomotor", "Episkey", "Gemino",
                "Tergeo", "Relashio", "Desilusionar", "Ferula", "Homenum Revelio",
                "Engorgio", "Quietus", "Liberacorpus", "Evanesco", "Orchideous",
                "Aparecium", "Protego", "Stupefy", "Muffliato", "Confundus",
                "Waddiwasi", "Obscuro", "Salvio Hexia", "Incarcerous", "Portus"
        };

        Arrays.sort(feiticos);

        System.out.println("Digite o nome do feitiço que deseja buscar");
        String feiticoEscolhido = sc.next();
        System.out.println(" ");

        System.out.println(verificarFeitico(feiticos, feiticoEscolhido));;
    }
}
