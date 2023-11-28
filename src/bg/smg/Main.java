package bg.smg;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setTitle("Tetris");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(250, 600);
        mainWindow.setVisible(true);
        mainWindow.getBlocksPanel().move();
    }
}
