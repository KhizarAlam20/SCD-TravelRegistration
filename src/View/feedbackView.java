package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

//shorturl.at/ipr37
public class feedbackView extends JFrame implements ActionListener {
    JButton back;
    JButton link_btn;
    JButton exit;
    feedbackView() {
        setBounds(486,269,600,344);
//        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 600, 352);
        p1.setLayout(null);
        p1.setBackground(new Color(252, 246, 245));
        add(p1);

        JLabel l = new JLabel("Feedback Form");
        l.setBounds(100, 90, 1000, 40);
        l.setForeground(new Color(252, 246, 245));
        l.setFont(new Font("century gothic", Font.BOLD, 30));
//        l.setForeground(new Color(0, 0, 0));
        p1.add(l);


//

        JTextField link = new JTextField("http://localhost:9494/HelloWorld/");
        link.setBounds(180, 160, 145, 25);
        link.setForeground(new Color(153, 0, 17));
        link.setFont(new Font("century gothic", Font.PLAIN, 13));
        p1.add(link);


        link_btn = new JButton("Go");
        link_btn.setBounds(180, 200, 145, 25);
        link_btn.setBackground(new Color(31, 30, 40));
        link_btn.setForeground(new Color(0, 245, 159));
        link_btn.setFont(new Font("century gothic", Font.BOLD, 13));
        link_btn.setFocusPainted(false); // Remove the border when focused
        link_btn.setFocusable(false);
        link_btn.setBorderPainted(false); // Remove the button border
        link_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        link_btn.addActionListener(this);
        p1.add(link_btn);

         exit = new JButton("Exit");
        exit.setBounds(180, 230, 145, 25);
        exit.setBackground(new Color(31, 30, 40));
        exit.setForeground(new Color(234, 47, 47));
        exit.setFont(new Font("century gothic", Font.BOLD, 13));
        exit.setFocusPainted(false); // Remove the border when focused
        exit.setFocusable(false);
        exit.setBorderPainted(false); // Remove the button border
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exit.addActionListener(this);
        p1.add(exit);

        //image panel //t2 -> grass
        ImageIcon img4 = new ImageIcon(ClassLoader.getSystemResource("icons/abc.jpg"));
        Image img5 = img4.getImage().getScaledInstance(600, 352, Image.SCALE_DEFAULT);
        ImageIcon img6 = new ImageIcon(img5);
        JLabel image2 = new JLabel(img6);
        image2.setBounds(0, 0, 601, 352);
        p1.add(image2);

        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        JEditorPane p;
        if (ae.getSource() == link_btn) {
            String webAppUrl = "http://localhost:9494/HelloWorld/";

            try {
                // Open the default web browser with the specified URL
                Desktop.getDesktop().browse(new URI(webAppUrl));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
//            new linkForPay();

        } else if (ae.getSource() == exit) {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new feedbackView();
    }


}
