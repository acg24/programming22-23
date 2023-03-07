package Swing;

import javax.swing.*;
import java.awt.*;

public class Sample_Exercise1 {
    public static void showFrame(){
        JFrame frame0 = new JFrame("FrameDemo");
        frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame0.setPreferredSize(new Dimension(450,400));

        Container container = frame0.getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));

        JPanel panelIzq = new JPanel();
        JPanel panelDer = new JPanel();

        panelIzq.setPreferredSize(new Dimension(100,200));
        panelDer.setPreferredSize(new Dimension(100,200));

        panelIzq.setBorder(BorderFactory.createTitledBorder("Panel1"));
        panelIzq.setBorder(BorderFactory.createTitledBorder("Panel2"));

        panelIzq.setLayout(new BoxLayout(panelIzq, BoxLayout.Y_AXIS));
        panelDer.setLayout(new BoxLayout(panelDer, BoxLayout.Y_AXIS));


        panelIzq.add(new JLabel("Age:"));
        JComboBox combo=new JComboBox();
        JPanel panelIn = new JPanel();

        panelDer.add(new JLabel("Name:"));
        panelDer.add(new JTextField(30));

        frame0.getContentPane().add(panelIzq);
        frame0.getContentPane().add(panelDer);

        frame0.pack();
        frame0.setVisible(true);
    }

    public static void main(String[] args) {
        showFrame();
    }
}
