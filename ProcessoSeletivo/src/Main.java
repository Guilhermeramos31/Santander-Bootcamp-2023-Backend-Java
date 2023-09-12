import entities.Candidato;
import entities.RH;
import entities.enums.Ligacao;
import entities.enums.Salario;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static List nomeCandidatos = List.of("FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE");
    private static ArrayList<Candidato> candidatos = new ArrayList<>();
    private static ArrayList<Candidato> candidatosSelecionados = new ArrayList<>();
    private static RH rh = new RH();

    public static void main(String[] args) {
        nomeCandidatos.forEach(e -> candidatos.add(new Candidato((String) e, gerarSalario())));
        int maxCandidatosSelecionados = 5;
        System.out.println("------------------------------------------");
        candidatos.forEach(e -> {
            if (maiorOuMenor(e)){
                System.out.println("LIGAR PARA O CANDIDATO " + e.getNome());
            } else if(!maiorOuMenor(e)){
                System.out.println("LIGAR PARA O CANDIDATO " + e.getNome() + ", COM CONTRA PROPOSTA.");
            } else {
                System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
            }
            if (maiorOuMenor(e) && candidatosSelecionados.size() < maxCandidatosSelecionados) {
                candidatosSelecionados.add(e);
            }
        });
        System.out.println("------------------------------------------");
        candidatosSelecionados.forEach(e -> System.out.println("Candidato(a): " + e.getNome() + " Salario: " + decimalFormat(e.getSalario())));
        System.out.println("------------------------------------------");
        candidatosSelecionados.forEach( e -> rh.ligar(e));
    }

    static double gerarSalario() {
        return ThreadLocalRandom.current().nextDouble(1800, 2300);
    }

    static String decimalFormat(Number decimal) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(decimal);
    }

    static boolean maiorOuMenor(Candidato salarioCandidato) {
        return salarioCandidato.getSalario() < Salario.Base.getValor();
    }
}