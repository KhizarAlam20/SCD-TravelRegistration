package Controller;


import Controller.check_idController;
import View.check_idView;
import Model.check_idModel;
public class check_idController {
    public check_idView view;
    public check_idModel model;

    public check_idController(check_idView view){
        this.view = view;
        this.model = new check_idModel(view);

        if(view.flag ==1){

            if(model.isFound()){
                System.out.println("Yes confirmed!!!");
            }else{
                System.out.println("Dead!!");
            }
        }
    }
}
