package Controller;

import javax.swing.*;
import java.awt.*;

import View.LoginView;
import View.create_account_confirmationView;
import View.signUPView;
import Model.signUPModel;


public class signUPController {


    public signUPView view;
    public signUPModel model;
    JButton clear_btn;
    JButton signup_btn;
    String username, name, password, question, answer;
    JTextField userNAME, userNAME_signup_field, passWORD_signup_field, answer_signup_field;
    Choice security;

    public signUPController(signUPView view) {
        this.view = view;
        this.model = new signUPModel(view);
        this.userNAME=view.userNAME;
        this.userNAME_signup_field=view.userNAME_signup_field;
        this.passWORD_signup_field=view.passWORD_signup_field;
        this.answer_signup_field=view.answer_signup_field;

        this.username = view.userNAME.getText();
        this.name = view.userNAME_signup_field.getText();
        this.password = view.passWORD_signup_field.getText();
        this.question = view.security.getSelectedItem();
        this.answer = view.answer_signup_field.getText();

        if (view.Sign == 1) {
            int special = 0, digit = 0, characters = 0;

            String str = userNAME.getText();
            int s = str.length();

            String pass = passWORD_signup_field.getText();
            int password_length = pass.length();

            String ans = answer_signup_field.getText();
            int ans_length = ans.length();


//                if (length >= 8 && number ==1 && character ==1 && special ==1) {

            if (model.check(str)) {
                userNAME.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Username already exist try another one:");
            } else {
                if (password_length < 8) {
                    view.passWORD_signup_field.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Password length should be greater than 8:");
                } else if (ans_length < 1) {
                    view.answer_signup_field.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Answer field is empty");
                } else if (!checkChar(pass)) {
                    view.answer_signup_field.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Your password is weak\nUse the combination of diffrent characters instead...");
                } else {
                    view.passWORD_signup_field.setBackground(Color.green);
                    view.answer_signup_field.setBackground(Color.green);
                    view.userNAME.setBackground(Color.green);


                    if (model.Issuccessed(username, name, password, question, answer)) {
                        new create_account_confirmationView();
                    }else{
                        JOptionPane.showMessageDialog(null, "Sorry :/");
                    }

                }
            }
        }
    }

    boolean checkChar(String s) {
        int length = s.length(), special = 0, number = 0, character = 0;
        int ascii = 0;
        for (int i = 0; i < s.length(); i++) {
            ascii = (int) s.charAt(i);

            if (ascii <= 57 && ascii >= 48) {
                number = 1;
            }
            if (ascii <= 90 && ascii >= 65 || ascii <= 122 && ascii >= 97) {
                character = 1;
            }
            if (ascii <= 47 && ascii >= 33 || ascii <= 63 && ascii >= 58 || ascii <= 96 && ascii >= 91) {
                special = 1;
            }
        }

        if (number == 1 && special == 1 && character == 1) {
            return true;
        } else {
            return false;
        }
    }
}
