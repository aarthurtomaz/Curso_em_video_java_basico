package projeto02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telafatorial {

    private JPanel panelPrincipal;
    private JSpinner txtnum;
    private JLabel formula;
    private JButton button1;
    private JLabel resultado;
    private JPanel painelprincipal;


    public telafatorial() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtnum.getValue().toString());
                Fatorial f = new Fatorial();
                f.setvalor(n);

                formula.setText(f.getFormula());
                resultado.setText(Integer.toString(f.getFatorial()));
            }
        });
    }

    public JPanel getPanel() {
        return painelprincipal;
    }


        public static void main(String[] args) {
            JFrame frame = new JFrame("Fatorial");
            frame.setContentPane(new telafatorial().getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

        }

}
