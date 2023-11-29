package Model;

import View.LoginView;
import View.check_idView;
import Controller.check_idController;
import View.LoginView;

import javax.swing.*;
import java.sql.ResultSet;

public class check_idModel {
    public check_idView view;

    public check_idModel(check_idView view) {
        this.view = view;
    }

    int flag =0;

    public boolean isFound(){
        String s = view.idNUMBER.getText();
        String name= view.idNUMBER1.getText();
        try {
            Conn c = new Conn();
            String query = "select * from customer where username = '" + name + "'";

            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                view.email_fetch.setText(rs.getString("email"));
            }

        } catch (Exception ae) {
            ae.getStackTrace();
        }

        String a1 = view.email_fetch.getText();
        System.out.println("fetched = " + a1);
        System.out.println("typed   = " + s);

        if (s.equals(a1)) {
            flag =1;
            JOptionPane.showMessageDialog(null, "Your ID is registered.");
        } else {
            flag =0;
            JOptionPane.showMessageDialog(null, "Your Email is not registered.");
        }

        if(flag==0){
            return false;
        }else {
            return true;
        }
    }
}
