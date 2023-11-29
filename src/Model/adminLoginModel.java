package Model;


import View.LoginView;
import Model.adminLoginModel;
import View.adminLoginScreenView;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class adminLoginModel {
    public adminLoginScreenView view;

    public adminLoginModel(adminLoginScreenView view) {
        this.view = view;
    }
    public boolean validateLogin(String username, String password) {
        int flag = 0;
        System.out.println("In Model username = "+username+" Password = "+password+"\n\n");

        try {

            //query
            String query = "select * from account where username = '" + username + "' AND password = '" + password + "'";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);

            if (rs.next()) {
                System.out.println("Login username = " + username);
                flag = 1;

            } else {
                view.passWORD.setBackground(Color.red);
                view.passWORD.setForeground(Color.white);
                JOptionPane.showMessageDialog(null, "Incorrect User Name or Password :");

                flag = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }
}

