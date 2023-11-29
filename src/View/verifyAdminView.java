package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class verifyAdminView extends JFrame implements ActionListener {
    JButton verify, clear_btn;
    JTextField textField;

  public  verifyAdminView() {
        setSize(600, 344);
        setLocation(350, 200);
        setLayout(null);

        //panel
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(252, 246, 245));
        p1.setBounds(0, 0, 600, 344);
        p1.setLayout(null);
        add(p1);

        JLabel l = new JLabel("Admin Verify:");
        l.setBounds(100, 90, 1000, 40);
        l.setForeground(new Color(252, 246, 245));
        l.setFont(new Font("century gothic", Font.BOLD, 30));
//        l.setForeground(new Color(0, 0, 0));
        p1.add(l);


        //adding
        JLabel userName = new JLabel("PIN :");
        userName.setBounds(100, 120, 500, 100);
        userName.setForeground(new Color(255, 255, 255));
        userName.setFont(new Font("century gothic", Font.BOLD, 18));
        p1.add(userName);

        textField = new JTextField("Enter Admin Pin");
        textField.setBounds(180, 160, 145, 25);
        textField.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(textField);


        verify = new JButton("Verify");
        verify.setBounds(180, 200, 145, 25);
        verify.setBackground(new Color(31, 30, 40));
        verify.setForeground(new Color(0, 245, 159));
        verify.setFont(new Font("century gothic", Font.BOLD, 13));
        verify.setFocusPainted(false); // Remove the border when focused
        verify.setFocusable(false);
        verify.setBorderPainted(false); // Remove the button border
        verify.setCursor(new Cursor(Cursor.HAND_CURSOR));
        verify.addActionListener(this);
        p1.add(verify);


        clear_btn = new JButton("BACK");
        clear_btn.setBounds(180, 230, 145, 25);
        clear_btn.setBackground(new Color(31, 30, 40));
        clear_btn.setForeground(new Color(245, 64, 64));
        clear_btn.setFont(new Font("century gothic", Font.BOLD, 11));
        clear_btn.setFocusPainted(false); // Remove the border when focused
        clear_btn.setFocusable(false);
        clear_btn.setBorderPainted(false); // Remove the button border
        clear_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        clear_btn.addActionListener(this);
        p1.add(clear_btn);


        //image
        ImageIcon abc1 = new ImageIcon(ClassLoader.getSystemResource("icons/abc.jpg"));
        Image abc2 = abc1.getImage().getScaledInstance(600, 344, Image.SCALE_DEFAULT);
        ImageIcon abc3 = new ImageIcon(abc2);
        JLabel abc = new JLabel(abc3);
        abc.setBounds(0, 0, 600, 344);
        p1.add(abc);


        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == verify) {
            if (textField.getText().equalsIgnoreCase("0981")) {
                setVisible(false);
                new LoginView();
                //System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong input given!!");
            }
        } else if (e.getSource() == clear_btn) {
            setVisible(false);
            new WelcomeScreenView();
        }
    }

    public static void main(String[] args) {
        new verifyAdminView();
    }
}
