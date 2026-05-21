package Vetores;


import java.util.Arrays;

public class Vetores {
    static void main(String[] args) {
        int n[] = {5,8,4,3,9,1,6,2};

        for (int c=0; c <=n.length -1; c++){
            System.out.println("na posição "+ c + " temos o valor " +n[c]);
        }

        System.out.println("--------------------------------------------");

        String mes[] = {"jan","fev", "mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
        String tot[] = {"31","28","31","30","31","30","31","31","30","31","30","31"};

        for (int i = 0; i < mes.length; i++){
            System.out.println(mes[i] + " tem "+ tot[i] + " dias.");

        }

        System.out.println("--------------------------------------------");

        double v[] = {2.5,4.3,1.3,.5,8.9,7.3,1.9};

        //deixar em ordem
        Arrays.sort(v);
        for (double valor: v) {
            System.out.println(valor);
        }

        System.out.println("--------------------------------------------");

        int vet[] = {2,5,3,7,5,9,1,0};
        for (int val :vet){
            System.out.println(val + "");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet,7);
        System.out.println("encontrei o valor na posição "+ p);

        System.out.println("--------------------------------------------");

        int q[] =new int[20];
        Arrays.fill(q, 0);
        for (int valor: q){
            System.out.println(valor + "");
        }
    }
}
