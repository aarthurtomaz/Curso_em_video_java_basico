package pernas;

import java.util.Scanner;

public class pernas {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantas pernas??");
        int pernas = scanner.nextInt();
        String tipo;
        System.out.println("isso é um(a) ");

        switch (pernas){
            case 1:
                tipo = "saci";
             break;
            case 2:
                tipo = "bipede";
             break;
            case 4:
                tipo ="quadrupede";
             break;
            case 6,8:
                tipo = "aranha";
             break;
            default:
                tipo = "et";
        } System.out.println(tipo);
    }
}
