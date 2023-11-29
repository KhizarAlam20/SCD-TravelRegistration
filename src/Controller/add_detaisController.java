package Controller;

import javax.swing.*;
import java.awt.*;

import Model.LoginModel;
import View.menu_panelView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.add_detailsView;
import View.add_detailsView;
import Model.add_detaisModel;

public class add_detaisController {
   public add_detailsView view;
   public add_detaisModel model;

    public add_detaisController(add_detailsView view ){
        this.view=view;
        this.model= new add_detaisModel(view);

        if(view.Add==1){
            model.isAdded();
        }
    }
}
