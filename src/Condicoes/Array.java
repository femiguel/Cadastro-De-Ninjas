package Condicoes;

public class Array {
    public static void main(String[] args) {

        //ARRAY DE STRING
        String[] ninja = new String[5];
        ninja[0] = "Naurto Uzumaki";
        ninja[1] = "Sasuke Uticha";
        ninja[2]= "Sakura Haruno";
        ninja[3]= "Hinata Haruno";
//        System.out.println(ninja[4]);

        //ARRAY IDADE
        /*int[] idade = new int[2];
        idade[0] = 27;
        System.out.println(idade);*/

        //ARRAY BOOLEAN
//        boolean[] verdadeiroOuFalso = new boolean[1];
//        System.out.println(verdadeiroOuFalso[0]);

        //ARRAY TIPO DOUBLE
//        double[] tipoDouble = new double[3];
//        tipoDouble[0] = 1.8;
//        tipoDouble[1] = 1.9;
//        tipoDouble[2] = 2.0;
//        System.out.println(tipoDouble[2]);

        //REDEFINIR UM ARRAY
        ninja = new String[7];
        ninja[0]= "Hashirama Senju";
        ninja[1]= "Tobirama Senju";
        ninja[2]= "Hiruzen Sarutobi";
        ninja[3]= "Tsunade";
        ninja[4]= "Kakashi Hatake";
        ninja[5]= "Naruto Uzumaki";
        //System.out.println("O maior Hokage de todos foi o " + ninja[6]);

        //FOR PARA FAZER LOOP NO ARRAY

        System.out.println("Todos os Hokages que já existiram: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(ninja[i]);

        }





    }
}
