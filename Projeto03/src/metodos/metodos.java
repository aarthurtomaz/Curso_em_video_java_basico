package metodos;
public class metodos {
    //tipo inteiro soma (a e b)
    static int soma(int a, int b){
        int s = a+ b;
        return s;

    }
    //procedimento MAIN sempre vira primeiro que os outros procedimentos
    static void main(String[] args) {
        System.out.println("Começou o programa");
        int sm = soma(5,2);
        System.out.println("A soma é: "+sm);

        System.out.println("-------------------------------------");

        //contador vindo de outra classe
        System.out.println("vai começar a contagem");
        System.out.println(operacoes.contador(1,5));
    }
}
