
package View;

import javax.swing.*;
import java.awt.*;
import Controller.viewDetailsController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class view_detailsView extends JFrame implements ActionListener{

    public JLabel username_fetch,id_fetch,id_identify_fetch,gender_fetch,country_fetch,address_fetch,phone_fetch,email_fetch;
    JButton back;
    public String userName;
    public int flag=1;

    public view_detailsView(String userName){
        this.userName= userName;
        setBounds(486,269,600,332);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBounds(0, 0,600,352);
        p1.setLayout(null);
        p1.setBackground(new Color(252, 246, 245));
        add(p1);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(10, 0, 600, 40);
        p2.setBackground(new Color(153,0,17));
        
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(300, 80,5 , 176);
        p3.setBackground(new Color(153,0,17));
        
        //////////////////////////////////////
         JLabel username = new JLabel("Username : ");
        username.setBounds(30, 40, 100, 50);
        p1.add(username);
        
        username_fetch = new JLabel(userName);
        username_fetch.setBounds(110, 40, 100, 50);
        p1.add(username_fetch);
        
        
        JLabel id = new JLabel("ID                 : ");
        id.setBounds(30, 65, 100, 50);
        p1.add(id);
        
        id_fetch = new JLabel();
        id_fetch.setBounds(110, 80, 100, 20);
        p1.add(id_fetch);
        
        
         JLabel id_identify = new JLabel("Number      : ");
        id_identify.setBounds(30, 90, 100, 50);
        p1.add(id_identify);
        
         id_identify_fetch = new JLabel();
        id_identify_fetch.setBounds(110, 105, 100, 20);
        p1.add(id_identify_fetch);
        
        
        JLabel gender = new JLabel("Gender       : ");
        gender.setBounds(30, 115, 100, 50);
        p1.add(gender);
        
        gender_fetch = new JLabel();
        gender_fetch.setBounds(110,130,50, 20);
        p1.add(gender_fetch);
        
        
        
        
        
        JLabel country = new JLabel("Country      : ");
        country.setBounds(30, 140, 100, 50);
        p1.add(country);
        
         country_fetch = new JLabel();
        country_fetch.setBounds(110, 155, 100, 20);
        p1.add(country_fetch);
        
        
        
         JLabel address = new JLabel("Address     : ");
        address.setBounds(30, 165, 100, 50);
        p1.add(address);
        
         address_fetch = new JLabel();
        address_fetch.setBounds(110, 180, 100, 20);
        p1.add(address_fetch);
        
        
        JLabel mobile_num = new JLabel("Phone         : ");
        mobile_num.setBounds(30, 190, 100, 50);
        p1.add(mobile_num);
        
         phone_fetch = new JLabel();
        phone_fetch.setBounds(110, 205, 100, 20);
        p1.add(phone_fetch);
        
        
        JLabel email = new JLabel("Email           : ");
        email.setBounds(30, 215, 150, 50);
        p1.add(email);
        
        
         email_fetch = new JLabel();
        email_fetch.setBounds(110, 230, 100, 20);
        p1.add(email_fetch);
        
        
         //Back Button
      back = new JButton("BACK");
     back.setBounds(30,280, 72, 19);
     back.setBackground(new Color(153,0,17));
     back.setForeground(Color.white);
     back.setFont(new Font("SAN SERIF", Font.PLAIN,10));
     back.addActionListener(this);
     p1.add(back);
        ///////////////////////////////////////////
        
     // -> J-lABEL FORview DETAILS:
         JLabel d = new JLabel("VIEW PERSONAL DETAILS: ");
        d.setFont(new Font("OSWALD", Font.PLAIN,25));
        d.setBounds(20, 0, 300, 50);
        d.setForeground(Color.white);
        p2.add(d);
      
          // -> Image
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/seo.png"));
    Image i2 = i1.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(250, -35, 400, 400);
       
        p1.add(image);
        p1.add(p2);
        p1.add(p3);

        new viewDetailsController(this);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back ){
                setVisible(false);
        }
    }
    public static void main(String[] args) {
        new view_detailsView("");
    }
}
