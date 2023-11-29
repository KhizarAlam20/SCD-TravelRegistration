//1
package View;
//import com.mysql.cj.protocol.Resultset;
import Controller.LoginController;
import Model.adminLoginModel;
import View.adminLoginScreenView;
import Controller.adminLoginController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class adminLoginScreenView extends JFrame implements ActionListener {

    JButton signupBTN, loginBTN, forgot;
    public JCheckBox checkpass;
    public int check = 0;
    public int login = 0, SignUp = 0, Forgot = 0, Exit = 0;
    JTextField userNAME;
    public JPasswordField passWORD;

    adminLoginScreenView() {
        setSize(600, 344);
        setLocation(350, 200);
        setLayout(null);


        //panel
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(252, 246, 245));
        p1.setBounds(0, 0, 600, 344);
        p1.setLayout(null);
        add(p1);

        //////////////////////////////////////////////////////////////////////////////////

        //adding signups
        JLabel systemName = new JLabel("TRAVEL MANAGEMENT SYSTEM");
        systemName.setBounds(100, 70, 1000, 36);
        systemName.setForeground(new Color(252, 246, 245));
        systemName.setFont(new Font("century gothic", Font.BOLD, 30));
        p1.add(systemName);

        //adding user name
        JLabel userName = new JLabel("USERNAME :");
        userName.setBounds(170, 140, 500, 100);
        userName.setForeground(new Color(255, 255, 255));
        userName.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(userName);

        userNAME = new JTextField("Enter User-Name");
        userNAME.setBounds(250, 180, 145, 22);
        userNAME.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(userNAME);

        //adding passwordField
        JLabel passName = new JLabel("PASSWORD:");
        passName.setBounds(170, 175, 500, 100);
        passName.setForeground(new Color(255, 255, 255));
        passName.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(passName);

        passWORD = new JPasswordField("Enter password");
        passWORD.setBounds(250, 212, 145, 22);
        passWORD.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(passWORD);


        forgot = new JButton("Forget password");
        forgot.setBounds(405, 213, 20, 20);
        forgot.setBackground(new Color(31, 30, 40, 1));
        forgot.setForeground(Color.white);
        forgot.setFont(new Font("century gothic", Font.PLAIN, 11));
        forgot.addActionListener(this);
        forgot.setBorder(null);
        p1.add(forgot);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgot-password.png"));
        Image a2 = a1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel imgn = new JLabel(a3);
        imgn.setBounds(0, 0, 20, 20);
        forgot.add(imgn);


        //Jcheck box for show password
        checkpass = new JCheckBox();
        checkpass.setBounds(247, 245, 20, 15);
        checkpass.setBackground(new Color(31, 30, 40));
        checkpass.setFocusable(false);
        checkpass.setBorderPainted(false);
        checkpass.addActionListener(this);
        p1.add(checkpass);


        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/eye.png"));
        Image img2 = img1.getImage().getScaledInstance(17, 17, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel img = new JLabel(img3);
        img.setBounds(270, 245, 17, 17);
        p1.add(img);


        //login button

        loginBTN = new JButton("Login");
        loginBTN.setBounds(127, 288, 104, 25);
        loginBTN.setBackground(new Color(31, 30, 40));
        loginBTN.setForeground(new Color(255, 255, 255));
        loginBTN.setFont(new Font("century gothic", Font.BOLD, 13));
        loginBTN.setFocusPainted(false); // Remove the border when focused
        loginBTN.setFocusable(false);
        loginBTN.setBorderPainted(false); // Remove the button border
        loginBTN.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginBTN.addActionListener(this);
        p1.add(loginBTN);


        signupBTN = new JButton("Sign-up");
        signupBTN.setBounds(248, 288, 104, 25);
        signupBTN.setBackground(new Color(31, 30, 40));
        signupBTN.setForeground(new Color(255, 255, 255));
        signupBTN.setFont(new Font("century gothic", Font.BOLD, 13));
        signupBTN.setFocusPainted(false); // Remove the border when focused
        signupBTN.setFocusable(false);
        signupBTN.setBorderPainted(false); // Remove the button border
        signupBTN.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signupBTN.addActionListener(this);
        p1.add(signupBTN);


        JButton exit = new JButton("Quit");
        exit.setBounds(368, 288, 104, 25);
        exit.setBackground(new Color(31, 30, 40));
        exit.setForeground(new Color(248, 54, 54));
        exit.setFont(new Font("century gothic", Font.BOLD, 13));
        exit.addActionListener(e -> System.exit(0));
        exit.setFocusPainted(false); // Remove the border when focused
        exit.setFocusable(false);
        exit.setBorderPainted(false); // Remove the button border
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(exit);


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

    int i = 0;

    public void actionPerformed(ActionEvent ae) {

        String str = "";
        String str1 = passWORD.getText();

        if (ae.getSource() == loginBTN) {

            if (str1.equals(str)) {

                passWORD.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Password field is empty :");

            } else {

                if (str1.length() < 8) {
                    passWORD.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Password Length is less than 8 characters:");
                } else {

                    login = 1;
                    i++;
                    String Username = userNAME.getText().toString();
                    String Password = passWORD.getText().toString();
                    System.out.println("[" + i + " ] In View, username = " + Username + "|   Password = " + Password + "\n\n");
                    new adminLoginController(this, Username, Password);


                }
            }
        }

        if (ae.getSource() == signupBTN) {
            SignUp = 1;
            i++;
            String Username = userNAME.getText().toString();
            String Password = passWORD.getText().toString();
            System.out.println("[" + i + " ] In Check View, username = " + Username + "|   Password = " + Password + "\n\n");
            new adminLoginController(this, Username, Password);
        }
        else if (ae.getSource() == forgot) {
            setVisible(false);
            new forgotView();
        }

        else if (ae.getSource() == checkpass) {
            check = 1;
            i++;
            String Username = userNAME.getText().toString();
            String Password = passWORD.getText().toString();
            System.out.println("[" + i + " ] In Check View, username = " + Username + "|   Password = " + Password + "\n\n");
            new adminLoginController(this, Username, Password);
        }
//        if (checkpass.isSelected()) {
//            passWORD.setEchoChar((char) 0);
//        } else {
//            passWORD.setEchoChar('*');
//        }


    }

    public static void main(String[] args) {
        new adminLoginScreenView();
    }
}
