package Model;

import View.LoginView;
import View.view_detailsView;
import Controller.viewDetailsController;
import Model.viewDetailsModel;

import java.sql.ResultSet;

public class viewDetailsModel {

    public view_detailsView view;

    public viewDetailsModel(view_detailsView view) {
        this.view = view;
    }

    int flag =0;

    public boolean isView(){
        try {
            Conn c = new Conn();
            String query = "select * from customer where username = '"+view.userName+"'";

            flag=1;
            ResultSet rs =  c.s.executeQuery(query);
            while(rs.next()){
                view.username_fetch.setText(rs.getString("username"));
                view.id_fetch.setText(rs.getString("id"));
                view.id_identify_fetch.setText(rs.getString("number"));
                view.gender_fetch.setText(rs.getString("gender"));
                view.country_fetch.setText(rs.getString("country"));
                view.address_fetch.setText(rs.getString("address"));
                view.phone_fetch.setText(rs.getString("mobileNumber"));
                view.email_fetch.setText(rs.getString("email"));

            }

        } catch (Exception e) {
            flag=0;
            e.getStackTrace();
        }

        if(flag==0){
            return false;
        }else {
            return true;
        }
    }
}
