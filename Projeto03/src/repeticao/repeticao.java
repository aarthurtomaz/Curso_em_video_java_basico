package repeticao;
public class repeticao {
    static void main() {
        int cc = 0;
        int repet = 0;
        //repetição com teste no inicio
        while (cc <10){
            cc++;
            if (cc == 2||cc == 3 || cc == 4){
                //esconde os numeros acima e continua a contagem
                continue;
            }
            if (cc == 7){
                //chega no numero acima e para a contagem
                break;
            }
            System.out.println("cambalhota "+ cc +" !!");
        }

        System.out.println("________________________");

        //repetição com teste no final
        do {
            System.out.println("repetindo " + repet + " vezes!!");
            repet++;
        } while (repet<4);
    }
}
