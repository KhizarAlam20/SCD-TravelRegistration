package Model;


import View.forgotView;

import java.sql.ResultSet;

public class forgotModel {
    forgotView view;

    public forgotModel(forgotView view) {
        this.view = view;
    }

    public boolean search() {
            int flag=0;

        try {
            String query = "select * from account where username = '" + view.userNAME_field.getText() + "'";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                view.userNAME_signup_field.setText(rs.getString("name"));
                view.security_field.setText(rs.getString("security"));
                flag=1;
            }

        } catch (Exception ea) {
            flag =0;
            ea.printStackTrace();
        }

        if (flag==0){
            return false;
        }else{
            return true;
        }
    }

    public boolean retrieve() {
        int flag =0;

        try {
            String query = "select * from account where answer = '" + view.answer_signup_field.getText() + "' AND  username =  '" + view.userNAME_field.getText() + "'";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                view.passWORD_signup_field.setText(rs.getString("password"));
                flag=1;
            }

        } catch (Exception ea) {
            flag=0;
            ea.printStackTrace();
        }

        if (flag==0){
            return false;
        }else{
            return true;
        }
    }

}

