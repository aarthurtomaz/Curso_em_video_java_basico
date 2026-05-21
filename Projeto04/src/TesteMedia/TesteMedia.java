package TesteMedia;

import java.util.Scanner;

public class TesteMedia {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("me de a primeira nota:");
        float n1 = scanner.nextFloat();

        System.out.println("me de a segunda nota:");
        float n2 = scanner.nextFloat();

        float m = (n1+n2)/ 2;
        System.out.println("sua média foi de: "+m+" pontos.");
        if (m >=7){
            System.out.println("parabens! você passou!!");
        } else System.out.println("mais sorte na próxima.");
    }
}
