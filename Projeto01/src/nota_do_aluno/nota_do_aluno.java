package nota_do_aluno;
public class nota_do_aluno {
    static void main() {
        String aluno1 = "fulano";
        int nota1 = 8;

        System.out.println("O aluno " +aluno1+ " tirou " +nota1+" no trimestre ");
        if( nota1 < 6){
            System.out.println("Reprovado!");
        } else {
            System.out.println("Aprovado!");
        }
      }
}
