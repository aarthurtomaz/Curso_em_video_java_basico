package resolucaotela;

import java.awt.*;
import java.util.Locale;

public class resolucaotela {
    static void main() {
        System.out.println();

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = resolucao.width;
        int altura = resolucao.height;

        System.out.println("A resolução da tela é " + largura + "x" + altura );
    }
}
