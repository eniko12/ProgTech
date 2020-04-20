/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife;

import gamifyyourlife.Controller.CharacterController;
import gamifyyourlife.Model.CharacterModel;
import gamifyyourlife.View.CharacterView;
import gamifyyourlife.View.MainPageView;
import gamifyyourlife.View.PanelParentView;

/**
 *
 * @author Felhasználó
 */
public class GamifyYourLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CharacterModel chModel = new CharacterModel();
       CharacterView chPanel = new CharacterView();
       
       CharacterController chController = new CharacterController(chPanel, chModel);
       
       MainPageView page = new MainPageView(chPanel);
       
       page.setVisible(true);
    }
    
}
