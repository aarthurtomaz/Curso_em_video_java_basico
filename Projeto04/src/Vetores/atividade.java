package Vetores;

import javax.swing.*;
import java.awt.*;

public class atividade extends JFrame {

    private JList<Integer> list1;
    private DefaultListModel<Integer> lista;

    private JButton adicionarButton;
    private JButton removerButton;
    private JButton ordenarButton;
    private JSpinner spinner1;

    public atividade() {
        setTitle("Trabalhando com JList");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // cria o model (onde ficam os dados)
        lista = new DefaultListModel<>();

        // cria o JList e conecta ao model
        list1 = new JList<>(lista);

        // cria spinner (pra escolher número)
        spinner1 = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));

        // cria botões
        adicionarButton = new JButton("Adicionar");
        removerButton = new JButton("Remover");
        ordenarButton = new JButton("Ordenar");

        // adiciona componentes na tela
        add(new JScrollPane(list1));
        add(spinner1);
        add(adicionarButton);
        add(removerButton);
        add(ordenarButton);

        // ação do botão adicionar
        adicionarButton.addActionListener(e -> {
            int valor = (int) spinner1.getValue();
            lista.addElement(valor); // adiciona no JList
        });

        // ação do botão remover
        removerButton.addActionListener(e -> {
            int index = list1.getSelectedIndex();

            if (index != -1) {
                lista.remove(index); // remove item selecionado
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um item!");
            }
        });

        // ação do botão ordenar
        ordenarButton.addActionListener(e -> {
            int tamanho = lista.size();

            int[] vetor = new int[tamanho];

            // copia dados da lista para vetor
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = lista.get(i);
            }

            // ordena
            java.util.Arrays.sort(vetor);

            // limpa e adiciona ordenado
            lista.removeAllElements();
            for (int v : vetor) {
                lista.addElement(v);
            }
        });
    }

    // método principal (obrigatório pra rodar)
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new atividade().setVisible(true);
        });
    }
}