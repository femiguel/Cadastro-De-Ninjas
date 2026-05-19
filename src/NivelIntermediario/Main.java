package NivelIntermediario;


public class Main {
    public static void main(String[] args) {

        //OBJETO 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 16;
        naruto.aldeia = "Aldeia da folha";
        naruto.ChakaraAlto();


        //OBJETO 2
        Uchicha sasuke = new Uchicha();
        sasuke.nome = "Sasuke Uchicha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da folha";
        sasuke.sharinganAtivado();

       // int quantoTempoFalta = sasuke.anosParaSeTornarHokage(70);
        // System.out.println("Você tem " + sasuke.idade + " anos. Faltam " + quantoTempoFalta + " anos para você se tornar um hokage");

        //OBJETO 3
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 18;
        sakura.aldeia = "Aldeia da folha";
        sakura.ativarCura();


        //OBJETO 4
        Hyuuga hinata = new Hyuuga();
        hinata.nome = "Hinata Hyuga";
        hinata.idade = 16;
        hinata.aldeia = "Aldeia da folha";
        hinata.ativarByakugan();


    }
}
