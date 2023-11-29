package Model;

import View.LoginView;
import View.add_detailsView;

import javax.swing.*;
import java.awt.*;

public class add_detaisModel {

    public add_detailsView view;

    public add_detaisModel(add_detailsView view) {
        this.view = view;
    }

    int count = 0;

    public boolean isAdded() {

        String username = view.username_fetch.getText();
        String id = (String) view.comboID.getSelectedItem();
        String number = view.idNUMBER.getText();
        String gender = null;
        if (view.male.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }

        String country = view.country_field.getText();
        String address = view.address_field.getText();
        String mobileNumber = view.phone_field.getText();
        String email = view.email_field.getText();

        int flag = 0;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                flag = 1;
            }
        }

        if (flag == 1) {
//            new view.confirmation_for_add_details();
            try {
                Conn c = new Conn();
                String query = "insert into customer values('" + username + "', '" + id + "','" + number + "','" + gender + "','" + country + "','" + address + "','" + mobileNumber + "','" + email + "')";
                c.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "Person Added Successfully");
                count=1;
                view.setVisible(false);


            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            count=0;
            view.email_field.setBackground(new Color(243, 13, 13));
            view.email_field.setForeground(new Color(236, 229, 229));
            JOptionPane.showMessageDialog(null, "Email format is not correct..");
        }


        if(count == 0){
            return false;
        }else{
            return true;
        }
    }


}
