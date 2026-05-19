package DesafioUsandoHeranca;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Uchicha sasuke = new Uchicha();
        Scanner sc = new Scanner(System.in);
        cadastroDeNinjas mostrarNinjas = new cadastroDeNinjas();

        int escolhaDoUsuario = 0;
        int contadorDeNinjas = 0;

        while (escolhaDoUsuario != 3) {
            System.out.println("====== MENU ======");
            System.out.println("1 - CADASTRAR NOVO NINJA");
            System.out.println("2 - LISTAR TODOS OS NINJAS");

            escolhaDoUsuario = sc.nextInt();
            sc.nextLine();

            switch (escolhaDoUsuario) {
                case 1:
                    ninja novoNinja = new ninja();
                    System.out.println("Qual o nome do novo ninja?");
                    novoNinja.nome = sc.nextLine();

                    System.out.println("Qual a idade do novo ninja?");
                    novoNinja.idade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Qual a missão do novo ninja?");
                    novoNinja.missao = sc.nextLine();

                    System.out.println("Qual o nível de missão do novo ninja?");
                    novoNinja.nivelDeDificuldade = sc.nextLine();

                    mostrarNinjas.cadastrarNinja(novoNinja);

                    break;
                case 2:
                mostrarNinjas.listarNinjas();
            }
        }
    }
}
