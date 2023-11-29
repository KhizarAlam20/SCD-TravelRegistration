package Controller;


import View.view_detailsView;
import Controller.viewDetailsController;
import Model.viewDetailsModel;

public class viewDetailsController {
    public viewDetailsModel model;
    public view_detailsView view;

    public viewDetailsController(view_detailsView view){
                this.view=view;
                this.model=new viewDetailsModel(view);

                if(view.flag==1){
                    model.isView();
                }
    }
}
