package Swing;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
public class test extends JFrame implements ActionListener {
    private JLabel outputText;

    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3;
    private JRadioButton button4;


    public test() {
        Container p = this.getContentPane();

        this.setTitle("Prueba JButtons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
/*this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                manager.close(); // Closing database
            }
        });

        manager = new PhotographerManager(); // Initializing database*//*


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
        ButtonGroup group = new ButtonGroup();

        button1 = new JRadioButton("Boton 1");
        button1.addActionListener(this);
        button2 = new JRadioButton("Boton 2");
        button1.addActionListener(this);
        button3 = new JRadioButton("Boton 3");
        button1.addActionListener(this);
        button4 = new JRadioButton("Boton 4");
        button1.addActionListener(this);
        button1.setSelected(true);

        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);

        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);

    }


    public static void main(String[] args) {
        test w = new test();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JRadioButton b0= (JRadioButton) actionEvent.getSource();
        if (b0==button1){
            outputText.setText("Button1");
        } else if (b0==button2) {
            outputText.setText("Button2");
        } else if (b0==button3) {
            outputText.setText("Button3");
        } else if (b0==button4) {
            outputText.setText("Button4");
        }
    }
}*/


/*public class test extends JFrame {
    private JLabel outputText;

    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3;
    private JRadioButton button4;


    public test() {
        Container p = this.getContentPane();

        this.setTitle("Prueba JButtons");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        *//*this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                manager.close(); // Closing database
            }
        });

        manager = new PhotographerManager(); // Initializing database*//*

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
        ButtonGroup group = new ButtonGroup();

        button1 = new JRadioButton("Boton 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                outputText.setText("Button1");
            }
        });
        button2 = new JRadioButton("Boton 2");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                outputText.setText("Button2");
            }
        });
        button3 = new JRadioButton("Boton 3");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                outputText.setText("Button3");
            }
        });
        button4 = new JRadioButton("Boton 4");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                outputText.setText("Button1");
            }
        });
        button1.setSelected(true);

        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);

        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);

    }


    public static void main(String[] args) {
        test w = new test();
    }
}*/



public class test extends JFrame {
    private JLabel outputText;

    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3;
    private JRadioButton button4;


    public test() {
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
        ButtonGroup group = new ButtonGroup();

        button1 = new JRadioButton("Boton 1");
        button1.addActionListener(new JButtonListener());
        button2 = new JRadioButton("Boton 2");
        button1.addActionListener(new JButtonListener());
        button3 = new JRadioButton("Boton 3");
        button1.addActionListener( new JButtonListener());
        button4 = new JRadioButton("Boton 4");
        button1.addActionListener(new JButtonListener());
        button1.setSelected(true);

        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);

        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);

    }

    class JButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JRadioButton rb0= (JRadioButton) e.getSource();
            outputText.setText(rb0.getText());
        }
    }

    public static void main(String[] args) {
        test w = new test();
    }
}
