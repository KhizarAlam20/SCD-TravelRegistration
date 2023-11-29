//4
package View;

import javax.swing.*;
import View.signUPView;
import View.LoginView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class create_account_confirmationView extends JFrame implements ActionListener{


    JButton cancel_btn,create_btn ;

     public create_account_confirmationView() {
         setSize(600, 344);
         setLocation(350, 200);
         setLayout(null);

         JPanel p1 = new JPanel();
         p1.setLayout(null);
         p1.setBounds(0, 0, 600, 344);
         p1.setBackground(new Color(153, 0, 17));
         add(p1);


         JLabel l = new JLabel("Do you want to proceed or not?");
         l.setBounds(100, 140, 1000, 40);
         l.setForeground(new Color(252, 246, 245));
         l.setFont(new Font("century gothic", Font.BOLD, 25));
//        l.setForeground(new Color(0, 0, 0));
         p1.add(l);


         create_btn = new JButton("Yes");
         create_btn.setBounds(200, 200, 205, 25);
         create_btn.setBackground(new Color(31, 30, 40));
         create_btn.setForeground(new Color(0, 245, 159));
         create_btn.setFont(new Font("century gothic", Font.BOLD, 13));
         create_btn.setFocusPainted(false); // Remove the border when focused
         create_btn.setFocusable(false);
         create_btn.setBorderPainted(false); // Remove the button border
         create_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
         create_btn.addActionListener(this);
         p1.add(create_btn);

         cancel_btn = new JButton("BACK");
         cancel_btn.setBounds(200, 240, 205, 25);
         cancel_btn.setBackground(new Color(31, 30, 40));
         cancel_btn.setForeground(new Color(245, 64, 64));
         cancel_btn.setFont(new Font("century gothic", Font.BOLD, 11));
         cancel_btn.setFocusPainted(false); // Remove the border when focused
         cancel_btn.setFocusable(false);
         cancel_btn.setBorderPainted(false); // Remove the button border
         cancel_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
         cancel_btn.addActionListener(this);
         p1.add(cancel_btn);


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
    
     public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == create_btn){
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                //setVisible(false);
                new LoginView();
                setVisible(false);
            }else if(ae.getSource() == cancel_btn){
                    new signUPView();
                    setVisible(false);
            }
     }
    
    
    public static void main(String[] args) {
        new create_account_confirmationView();
    }
   
}
