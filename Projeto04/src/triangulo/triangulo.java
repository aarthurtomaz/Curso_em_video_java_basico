package triangulo;

import java.util.Scanner;

public class triangulo {
    static void main() {
        Scanner scanner =new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("|   Tipos de Triangulo  |");
        System.out.println("-------------------------");

        System.out.println("segmento a:");
        int a = scanner.nextInt();
        System.out.println("segmento b:");
        int b = scanner.nextInt();
        System.out.println("segmento c:");
        int c = scanner.nextInt();

        if (a<b+c && b<a+c && c<a+b){
            System.out.println("formam um triangulo");
            if (a==b && b==c){
                System.out.println("equilatero");
            } else if (a!=b && b!=c && a!=c) {
                System.out.println("escaleno");
            } else System.out.println("isosceles");
        } else System.out.println("não formam um triangulo");
    }
}
