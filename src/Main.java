import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame {

    public static void createGUI() {

        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");


        JMenu newMenu = new JMenu("New");

        fileMenu.add(newMenu);

        JMenuItem txtFileItem = new JMenuItem("Text file");

        newMenu.add(txtFileItem);

        JMenuItem imgFileItem = new JMenuItem("Image file");

        newMenu.add(imgFileItem);

        JMenuItem folderItem = new JMenuItem("Folder");

        newMenu.add(folderItem);

        JMenuItem openItem = new JMenuItem("Open");

        fileMenu.add(openItem);

        JMenuItem closeItem = new JMenuItem("Close");

        fileMenu.add(closeItem);

        JMenuItem closeAllItem = new JMenuItem("Close all");

        fileMenu.add(closeAllItem);

        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);

        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
//                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }
}