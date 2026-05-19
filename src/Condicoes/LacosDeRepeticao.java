package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        //WHILE -->     while (condicao) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int maximoClones = 40;

       /* while (numeroDeClones <= maximoClones) {
            numeroDeClones++;
            System.out.println("Naruto criou o clone n° " + numeroDeClones);
        }*/

        for (int i = 0; i < maximoClones; i++) {
            System.out.println("O naruto duplicou o clone " + i);
        }
        

    }
}
