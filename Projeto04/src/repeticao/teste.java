package repeticao;

import java.util.Scanner;

public class teste {
    static void main(String[] args) {
        int s = 0;
        int n;
        String res;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            n = scanner.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            res = scanner.next();
        } while (res.equals("S"));
        System.out.println("A soma de todos os valores é "+ s);
    }
}
