package DesafioUsandoHeranca;

import java.util.ArrayList;

public class cadastroDeNinjas {
    ArrayList<ninja> listaDeNinjas = new ArrayList<>();

    public void cadastrarNinja(ninja novoNinja) {
        listaDeNinjas.add(novoNinja);
        System.out.println("Ninja cadastrado com sucesso");
    }

    public void listarNinjas() {
        if (listaDeNinjas.isEmpty()) {
            System.out.println("Nenhum ninja cadastrado");
        }
        for (ninja ninjaAtual : listaDeNinjas) {
            ninjaAtual.mostrarInformcaoes();
        }
    }

}
