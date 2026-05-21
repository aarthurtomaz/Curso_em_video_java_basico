package idiomasistema;

import java.util.Locale;

public class idiomasistema {
    static void main() {
        //feito só para ter um paragrafo/espaço
        System.out.println();

        //localizando o idioma do sistema operacional
        String idioma = Locale.getDefault().getLanguage();
        String nome = Locale.getDefault().getDisplayLanguage();

        System.out.println("seu sistema está em " + idioma);
        System.out.println(nome);
    }
}
