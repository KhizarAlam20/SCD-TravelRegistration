package Controller;

import Model.LoginModel;
import Model.adminLoginModel;
import View.LoginView;
import View.forgotView;
import View.signUPView;
import View.adminLoadingView;
import Model.adminLoginModel;
import View.loading_after_login;
import View.adminLoginScreenView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminLoginController {
    public  adminLoginScreenView view;
    public adminLoginModel model;
    public String username;
    public String password;


    public adminLoginController(adminLoginScreenView view, String username, String password) {
        this.view = view;
        this.model = new adminLoginModel(view);
        this.username=username;
        this.password=password;

        if(view.check==1){
            check();
        }
        if(view.login==1){
            login(username,password);
        }
        if(view.Exit==1){
            System.out.println("Exit call from if!!");
            exit();
        }

        if(view.SignUp==1){
            System.out.println("Signup call from if!!");
            signup();
        }
    }


    void login(String username, String password){

        System.out.println("In Controller, username = " + username + "|   Password = " + password + "\n\n");

        if (model.validateLogin(username, password)) {
            view.setVisible(false);
            new adminLoadingView(username);
            System.out.println("Hello");
        }

    }

    void check(){

        if (view.checkpass.isSelected()) {
            view.passWORD.setEchoChar((char) 0);
        } else {
            view.passWORD.setEchoChar('*');
        }
    }

    void exit () {
        System.out.println("Exit from func!!");
        view.setVisible(false);
        System.exit(0);
    }


    void signup(){
        new signUPView();
    }

    void forget(){
            new forgotView();
    }

    public static void main(String[] args) {
    }
}
