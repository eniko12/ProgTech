/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife;

import gamifyyourlife.Controller.CharacterController;
import gamifyyourlife.Model.CharacterModel;
import gamifyyourlife.View.CharacterView;

/**
 *
 * @author Felhasználó
 */
public class GamifyYourLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CharacterView theCharacterView = new CharacterView();
       CharacterModel theCharacterModel = new CharacterModel();
       
       CharacterController theCharacterController = new CharacterController(theCharacterView,theCharacterModel);
       
       theCharacterView.setVisible(true);
    }
    
}
