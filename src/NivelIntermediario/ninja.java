package NivelIntermediario;

public class ninja {
    String nome;
    String aldeia;
    int idade;


    //O METODO VOID NÃO RETORNA VALOR NENHUM

    //METODO PUBLICO DO TIPO STRING
    public String euSouUmNinja(){
        return "Oi, eu sou um ninja";
    }

    //METODO INT
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
