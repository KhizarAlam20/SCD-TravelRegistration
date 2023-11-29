package Controller;


import Model.forgotModel;
import View.forgotView;
import Model.forgotModel;
import javax.swing.*;

public class forgotController {

    public forgotView view;
    public forgotModel model;
    JButton retrive, back;
    JButton search;
    JTextField userNAME_field, userNAME_signup_field, passWORD_signup_field, answer_signup_field;
    JTextField security_field;
    public forgotController(forgotView view){
        this.view = view;
        this.model= new forgotModel(view);

        this.userNAME_field=view.userNAME_field;
        this.answer_signup_field=view.answer_signup_field;
        this.userNAME_signup_field=view.userNAME_signup_field;
        this.passWORD_signup_field=view.passWORD_signup_field;


        if(view.Search==1)
        {
           if(model.search()){
               System.out.println("Welcome search!!");
           }
        }


        if(view.Retrive==1)
        {
            if(model.retrieve()){
                System.out.println("Welcome retrived!!");
            }
        }


    }


}
