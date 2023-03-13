package Swing.Milestones;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Milestone1_2 {
    public static void top(JFrame frame0){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.X_AXIS));
        frame0.add(north, BorderLayout.NORTH);
        JPanel nPanel = new JPanel();
        nPanel.setLayout(new FlowLayout());
        north.add(nPanel);

        JCheckBox checkBox1 = new JCheckBox("katniss",true);
        checkBox1.setBounds(100,100, 50,50);
        JCheckBox checkBox2 = new JCheckBox("Peeta");
        checkBox2.setBounds(100,150, 50,50);

        nPanel.add(checkBox1);
        nPanel.add(checkBox2);
    }
    public static void right(JFrame frame0){

        JPanel east = new JPanel();
        east.setLayout(new BoxLayout(east, BoxLayout.X_AXIS));
        frame0.add(east, BorderLayout.EAST);
        JPanel ePanel = new JPanel();
        ePanel.setLayout(new BoxLayout(ePanel, BoxLayout.Y_AXIS));
        ePanel.setPreferredSize(new Dimension(100,250));
        east.add(ePanel);
        ButtonGroup grupo1 = new ButtonGroup();
        JRadioButton jrb0=new JRadioButton("OPT 1",true);
        JRadioButton jrb1=new JRadioButton("OPT 2",false);
        JRadioButton jrb2=new JRadioButton("OPT 3",false);
        grupo1.add(jrb0);
        grupo1.add(jrb1);
        grupo1.add(jrb2);
        ePanel.add(jrb0);
        ePanel.add(jrb1);
        ePanel.add(jrb2);
    }
    public static void middle(JFrame frame0){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(2, 2));
        frame0.add(center, BorderLayout.CENTER);
        for(int i = 0; i < 4; i++) {

            center.add(new JLabel(new ImageIcon ("./src/Swing/Milestones/1.png")));
        }
    }
    public static void down(JFrame frame0){
        JPanel south = new JPanel();
        south.setLayout(new BoxLayout(south, BoxLayout.X_AXIS));
        frame0.add(south, BorderLayout.SOUTH);
        JPanel sPanel = new JPanel();
        sPanel.setPreferredSize(new Dimension(600,50));
        sPanel.setLayout(new BoxLayout(sPanel, BoxLayout.X_AXIS));
        south.add(sPanel);
        sPanel.add(new JButton("But1"));
        sPanel.add(new JButton("But2"));
    }

    public static void showFrame(){
        JFrame frame0 = new JFrame("FrameDemo");
        frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame0.setPreferredSize(new Dimension(600,300));

        Container container = frame0.getContentPane();
        container.setLayout(new BorderLayout());


        top(frame0);


        right(frame0);

        middle(frame0);

        down(frame0);


        frame0.pack();
        frame0.setVisible(true);
    }
    public static void main(String[] args) {
        showFrame();
    }
}
