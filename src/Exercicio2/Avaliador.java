package Exercicio2;

import java.util.ArrayList;
import java.util.List;


public class Avaliador {

    public void niveisDeCanditados(List<Candidato> candidatos){

        for(Candidato c : candidatos) {
            String nivel;
            int pontos = 0;
            pontos += c.getQuantidadeProjeto()*2;
            pontos += c.getAnosExperiencia();
            if (c.isConheceSpring()){pontos += 4;}

            if(pontos <= 7){
                nivel = "Estagiario";
            }else nivel = "Junior";


            System.out.println(c.getNome() + " - " + nivel);
        }

    }
}
