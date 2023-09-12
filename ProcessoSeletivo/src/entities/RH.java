package entities;

import com.sun.tools.javac.Main;
import entities.enums.Ligacao;

import java.util.concurrent.ThreadLocalRandom;

public class RH {
    public void ligar(Candidato candidato) {
        var maximoTentativa = 3;
        for (int inte = candidato.getTentativa(); inte < maximoTentativa; inte++) {
            candidato.setTentativa(inte);
            if (candidato.getTentativa() <= maximoTentativa) {
                String nome = candidato.getNome().toUpperCase();
                if (geraNumero() == Ligacao.Atendeu.getValor()) {
                    System.out.println("CONSEGUIMOS CONTATO COM O(A) " + nome + " APÓS " + (candidato.getTentativa() + 1) + " TENTATIVAS");
                    break;
                } else if(inte == maximoTentativa - 1) {
                    System.out.println("NÃO CONSEGUIMOS CONTATO COM O(A) " + nome);
                }
            }
        }
    }
    public int geraNumero() {
        return ThreadLocalRandom.current().nextInt(0, 2);
    }
}

