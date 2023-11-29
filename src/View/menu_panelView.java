//6
package View;

import javax.swing.*;
import java.awt.*;
import View.menu_panelView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu_panelView extends JFrame implements ActionListener {

    JButton close;
    JButton details,find, update, view, flight, checkPackage, bookPackage, viewPackage, viewHotel, bookHotel, payment, calculate;
    //    JCheckBox menu;
    JComboBox menu;

String userName;
    menu_panelView(String userName) {

        this.userName=userName;

        System.out.println("Menu panel username = "+ userName);
        setBounds(300, 250, 175, 365);
        setLayout(null);

        //p1
        JPanel p1 = new JPanel();
        p1.setForeground(new Color(255, 255, 255));
        p1.setBounds(0, 0, 175, 365);
        p1.setLayout(null);
        add(p1);


        JLabel tools = new JLabel("MENU");
        tools.setBounds(70, 5, 60, 25);
        tools.setFont(new Font("century gothic", Font.BOLD, 18));
        tools.setForeground(new Color(0, 21, 24));
        p1.add(tools);

        close = new JButton();
        close.setBounds(20, 7, 20, 20);
        close.setBackground(new Color(255, 252, 252));
        close.setForeground(new Color(153, 0, 17));
//        logOut.setBackground(new Color(252, 246, 245));
        close.setBorder(null);
        close.addActionListener(this);
        p1.add(close);

        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icons/close.png"));
        Image a1 = a.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT);
        ImageIcon a2 = new ImageIcon(a1);
        JLabel a3 = new JLabel(a2);
        a3.setBounds(0, 0, 15, 15);
        close.add(a3);

        //Button details:
        details = new JButton("Add Details");
        details.setBounds(10, 55, 160, 25);
        details.setBackground(new Color(153, 0, 17));
        details.setForeground(new Color(255, 252, 252));
        details.setFont(new Font("century gothic", Font.PLAIN, 14));
        details.setFocusPainted(false); // Remove the border when focused
        details.setFocusable(false);
        details.setBorderPainted(false); // Remove the button border
        details.setCursor(new Cursor(Cursor.HAND_CURSOR));
        details.addActionListener(this);
        details.setBorder(null);
        p1.add(details);

        ImageIcon b = new ImageIcon(ClassLoader.getSystemResource("icons/ad.png"));
        Image b1 = b.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon b2 = new ImageIcon(b1);
        JLabel b3 = new JLabel(b2);
        b3.setBounds(0, 0, 25, 25);
        details.add(b3);
/////////////////////////////////////////////////////////

//find.setBounds(20, 65, 170, 30);

        find = new JButton("Confirm");
        find.setBounds(10, 85, 160, 25);
        find.setBackground(new Color(153, 0, 17));
        find.setForeground(new Color(255, 252, 252));
        find.setFont(new Font("century gothic", Font.PLAIN, 14));
        find.setFocusPainted(false); // Remove the border when focused
        find.setFocusable(false);
        find.setBorderPainted(false); // Remove the button border
        find.setCursor(new Cursor(Cursor.HAND_CURSOR));
        find.addActionListener(this);
        find.setBorder(null);
        p1.add(find);


        ImageIcon z = new ImageIcon(ClassLoader.getSystemResource("icons/s1.png"));
        Image z1 = z.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon z2 = new ImageIcon(z1);
        JLabel z3 = new JLabel(z2);
        z3.setBounds(0, 0, 25, 25);
        find.add(z3);
        //////////////////////////////////////////////////////////////////////////
/**
        //Button 2 update:
        update = new JButton("Update Details");
        update.setBounds(20, 95, 170, 30);
        update.setBackground(new Color(153, 0, 17));
        update.setFont(new Font("OSWALD", Font.PLAIN, 15));
        update.setForeground(new Color(252, 246, 245));
//        update.setMargin(new Insets(0, 0, 0, 25));
        update.addActionListener(this);
        update.setBorder(null);
        p1.add(update);

        ImageIcon c = new ImageIcon(ClassLoader.getSystemResource("icons/t.png"));
        Image c1 = c.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon c2 = new ImageIcon(c1);
        JLabel c3 = new JLabel(c2);
        c3.setBounds(0, 0, 25, 25);
        update.add(c3);
   */
        ///////////////////////////////////////////////////////////////////////////////////

        //Button 3 View:
        view = new JButton("View Details");
        view.setBounds(10, 115, 160, 25);
        view.setBackground(new Color(153, 0, 17));
        view.setForeground(new Color(255, 252, 252));
        view.setFont(new Font("century gothic", Font.PLAIN, 14));
        view.setFocusPainted(false); // Remove the border when focused
        view.setFocusable(false);
        view.setBorderPainted(false); // Remove the button border
        view.setCursor(new Cursor(Cursor.HAND_CURSOR));
        view.setBorder(null);
       view.addActionListener(this);
        p1.add(view);

        ImageIcon d = new ImageIcon(ClassLoader.getSystemResource("icons/v2.png"));
        Image d1 = d.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon d2 = new ImageIcon(d1);
        JLabel d3 = new JLabel(d2);
        d3.setBounds(0, 0, 25, 25);
        view.add(d3);
        //////////////////////////////DELETE/////////////////////////////////

        //
        //Button 3 delete:
        flight = new JButton("Flight Booking");
        flight.setBounds(10, 145, 160, 25);
        flight.setBackground(new Color(153, 0, 17));
        flight.setForeground(new Color(255, 252, 252));
        flight.setFont(new Font("century gothic", Font.PLAIN, 14));
        flight.setFocusPainted(false); // Remove the border when focused
        flight.setFocusable(false);
        flight.setBorderPainted(false); // Remove the button border
        flight.setCursor(new Cursor(Cursor.HAND_CURSOR));
        flight.setBorder(null);
        flight.addActionListener(this);
        p1.add(flight);

        ImageIcon e = new ImageIcon(ClassLoader.getSystemResource("icons/du.png"));
        Image e1 = e.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon e2 = new ImageIcon(e1);
        JLabel e3 = new JLabel(e2);
        e3.setBounds(0, 0, 25, 25);
        flight.add(e3);

        ///////////////////////////////////////////////////////////////////////////////


        //Button 3 check Package:
        checkPackage = new JButton("Check Packages");
        checkPackage.setBounds(10, 175, 160, 25);
        checkPackage.setBackground(new Color(153, 0, 17));
        checkPackage.setForeground(new Color(255, 252, 252));
        checkPackage.setFont(new Font("century gothic", Font.PLAIN, 14));
        checkPackage.setFocusPainted(false); // Remove the border when focused
        checkPackage.setFocusable(false);
        checkPackage.setBorderPainted(false); // Remove the button border
        checkPackage.setCursor(new Cursor(Cursor.HAND_CURSOR));
        checkPackage.setBorder(null);
        checkPackage.addActionListener(this);
        p1.add(checkPackage);

        ImageIcon f = new ImageIcon(ClassLoader.getSystemResource("icons/pd.png"));
        Image f1 = f.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon f2 = new ImageIcon(f1);
        JLabel f3 = new JLabel(f2);
        f3.setBounds(0, 0, 25, 25);
        checkPackage.add(f3);

        //Button 4 Book Package:
        bookPackage = new JButton("Book Packages");
        bookPackage.setBounds(10, 205, 160, 25);
        bookPackage.setBackground(new Color(153, 0, 17));
        bookPackage.setForeground(new Color(255, 252, 252));
        bookPackage.setFont(new Font("century gothic", Font.PLAIN, 13));
        bookPackage.setHorizontalAlignment(SwingConstants.CENTER);
        bookPackage.setFocusPainted(false); // Remove the border when focused
        bookPackage.setFocusable(false);
        bookPackage.setBorderPainted(false); // Remove the button border
        bookPackage.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bookPackage.setBorder(null);
        bookPackage.addActionListener(this);
        p1.add(bookPackage);

        ImageIcon y = new ImageIcon(ClassLoader.getSystemResource("icons/b.png"));
        Image y1 = y.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon y2 = new ImageIcon(y1);
        JLabel y3 = new JLabel(y2);
        y3.setBounds(0, 0, 25, 25);
        bookPackage.add(y3);
        //Button 5 Book Package:
//             viewPackage= new JButton("View Packages");
//            viewPackage.setBounds( 20,230 , 120, 30);
//            viewPackage.setBackground(new Color(153,0,17));
//            viewPackage.setFont(new Font("OSWALD", Font.PLAIN,15));
//            viewPackage.setForeground(new Color(252, 246, 245));
//            viewPackage.addActionListener(this);
//            p3.add(viewPackage);
//

        //Button 6 Book Package:
        viewHotel = new JButton("View Hotel");
        viewHotel.setBounds(10, 235, 160, 25);
        viewHotel.setBackground(new Color(153, 0, 17));
        viewHotel.setForeground(new Color(255, 252, 252));
        viewHotel.setFont(new Font("century gothic", Font.PLAIN, 13));
        viewHotel.setFocusPainted(false); // Remove the border when focused
        viewHotel.setFocusable(false);
        viewHotel.setBorderPainted(false); // Remove the button border
        viewHotel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        viewHotel.addActionListener(this);
        viewHotel.setBorder(null);
        p1.add(viewHotel);

        ImageIcon l = new ImageIcon(ClassLoader.getSystemResource("icons/eye.png"));
        Image l1 = l.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon l2 = new ImageIcon(l1);
        JLabel l3 = new JLabel(l2);
        l3.setBounds(0, 0, 25, 25);
        viewHotel.add(l3);


        //Button 7 Book Package:
        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(10, 265, 160, 25);
        bookHotel.setBackground(new Color(153, 0, 17));
        bookHotel.setForeground(new Color(255, 252, 252));
        bookHotel.setFont(new Font("century gothic", Font.PLAIN, 13));
        bookHotel.setFocusPainted(false); // Remove the border when focused
        bookHotel.setFocusable(false);
        bookHotel.setBorderPainted(false); // Remove the button border
        bookHotel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bookHotel.setBorder(null);
        bookHotel.addActionListener(this);
        p1.add(bookHotel);

        ImageIcon x = new ImageIcon(ClassLoader.getSystemResource("icons/b1.png"));
        Image x1 = x.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon x2 = new ImageIcon(x1);
        JLabel x3 = new JLabel(x2);
        x3.setBounds(0, 0, 25, 25);
        bookHotel.add(x3);

        //Button 8 payment:
        payment = new JButton("Payment");
        payment.setBounds(10, 295, 160, 25);
        payment.setBackground(new Color(153, 0, 17));
        payment.setForeground(new Color(255, 252, 252));
        payment.setFont(new Font("century gothic", Font.PLAIN, 13));
        payment.setFocusPainted(false); // Remove the border when focused
        payment.setFocusable(false);
        payment.setBorderPainted(false); // Remove the button border
        payment.setCursor(new Cursor(Cursor.HAND_CURSOR));
        payment.setBorder(null);
        payment.addActionListener(this);
        p1.add(payment);

        ImageIcon j = new ImageIcon(ClassLoader.getSystemResource("icons/credit-card.png"));
        Image j1 = j.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon j2 = new ImageIcon(j1);
        JLabel j3 = new JLabel(j2);
        j3.setBounds(0, 0, 25, 25);
        payment.add(j3);

        //////////////////////////////////////////////////

        //Button 8 payment:
        calculate = new JButton("Calculate");
        calculate.setBounds(10, 325, 160, 25);
        calculate.setBackground(new Color(153, 0, 17));
        calculate.setForeground(new Color(255, 252, 252));
        calculate.setFont(new Font("century gothic", Font.PLAIN, 13));
        calculate.setFocusPainted(false); // Remove the border when focused
        calculate.setFocusable(false);
        calculate.setBorderPainted(false); // Remove the button border
        calculate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        calculate.setBorder(null);
        calculate.addActionListener(this);
        p1.add(calculate);


        ImageIcon k = new ImageIcon(ClassLoader.getSystemResource("icons/calculator.png"));
        Image k1 = k.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon k2 = new ImageIcon(k1);
        JLabel k3 = new JLabel(k2);
        k3.setBounds(0, 0, 25, 25);
        calculate.add(k3);
///////////////////////////////////////////////////////////////////////////
        //800 80

        setUndecorated(true);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == details) {
            new add_detailsView(userName);
        } else if (ae.getSource() == view) {
            new view_detailsView(userName);
        } else if (ae.getSource() == update) {
            new update_detailsView(userName);
        } else if (ae.getSource() == checkPackage) {
            new check_packagesView();
        } else if (ae.getSource() == bookPackage) {
            new book_packageView(userName);
        } else if (ae.getSource() == flight) {
            new flightBookingView(userName);
        } else if (ae.getSource() == viewHotel) {
            new view_hotelView();
        } else if (ae.getSource() == bookHotel) {
//            new book_hotel(userName);
        } else if (ae.getSource() == payment) {
            new paymentView();
        } else if (ae.getSource() == calculate) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == close) {
            setVisible(false);
        } else if (ae.getSource() == find) {
           new check_idView(userName);
        }

    }

    public static void main(String[] args) {
        new menu_panelView("");
    }
}
