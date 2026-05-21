package repeticao;

public class var_controle {
    static void main(String[] args) {
        /*
        for ( int cc = 0; cc <= 3; cc++){
            System.out.println("Cambalhota "+ cc);
        }*/

        /*int cc = 0;
        while (cc<4){
            System.out.println("Cambalhota "+ cc);
            cc++;
        }*/

        //teste de mesa
        for (int i =1; i<=3; i++){
            for (int j = 0; j <=2; j++){
                System.out.println( i+ "|" + j);
            }
        }
    }
}
