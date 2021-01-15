package ru.ssau.tk.alexanderkhkh.FirstRep.ui;

import javax.swing.*;
import java.awt.*;

public class Window {

    public Window() {
        JFrame window = new JFrame("Конец");
        Image image = new ImageIcon("getimg.jfif").getImage();
        window.setContentPane(new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                g.drawImage(image, 0, 0, null);
            }
        });
        window.setSize(600, 550);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Window();
    }
}
