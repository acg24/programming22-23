package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*public class test2 extends JFrame implements ActionListener {
    private JLabel outputText;

    private JCheckBox cBox1;
    private JCheckBox cBox2;
    private JCheckBox cBox3;
    private JCheckBox cBox4;



    public test2() {
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
        cBox1 = new JCheckBox("Opción A");
        cBox1.addActionListener(this);
        cBox2 = new JCheckBox("Opción B");
        cBox1.addActionListener(this);
        cBox3 = new JCheckBox("Opción C");
        cBox1.addActionListener(this);
        cBox4 = new JCheckBox("Opción D");
        cBox1.addActionListener(this);

        p.add(cBox1);
        p.add(cBox2);
        p.add(cBox3);
        p.add(cBox4);
    }


    public static void main(String[] args) {
        test2 w = new test2();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        outputText.setText((cBox1.isSelected()? " | Opción A":"")+(cBox2.isSelected()? " | Opción B":"")+(cBox3.isSelected()? " | Opción C":"")+(cBox4.isSelected()? " | Opción D":""));
    }
}*/
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
/*



public class test2 extends JFrame {
    private JLabel outputText;

    private JCheckBox cBox1;
    private JCheckBox cBox2;
    private JCheckBox cBox3;
    private JCheckBox cBox4;



    public test2() {
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
        cBox1 = new JCheckBox("Opción A");
        cBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                outputText.setText((cBox1.isSelected()? " | Opción A":"")+(cBox2.isSelected()? " | Opción B":"")+(cBox3.isSelected()? " | Opción C":"")+(cBox4.isSelected()? " | Opción D":""));
            }
        });
        cBox2 = new JCheckBox("Opción B");
        cBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                outputText.setText((cBox1.isSelected()? " | Opción A":"")+(cBox2.isSelected()? " | Opción B":"")+(cBox3.isSelected()? " | Opción C":"")+(cBox4.isSelected()? " | Opción D":""));
            }
        });
        cBox3 = new JCheckBox("Opción C");
        cBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                outputText.setText((cBox1.isSelected()? " | Opción A":"")+(cBox2.isSelected()? " | Opción B":"")+(cBox3.isSelected()? " | Opción C":"")+(cBox4.isSelected()? " | Opción D":""));
            }
        });
        cBox4 = new JCheckBox("Opción D");
        cBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                outputText.setText((cBox1.isSelected()? " | Opción A":"")+(cBox2.isSelected()? " | Opción B":"")+(cBox3.isSelected()? " | Opción C":"")+(cBox4.isSelected()? " | Opción D":""));
            }
        });


        p.add(cBox1);
        p.add(cBox2);
        p.add(cBox3);
        p.add(cBox4);
    }


    public static void main(String[] args) {
        test2 w = new test2();
    }
}*/


//--------------------------------------------------------------------------------------------------------------------------------------------------------------



public class test2 extends JFrame {
    private JLabel outputText;

    private JCheckBox cBox1;
    private JCheckBox cBox2;
    private JCheckBox cBox3;
    private JCheckBox cBox4;



    public test2() {
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
        cBox1 = new JCheckBox("Opción A");
        cBox1.addActionListener(new JCheckBoxListener());
        cBox2 = new JCheckBox("Opción B");
        cBox2.addActionListener(new JCheckBoxListener());
        cBox3 = new JCheckBox("Opción C");
        cBox3.addActionListener(new JCheckBoxListener());
        cBox4 = new JCheckBox("Opción D");
        cBox4.addActionListener(new JCheckBoxListener());


        p.add(cBox1);
        p.add(cBox2);
        p.add(cBox3);
        p.add(cBox4);
    }
    class JCheckBoxListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            outputText.setText((cBox1.isSelected()? " | Opción A":"")+(cBox2.isSelected()? " | Opción B":"")+(cBox3.isSelected()? " | Opción C":"")+(cBox4.isSelected()? " | Opción D":""));
        }
    }
    public static void main(String[] args) {
        test2 w = new test2();
    }
}
