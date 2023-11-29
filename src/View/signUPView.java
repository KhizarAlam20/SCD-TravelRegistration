package View;



import javax.swing.*;
import Controller.signUPController;
import java.awt.*;
import View.LoginView;
import java.awt.event.*;
import java.sql.ResultSet;

public class signUPView extends JFrame implements ActionListener {


    JButton clear_btn;
    JButton signup_btn;
    public JTextField userNAME;
    public JTextField userNAME_signup_field;
    public JTextField passWORD_signup_field;
    public JTextField answer_signup_field;
    public Choice security;

    public signUPView() {
        setSize(600, 344);
        setLocation(350, 200);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(252, 246, 245));
        p1.setBounds(0, 0, 600, 344);
        p1.setLayout(null);
        add(p1);


        //sign up

        //adding signups
        JLabel systemName = new JLabel("TRAVEL MANAGEMENT SYSTEM");
        systemName.setBounds(100, 70, 1000, 36);
        systemName.setForeground(new Color(255, 255, 255));
        systemName.setFont(new Font("century gothic", Font.BOLD, 30));
        p1.add(systemName);



        //adding user name
        JLabel userName_signup = new JLabel("USERNAME :");
        userName_signup.setBounds(135, 115, 230, 100);
        userName_signup.setForeground(new Color(252, 246, 245));
        userName_signup.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(userName_signup);

        userNAME = new JTextField("Enter User-Name");
        userNAME.setBounds(215, 155, 145, 22);
        userNAME.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(userNAME);


        //adding name
        JLabel name = new JLabel("NAME           :");
        name.setBounds(135, 150, 230, 100);
        name.setForeground(new Color(252, 246, 245));
        name.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(name);

        userNAME_signup_field = new JTextField("Enter Name");
        userNAME_signup_field.setBounds(215, 187, 145, 22);
        userNAME_signup_field.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(userNAME_signup_field);

        security = new Choice();
        security.add("Place of Birth?");
        security.add("Marvel hero?");
        security.add("Iphone or andriod?");
        security.add("Your college place?");
        security.setBounds(215, 260, 145, 500);
        security.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(security);


        //adding password
        JLabel passName_signup = new JLabel("PASSWORD:");
        passName_signup.setBounds(135, 180, 230, 100);
        passName_signup.setForeground(new Color(252, 246, 245));
        passName_signup.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(passName_signup);

        passWORD_signup_field = new JPasswordField();
        passWORD_signup_field.setBounds(215, 220, 145, 22);
        passWORD_signup_field.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(passWORD_signup_field);


        //security Q/A
        JLabel securIty = new JLabel("SECURITY    :");
        securIty.setBounds(135, 217, 100, 100);
        securIty.setForeground(new Color(252, 246, 245));
        securIty.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(securIty);


        //Answer
        JLabel answer_signup = new JLabel("ANSWER       :");
        answer_signup.setBounds(135, 260, 500, 100);
        answer_signup.setForeground(new Color(252, 246, 245));
        answer_signup.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(answer_signup);

        // answer_signup_field
        answer_signup_field = new JTextField("");
        answer_signup_field.setBounds(215, 297, 145, 22);
        answer_signup_field.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(answer_signup_field);


        //button
        signup_btn = new JButton("SIGN-IN");
        signup_btn.setBounds(390, 260, 100, 18);
        signup_btn.setBackground(new Color(31, 30, 40));
        signup_btn.setForeground(new Color(255, 255, 255));
        signup_btn.setFont(new Font("century gothic", Font.BOLD, 11));
        signup_btn.setFocusPainted(false); // Remove the border when focused
        signup_btn.setFocusable(false);
        signup_btn.setBorderPainted(false); // Remove the button border
        signup_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signup_btn.addActionListener(this);
        p1.add(signup_btn);


        clear_btn = new JButton("BACK");
        clear_btn.setBounds(390, 290, 100, 18);
        clear_btn.setBackground(new Color(31, 30, 40));
        clear_btn.setForeground(new Color(245, 64, 64));
        clear_btn.setFont(new Font("century gothic", Font.BOLD, 11));
        clear_btn.setFocusPainted(false); // Remove the border when focused
        clear_btn.setFocusable(false);
        clear_btn.setBorderPainted(false); // Remove the button border
        clear_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        clear_btn.addActionListener(this);
        clear_btn.addActionListener(this);
        p1.add(clear_btn);

        //new Color(252, 246, 245)
        //new Color(153,0,17)


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




    public int Sign=0;
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == signup_btn) {
            Sign =1;
            new signUPController(this);

        } else if (ae.getSource() == clear_btn) {
            //closing the current tab
            setVisible(false);

            //showing the log screen
            new LoginView();
        }
    }


    public static void main(String[] args) {
        new signUPView();
    }
}

