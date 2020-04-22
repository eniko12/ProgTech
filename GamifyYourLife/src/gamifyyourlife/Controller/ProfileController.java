/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.Controller;
import gamifyyourlife.Model.CharacterModel;
import gamifyyourlife.Model.ProfileModel;
import gamifyyourlife.View.ProfileView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Felhasználó
 */
public class ProfileController {
    private ProfileView profileV;
    private ProfileModel profileM;
    private CharacterModel characterM;
    
    
    public ProfileController(ProfileView profileV,ProfileModel profileM, CharacterModel caharcterM){
        this.profileV = profileV;
        this.profileM= profileM;
        this.characterM= characterM;
        
        this.profileV.setName(characterM.getName());
       // this.profileV.addListButtonListener(new ListButtonListener());
        
    }
    
    class ListButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }
}
