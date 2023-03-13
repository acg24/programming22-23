package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test3 extends JFrame implements ActionListener {
    private JLabel outputText;

    private JComboBox combo;
    private DefaultComboBoxModel model;


    public test3() {
        Container p = this.getContentPane();

        this.setTitle("Prueba JButtons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                manager.close(); // Closing database
            }
        });

        manager = new PhotographerManager(); // Initializing database*/

        p.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Ventana de prueba");


        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new BoxLayout(panelCentro, BoxLayout.Y_AXIS));
        panelCentro.setBackground(Color.BLUE);
        addComponentsToCneter(panelCentro);

        outputText = new JLabel();
        outputText.setPreferredSize(new Dimension(120, 40));

        p.add("North", titulo);
        p.add("Center", panelCentro);
        p.add("South", outputText);

        this.setVisible(true);
        this.setSize(300, 200);
    }

    public void addComponentsToCneter(Container p) {
        combo = new JComboBox();
        combo.addActionListener(this);
        model = new DefaultComboBoxModel();

        combo.setModel(model);

        model.addElement(new Band("Taylor Swift", "Fearless"));
        model.addElement(new Band("Eminem", "The Marshall Matters"));
        model.addElement(new Band("Muse", "Supermassive Black Hole"));

        //combo.setBounds(10, 10, 120, 20);

        p.add(combo);
    }


    public static void main(String[] args) {
        test3 w = new test3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox source = (JComboBox) e.getSource();

        if (source==combo){
            Band b0 = (Band) source.getSelectedItem();
            outputText.setText(b0.getGroup() + " " + b0.getCD());
        }

    }
}
