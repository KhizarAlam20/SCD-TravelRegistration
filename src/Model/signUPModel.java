package Model;

import java.sql.ResultSet;
import View.LoginView;
import View.signUPView;
import Controller.signUPController;
public class signUPModel
{
    public signUPView view;

    public signUPModel(signUPView view) {
        this.view = view;
    }
    public boolean check(String username) {
        int flag = 0;
        String a = "";
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username='"+username+"'");


            while (rs.next()) {
                a = rs.getString("username");
                System.out.println(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (username.equals(a)) {
            System.out.println("flag = 1");
            flag = 1;
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }


    public boolean Issuccessed(String username, String name, String password, String question, String answer) {
        int flag = 0;


        System.out.println("In Model username = "+username+" Password = "+password+"\n\n");
        //[]writing the query now
        String query = "insert into account values ('" + username + "', '" + name + "', '" + password + "' , '" + question + "','" + answer + "')";

        //[]try catch to run the sql query
        try {
            //making connction eastablish by making the [connection class object]

            Conn c = new Conn();


            //[STEP 4 ] Executing the SQL queries by the help of statements
            c.s.executeUpdate(query);

            //for pop up
            view.setVisible(false);
            flag=1;

        } catch (Exception e) {
            flag=0;
            e.printStackTrace();
        }

        if(flag ==1){
            return  true;
        }else{
            return false;
        }
    }
}
