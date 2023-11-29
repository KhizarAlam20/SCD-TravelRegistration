package View;


import Controller.WelcomeScreenController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreenView extends JFrame {
    public JButton login;
    public JButton exit;
    public JButton loginUser;

    public WelcomeScreenView() {
        setSize(600, 344);
        setLocation(350, 200);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(252, 246, 245));
        p1.setBounds(0, 0, 900, 400);
        p1.setLayout(null);
        add(p1);

        JLabel l = new JLabel("Travel Management System");
        l.setBounds(100, 150, 1000, 36);
        l.setBackground(new Color(252, 246, 245));
        l.setFont(new Font("century gothic", Font.BOLD, 30));
        l.setForeground(new Color(255, 252, 252));
        p1.add(l);

        // User Button
        login = new JButton("User");
        login.setBounds(127, 278, 104, 25);
        login.setBackground(new Color(31, 30, 40));
        login.setForeground(new Color(255, 255, 255));
        login.setFont(new Font("century gothic", Font.BOLD, 13));
        login.setFocusPainted(false);
        login.setFocusable(false);
        login.setBorderPainted(false);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setActionCommand("UserButton");
        p1.add(login);

        // Admin Button
        loginUser = new JButton("Admin");
        loginUser.setLayout(null);
        loginUser.setBounds(248, 278, 104, 25);
        loginUser.setBackground(new Color(31, 30, 40));
        loginUser.setForeground(new Color(255, 255, 255));
        loginUser.setFont(new Font("century gothic", Font.BOLD, 13));
        loginUser.setFocusPainted(false);
        loginUser.setFocusable(false);
        loginUser.setBorderPainted(false);
        loginUser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginUser.setActionCommand("AdminButton");
        p1.add(loginUser);

        // Quit Button
        exit = new JButton("Quit");
        exit.setBounds(368, 278, 104, 25);
        exit.setBackground(new Color(31, 30, 40));
        exit.setForeground(new Color(248, 54, 54));
        exit.setFont(new Font("century gothic", Font.BOLD, 13));
        exit.setFocusPainted(false);
        exit.setFocusable(false);
        exit.setBorderPainted(false);
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit.setActionCommand("QuitButton");
        p1.add(exit);

        // Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/abc.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 344, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 600, 344);
        p1.add(image);

        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new WelcomeScreenController(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WelcomeScreenView());
    }
}
