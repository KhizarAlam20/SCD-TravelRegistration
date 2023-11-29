//5

package View;

import javax.swing.*;
import java.awt.*;

public class adminLoadingView extends JFrame implements Runnable {
    String username;
    Thread t;
    JProgressBar progressBar;
    //for running progress bar
    String a;

    public adminLoadingView(String username) {
        this. username =  username;
        System.out.println("Username loading = "+ username);
//        a = username;
        System.out.println(a + "  ->");
        t = new Thread(this);

        setSize(600, 344);
        setLocation(350, 200);
        setLayout(null);

        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 0, 600, 344);
        panel2.setBackground(new Color(252, 246, 245));
        panel2.setLayout(null);
        add(panel2);


        JLabel l1 = new JLabel("HAVE PATIENCE,");
        JLabel l2 = new JLabel("Logging you in :)");

        l1.setBounds(100, 135, 1000, 100);
        l2.setBounds(100, 180, 1000, 100);

        l1.setFont(new Font("century gothic", Font.BOLD, 30));
        l1.setForeground(new Color(255, 255, 255));

        l2.setFont(new Font("century gothic", Font.BOLD, 30));
        l2.setForeground(new Color(255, 255, 255));

        panel2.add(l1);
        panel2.add(l2);

        //progress bar//////////////////////////

        progressBar = new JProgressBar();
        progressBar.setBounds(90, 300, 400, 15);
        progressBar.setForeground(new Color(31, 30, 40));
        progressBar.setBackground(new Color(255, 255, 255));
        progressBar.setFocusable(false);
        progressBar.setBorderPainted(false);
        progressBar.setFont(new Font("century gothic", Font.PLAIN, 11));
        progressBar.setStringPainted(true);
        panel2.add(progressBar);


        //image
        ImageIcon abc1 = new ImageIcon(ClassLoader.getSystemResource("icons/abc.jpg"));
        Image abc2 = abc1.getImage().getScaledInstance(600, 344, Image.SCALE_DEFAULT);
        ImageIcon abc3 = new ImageIcon(abc2);
        JLabel abc = new JLabel(abc3);
        abc.setBounds(0, 0, 600, 344);
        panel2.add(abc);


        setUndecorated(true);
        t.start();

        setVisible(true);

    }


    public static void main(String[] args) {
        new adminLoadingView("");
    }

    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {
                int max = progressBar.getMaximum();
                int value = progressBar.getValue();

                //check
                if (value < max) {
                    progressBar.setValue(progressBar.getValue() + 1);

                } else {
                    setVisible(false);
                    new AdminDashboardView( username);
                }
                Thread.sleep(100);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
