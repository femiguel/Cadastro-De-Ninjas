package Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
        * O usuário vai criar um Ninja e iremos validar os dados
        * */

        //DECLARAR O SCANNER PARA PODER UTILIZAR METODOS
        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.println("Escreva o nome do ninja");
        String nomeDoNinja = caixaDeTexto.nextLine();


        //Receber a idade do ninja
        System.out.println("Qual a idade do ninja?");
        int idadeDoNinja = caixaDeTexto.nextInt();

        if (idadeDoNinja >= 18) {
            System.out.println("O " + nomeDoNinja + " é maior de idade, ele pode ir para a missão da aldeia da folha");
        } else {
            System.out.println("O " + nomeDoNinja + " é menor de idade, ele não pode ir para a missão da aldeia da folha");
        }





        //Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
