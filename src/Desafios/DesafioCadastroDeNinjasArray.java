package Desafios;

import java.util.Scanner;

public class DesafioCadastroDeNinjasArray {
    public static void mostrarMenu() {
        System.out.println("======= MENU =======");
        System.out.println("1 - Cadastrar ninja");
        System.out.println("2 - Listar ninja");
        System.out.println("3 - Sair");
    }

    public static void main(String[] args) {
        //DECLARAR SCANNER
        Scanner sc = new Scanner(System.in);
        //CRIAR LISTA DE NINJAS (7 NINJAS)
        String ninjas[] = new String[6];

        int opcao = 0;
        int ninjasCadastrados = 0;


        while (opcao != 3) {
            mostrarMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do ninja: ");
                    String nomeNinja = sc.nextLine();
                    ninjas[ninjasCadastrados] = nomeNinja;
                    ninjasCadastrados++;
                    System.out.println("Ninja cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("NINJAS CADASTRADOS");
                    for (int i = 0; i < ninjasCadastrados; i++) {
                        System.out.println(ninjas[i]);

                    } break;
                case 3:
                    System.out.println("Fechando o programa...");
                            break;
            }
        }

        sc.close();
    }


}



