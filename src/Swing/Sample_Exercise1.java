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

        panelIzq.setLayout(new BoxLayout(panelIzq, BoxLayout.Y_AXIS));
        panelDer.setLayout(new BoxLayout(panelDer, BoxLayout.Y_AXIS));

        panelIzq.add(new JLabel("Age:"));
        JComboBox combo0=new JComboBox();
        combo0.setPreferredSize(new Dimension(100,50));
        panelIzq.add(combo0);
        JPanel panelIn = new JPanel();

        panelDer.add(new JLabel("Name:"));
        JTextField Jtf0= new JFormattedTextField();
        panelDer.add(Jtf0);

        frame0.getContentPane().add(panelIzq);
        frame0.getContentPane().add(panelDer);

        JPanel panelRB = new JPanel();
        panelRB.setPreferredSize(new Dimension(50,60));
        panelRB.setLayout(new BoxLayout(panelRB, BoxLayout.Y_AXIS));
        panelRB.setBorder(BorderFactory.createLoweredBevelBorder());
        panelIzq.add(panelRB);

        ButtonGroup grupo1 = new ButtonGroup();
        JRadioButton jrb0=new JRadioButton("txt1",true);
        JRadioButton jrb1=new JRadioButton("txt2",false);
        grupo1.add(jrb0);
        grupo1.add(jrb1);
        panelRB.add(jrb0);
        panelRB.add(jrb1);

        frame0.pack();
        frame0.setVisible(true);
    }

    public static void main(String[] args) {
        showFrame();
    }
}
