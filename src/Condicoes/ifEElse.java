package Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - Condições
        * Else if
        * Else - Resultado caso nada seja verdadeiro
        * Objetivo: Passar um ninja de nível de acordo com o tanto de missões
        * */



        // Ninja naruto
        String nome = "Naruto";
        String rank;
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 8;


        // se (condicao) {faca isso}

        if (numeroDeMissoes > 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounim");
        } else {
            System.out.println("Rank: Gennim");
        }



    }
}
