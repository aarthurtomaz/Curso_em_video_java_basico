package repeticao;

import javax.swing.*;
import java.util.Scanner;

public class contpassos {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inicio:");
        int in = scanner.nextInt();

        System.out.println("Fim:");
        int fim = scanner.nextInt();

        System.out.println("Passos:");
        int passos = scanner.nextInt();

        DefaultListModel lista = new DefaultListModel();

        for (int c = in; c <= fim; c += passos){

                lista.addElement(c);
        }

        System.out.println(lista);
    }
}
