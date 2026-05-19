package Condicoes;

import java.util.Scanner;

public class AulaSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //USUÁRIO ESCOLHE ENTRE (1, 2 E 3)
        System.out.println("============= ESCOLHA UM NINJA =============");
        System.out.println("1 - Naruto Uzumaki: ");
        System.out.println("2 - Sakura Hanuro: ");
        System.out.println("3 - Sasuke Uticha: ");

        //ESCOLHA DO USUÁRIO SALVO AQUI
        int escolhaDoUsuario = sc.nextInt();

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki!");
                break;
            case 2:
                System.out.println("Você escolher Sakura Haruno, a personagem feminina mais legal");
                break;
            case 3:
                System.out.println("Você escolher Sasuke Uticha, o mais revoltado dos amigos!");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida");
        }


        sc.close();
    }
}
