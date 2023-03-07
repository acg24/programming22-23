package Swing;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.File;

public class Milestone1 {
    public static void frame0(){
        JFrame frame0 = new JFrame("FrameDemo");
        frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label0 = new JLabel("");

        label0.setPreferredSize(new Dimension(450, 400));
        frame0.getContentPane().add(label0, BorderLayout.CENTER);
        JFileChooser jfc0= new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc0.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc0.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
        }
        label0.add("test", jfc0);
        frame0.pack();
        frame0.setVisible(true);
    }
    public static void main(String[] args) {
        frame0();
    }
}
