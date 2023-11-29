package Controller;

import Model.LoginModel;
import View.LoginView;
import View.signUPView;
import View.loading_after_login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private final LoginView view;
    public LoginModel model;
    public String username;
    public String password;


    public LoginController(LoginView view, String username, String password) {
        this.view = view;
        this.model = new LoginModel(view);
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
            new loading_after_login(username);
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

  }

    public static void main(String[] args) {
    }
}
