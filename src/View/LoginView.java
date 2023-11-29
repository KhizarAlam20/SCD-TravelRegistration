package View;

import Controller.LoginController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame implements ActionListener {

    public JButton signupBTN;
    public int check = 0;
    public int login = 0, SignUp = 0, Forgot = 0, Exit = 0;
    public JButton loginBTN, exit;
    public JButton forgot;
    public JCheckBox checkpass;
    public JTextField userNAME;
    public JPasswordField passWORD;
    public String username, password;

    public LoginView() {
        initializeUI();
    }


    private void initializeUI() {

        setSize(600, 344);
        setLocation(350, 200);
        setLayout(null);

        // Panel
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(252, 246, 245));
        p1.setBounds(0, 0, 600, 344);
        p1.setLayout(null);
        add(p1);

        // Adding signups
        JLabel systemName = new JLabel("TRAVEL MANAGEMENT SYSTEM");
        systemName.setBounds(100, 70, 1000, 36);
        systemName.setForeground(new Color(252, 246, 245));
        systemName.setFont(new Font("century gothic", Font.BOLD, 30));
        p1.add(systemName);

        // Adding user name
        JLabel userName = new JLabel("USERNAME :");
        userName.setBounds(170, 140, 500, 100);
        userName.setForeground(new Color(255, 255, 255));
        userName.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(userName);

        userNAME = new JTextField("Enter User-Name");
        userNAME.setBounds(250, 180, 145, 22);
        userNAME.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(userNAME);

        // Adding passwordField
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
        forgot.setBorder(null);
        forgot.addActionListener(this);
        p1.add(forgot);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgot-password.png"));
        Image a2 = a1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel imgn = new JLabel(a3);
        imgn.setBounds(0, 0, 20, 20);
        forgot.add(imgn);

        // JCheckBox for show password
        checkpass = new JCheckBox();
        checkpass.setBounds(247, 245, 20, 15);
        checkpass.setBackground(new Color(31, 30, 40));
        checkpass.setFocusable(false);
        checkpass.addActionListener(this);
        checkpass.setBorderPainted(false);
        p1.add(checkpass);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/eye.png"));
        Image img2 = img1.getImage().getScaledInstance(17, 17, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel img = new JLabel(img3);
        img.setBounds(270, 245, 17, 17);
        p1.add(img);

        // Login button
        loginBTN = new JButton("Login");
        loginBTN.setBounds(127, 288, 104, 25);
        loginBTN.setBackground(new Color(31, 30, 40));
        loginBTN.setForeground(new Color(255, 255, 255));
        loginBTN.setFont(new Font("century gothic", Font.BOLD, 13));
        loginBTN.setFocusPainted(false);
        loginBTN.setFocusable(false);
        loginBTN.addActionListener(this);
        loginBTN.setBorderPainted(false);
        loginBTN.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(loginBTN);

        signupBTN = new JButton("Sign-up");
        signupBTN.setBounds(248, 288, 104, 25);
        signupBTN.setBackground(new Color(31, 30, 40));
        signupBTN.setForeground(new Color(255, 255, 255));
        signupBTN.setFont(new Font("century gothic", Font.BOLD, 13));
        signupBTN.setFocusPainted(false);
        signupBTN.setFocusable(false);
        signupBTN.addActionListener(this);
        signupBTN.setBorderPainted(false);
        signupBTN.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(signupBTN);

        exit = new JButton("Quit");
        exit.setBounds(368, 288, 104, 25);
        exit.setBackground(new Color(31, 30, 40));
        exit.setForeground(new Color(248, 54, 54));
        exit.setFont(new Font("century gothic", Font.BOLD, 13));
        exit.addActionListener(this);
        exit.setFocusPainted(false);
        exit.setFocusable(false);
        exit.setBorderPainted(false);
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p1.add(exit);

        // Image
        ImageIcon abc1 = new ImageIcon(ClassLoader.getSystemResource("icons/abc.jpg"));
        Image abc2 = abc1.getImage().getScaledInstance(600, 344, Image.SCALE_DEFAULT);
        ImageIcon abc3 = new ImageIcon(abc2);
        JLabel abc = new JLabel(abc3);
        abc.setBounds(0, 0, 600, 344);
        p1.add(abc);


        setUndecorated(true);
        setVisible(true);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginView());
    }

    int i = 0;


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBTN) {
            login = 1;
            i++;
            String Username = userNAME.getText().toString();
            String Password = passWORD.getText().toString();
            System.out.println("[" + i + " ] In View, username = " + Username + "|   Password = " + Password + "\n\n");
            new LoginController(this, Username, Password);
        } else if (e.getSource() == checkpass) {
            check = 1;
            i++;
            String Username = userNAME.getText().toString();
            String Password = passWORD.getText().toString();
            System.out.println("[" + i + " ] In Check View, username = " + Username + "|   Password = " + Password + "\n\n");
            new LoginController(this, Username, Password);

        }
        if (e.getSource() == exit) {
            Exit = 1;
            i++;
            String Username = userNAME.getText().toString();
            String Password = passWORD.getText().toString();
            System.out.println("[" + i + " ] In Check View, username = " + Username + "|   Password = " + Password + "\n\n");
            System.out.println("Exit call from btn!!");
            new LoginController(this, Username, Password);
        }
        if (e.getSource() == signupBTN) {
            SignUp = 1;
            i++;
            String Username = userNAME.getText().toString();
            String Password = passWORD.getText().toString();
            System.out.println("[" + i + " ] In Check View, username = " + Username + "|   Password = " + Password + "\n\n");
            new LoginController(this, Username, Password);
        }

        if(e.getSource() ==forgot){
            new forgotView();
        }

    }
}
