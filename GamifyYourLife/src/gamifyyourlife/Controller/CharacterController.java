/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.Controller;

import gamifyyourlife.Model.CharacterModel;
import gamifyyourlife.View.CharacterView;

/**
 *
 * @author Felhasználó
 */
public class CharacterController {
    
    private CharacterView theCharacterView;
    private CharacterModel theCharacterModel;
    
    public CharacterController(CharacterView theCharacterView, CharacterModel theCharacterModel){
        this.theCharacterView = theCharacterView;
        this.theCharacterModel = theCharacterModel;
    }
}
