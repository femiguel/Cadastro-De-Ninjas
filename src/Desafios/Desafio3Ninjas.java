package Desafios;

public class Desafio3Ninjas {
    public static void main(String[] args) {
        //NINJA 1
        String ninja1 = "Naruto";
        int idadeNinja1 = 14;
        String missaoNinja1 = "Treinar Rasengan";
        char nivelDeDificuldadeNinja1 = 'A';
        Boolean StatusDaMissaoNinja1 = false;

        //NINJA 2
        String ninja2 = "Sasuke";
        int idadeNinja2 = 17;
        String missaoNinja2 = "Derrotar Orochimaru";
        char nivelDeDificuldadeNinja2 = 'C';
        Boolean StatusDaMissaoNinja2 = false;

        //NINJA 3
        String ninja3 = "Sakura";
        int idadeNinja3 = 15;
        String missaoNinja3 = "Treinar técnicas médicas";
        char nivelDeDificuldadeNinja3 = 'B';
        Boolean StatusDaMissaoNinja3 = false;


        System.out.println("Nome do ninja 1 = " + ninja1);
        System.out.println("Idade: = " + idadeNinja1);
        System.out.println("Missão: = " + missaoNinja1);
        System.out.println("Nível de dificuldade: = " + nivelDeDificuldadeNinja1);

        System.out.println("*===========================*");

        System.out.println("Nome do ninja 2 = " + ninja2);
        System.out.println("Idade: = " + idadeNinja2);
        System.out.println("Missão: = " + missaoNinja2);
        System.out.println("Nível de dificuldade: = " + nivelDeDificuldadeNinja2);

        System.out.println("*===========================*");

        System.out.println("Nome do ninja 3 = " + ninja3);
        System.out.println("Idade: = " + idadeNinja3);
        System.out.println("Missão: = " + missaoNinja3);
        System.out.println("Nível de dificuldade: = " + nivelDeDificuldadeNinja3);

        System.out.println("Missão 1");

        if (idadeNinja1 > 15){
            StatusDaMissaoNinja1 = true;
        } else if (nivelDeDificuldadeNinja1 == 'C' || nivelDeDificuldadeNinja1 == 'D'){
            StatusDaMissaoNinja1 = true;
        } else {
            StatusDaMissaoNinja1 = false;
        }
        if (StatusDaMissaoNinja1 == true){
            System.out.println("Missão concluída");
        } else {
            System.out.println("Missão não concluída");
        }

        System.out.println("Missão 2");
        if (idadeNinja2 > 15){
            StatusDaMissaoNinja2 = true;
        } else if (nivelDeDificuldadeNinja2 == 'C' || nivelDeDificuldadeNinja2 == 'D') {
            StatusDaMissaoNinja2 = true;
        } else {
            StatusDaMissaoNinja2 = false;
        }
        if (StatusDaMissaoNinja2 == true){
            System.out.println("Missão concluída");
        } else {
            System.out.println("Missão não concluída");
        }

        System.out.println("Missão 3");
        if (idadeNinja3 > 15){
        StatusDaMissaoNinja3 = true;
        } else if (nivelDeDificuldadeNinja3 == 'C' || nivelDeDificuldadeNinja3 == 'D' ) {
        StatusDaMissaoNinja3 = true;
        } else {
       StatusDaMissaoNinja3 = false;
        }
        if (StatusDaMissaoNinja3 == true){
            System.out.println("Missão concluída");
        } else {
            System.out.println("Missão não concluída");
          }
        }
    }

