package Multiplicacao;
public class Multiplicacao {
    static void main() {
        int A = 4;
        int B = 5;
        int C = A * B;

        System.out.println("a multiplicação de A com B é: " +C);


        System.out.println("==================================");
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        System.out.println(v0 +" "+v1 +" "+ v2);

        System.out.println("==================================");

        int total = 0;
        int c[] = new int[13];
        for (int i = 0; i<c.length; i++) {
            c[i] = i + i;
        }
        for (int i = 0; i<c.length; i++) {
            total += c[i];
        }
        System.out.println(total);
    }
}

