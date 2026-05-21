package repeticao;

import java.util.Scanner;

public class calcFatorial {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("|   Calculo de Fatorial  |");
        System.out.println("-------------------------");

        int n = scanner.nextInt();
        int fat = 1;
        int c = n;
        while (c >=1){
            fat *= c;
            c--;
        }
        System.out.println(fat);
    }
}
