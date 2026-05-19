package Desafios;

import java.util.Scanner;

public class DesafioDoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.println("Qual o nome do ninja?");
            String nomeDoNinja = sc.nextLine();
            System.out.println("Qual a idade do ninja?");
            int idadeDoNinja = sc.nextInt();
            sc.nextLine();
        }


        sc.close();
    }

}
