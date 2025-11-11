package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Candidato c1 = new Candidato("Luis",1,3,true);
        Candidato c2 = new Candidato("lucas",2,1,false);
        Candidato c3 = new Candidato("lara",0,1);
        Candidato c4 = new Candidato("laura",0,6);

        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(c1);
        candidatos.add(c2);
        candidatos.add(c3);
        candidatos.add(c4);

        Avaliador avaliador = new Avaliador();
        avaliador.niveisDeCanditados(candidatos);
    }
}
