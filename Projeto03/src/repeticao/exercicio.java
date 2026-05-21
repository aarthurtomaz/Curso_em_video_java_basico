package repeticao;

import javax.swing.JOptionPane;

public class exercicio {
    static void main(String[] args) {

        // variável que recebe o número digitado
        int n = 0;
        // soma de todos os números digitados
        int s = 0;
        // quantidade total de valores (sem contar o 0)
        int totVal = 0;
        // quantidade de números pares
        int totPar = 0;
        // quantidade de números ímpares
        int totimpar = 0;
        // quantidade de números acima de 100
        int acima100 = 0;
        // média dos valores (calculada no final)
        int media = 0;

        // estrutura de repetição: executa pelo menos uma vez
        do {

            // pede um número para o usuário
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe um numero: (Valor 0 interrompe)"));

            // verifica se o número é diferente de 0 (0 encerra o programa)
            if (n != 0) {
                // incrementa o total de valores digitados
                totVal++;

                // soma o valor digitado
                s += n;

                // verifica se o número é par
                if (n % 2 == 0) {
                    totPar++; // incrementa total de pares
                } else {
                    totimpar++; // incrementa total de ímpares
                }

                // verifica se o número é maior que 100
                if (n > 100) {
                    acima100++; // incrementa contador
                }
            }

        } while (n != 0); // repete até o usuário digitar 0

        // calcula a média (somente se houver valores)
        if (totVal > 0) {
            media = s / totVal;
        }

        // exibe o resultado final
        JOptionPane.showMessageDialog(null,
                "<html>Resultado final<hr>" +
                        "<br>Total de valores: " + totVal +
                        "<br>Total de pares: " + totPar +
                        "<br>Total de ímpares: " + totimpar +
                        "<br>Acima de 100: " + acima100 +
                        "<br>Média dos valores: " + media);

    }
}