package View;


import javax.swing.*;
import java.awt.*;
import View.LoginView;
import Controller.forgotController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class forgotView extends JFrame implements ActionListener {

   public JButton retrive, back;
    public JButton search;
   public JTextField userNAME_field, userNAME_signup_field, passWORD_signup_field, answer_signup_field;
  public  JTextField security_field;

    public forgotView() {
        setSize(600, 344);
        setLocation(350, 200);
        setLayout(null);


        JPanel p1 = new JPanel();
        p1.setBackground(new Color(246, 221, 178));
        p1.setBounds(0, 0, 600, 344);

        p1.setLayout(null);
        add(p1);

        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgot.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10, -30, 400, 400);


        JLabel systemName = new JLabel("TRAVEL MANAGEMENT SYSTEM");

        systemName.setBounds(100, 70, 1000, 36);
        systemName.setForeground(new Color(255, 255, 255));
        systemName.setFont(new Font("century gothic", Font.BOLD, 30));
        p1.add(systemName);



        //////////////////////// more fields /////////////////////////////////////////

        JLabel userName_signup = new JLabel("USERNAME  :");
        userName_signup.setBounds(135, 115, 230, 100);
        userName_signup.setForeground(new Color(255, 255, 255));
        userName_signup.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(userName_signup);

        userNAME_field = new JTextField("Enter User-Name");
        userNAME_field.setBounds(215, 155, 145, 22);
        userNAME_field.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(userNAME_field);

        search = new JButton("Search");
        search.setBounds(375, 155, 104, 25);
        search.setBackground(new Color(31, 30, 40));
        search.setForeground(new Color(255, 255, 255));
        search.setFont(new Font("century gothic", Font.BOLD, 11));
        search.setFocusPainted(false); // Remove the border when focused
        search.setFocusable(false);
        search.setBorderPainted(false); // Remove the button border
        search.setCursor(new Cursor(Cursor.HAND_CURSOR));
        search.addActionListener(this);
        search.setBorder(null);
        p1.add(search);


        JLabel name = new JLabel("NAME           :");
        name.setBounds(135, 150, 230, 100);
        name.setForeground(new Color(255, 255, 255));
        name.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(name);

        userNAME_signup_field = new JTextField();
        userNAME_signup_field.setBounds(215, 187, 145, 22);
        userNAME_signup_field.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(userNAME_signup_field);


        JLabel securIty = new JLabel("SECURITY    :");
        securIty.setForeground(new Color(255, 255, 255));
        securIty.setBounds(135, 175, 100, 100);
        securIty.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(securIty);

        security_field = new JTextField("");
        security_field.setBounds(215, 218, 145, 22);
        security_field.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(security_field);

        JLabel answer_signup = new JLabel("ANSWER       :");
        answer_signup.setForeground(new Color(255, 255, 255));
        answer_signup.setBounds(135, 215, 500, 100);
        answer_signup.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(answer_signup);

        // answer_signup_field
        answer_signup_field = new JTextField("");
        answer_signup_field.setBounds(215, 252, 145, 22);
        answer_signup_field.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(answer_signup_field);


        retrive = new JButton("Retrieve");
        retrive.setBounds(375, 252, 104, 25);
        retrive.setBackground(new Color(31, 30, 40));
        retrive.setForeground(new Color(255, 255, 255));
        retrive.setFont(new Font("century gothic", Font.BOLD, 11));
        retrive.setFocusPainted(false); // Remove the border when focused
        retrive.setFocusable(false);
        retrive.setBorderPainted(false); // Remove the button border
        retrive.setCursor(new Cursor(Cursor.HAND_CURSOR));
        retrive.addActionListener(this);
        retrive.setBorder(null);
        p1.add(retrive);

        JLabel password = new JLabel("Password       :");
        password.setForeground(new Color(255, 255, 255));
        password.setBounds(135, 250, 500, 100);
        password.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(password);

        // answer_signup_field
        passWORD_signup_field = new JTextField("");
        passWORD_signup_field.setBounds(215, 290, 145, 22);
        passWORD_signup_field.setFont(new Font("century gothic", Font.PLAIN, 11));
        p1.add(passWORD_signup_field);


        back = new JButton();
        back.setBounds(20, 290, 25, 25);
        back.setBackground(new Color(31, 30, 40,1));
        back.setForeground(new Color(255, 255, 255));
        back.setFont(new Font("century gothic", Font.BOLD, 13));
        back.setFocusPainted(false); // Remove the border when focused
        back.setFocusable(false);
        back.setBorderPainted(false); // Remove the button border
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(this);
        back.setBorder(null);
        p1.add(back);

        //Add image 2
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/left-arrow.png"));
        Image a2 = a1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel img1 = new JLabel(a3);
        img1.setBounds(0, 0, 20, 20);
        back.add(img1);

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

   public int Search =0;
   public int Retrive=0;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search) {
            Search =1;
            new forgotController(this);
        } else if (e.getSource() == retrive) {
            Retrive=1;
            new forgotController(this);

        } else if (e.getSource() == back) {
            new LoginView();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new forgotView();
    }

}
