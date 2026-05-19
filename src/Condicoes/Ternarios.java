package Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        //declarar scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas missões o Naruto já fez? ");
        int missoesCompletas = sc.nextInt();

        String missaoNivel = (missoesCompletas >+  10) ? "O Naruto possui mais que 10 missões" : "O naruto possui menos que 10 missões";
        System.out.println(missaoNivel);


        sc.close();

    }
}
