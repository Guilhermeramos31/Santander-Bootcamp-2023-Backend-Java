import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int[] parameters = new int[2];
    public static void main(String[] args){
            parameters[0] = inputParameters();
            parameters[1] = inputParameters();
        try {
            count(parameters);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
    static int inputParameters(){
        System.out.print("Digite um parametro: ");
        return scanner.nextInt();
    }
    static void count(int[] parameters) throws ParametrosInvalidosException {
        if (parameters[1] < parameters[0]){
            throw new ParametrosInvalidosException("Segundo parametro é menor que o primeiro.");
        }
        int comtagem = parameters[1] - parameters[0];
        for (int inte = 0; inte < comtagem ; inte++) {
            System.out.print(inte + " ");
        }
    }
}