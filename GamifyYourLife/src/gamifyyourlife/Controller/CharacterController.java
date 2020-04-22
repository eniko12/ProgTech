/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.Controller;

import gamifyyourlife.Model.CharacterModel;
import gamifyyourlife.View.CharacterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Felhasználó
 */
public class CharacterController {  
    private CharacterView chView;
    private CharacterModel chModel;
    
    public CharacterController(CharacterView chView, CharacterModel chModel){
        this.chView = chView;
        this.chModel = chModel;
        
        this.chView.addSendButtonListener(new SendButtonListener());
        this.chView.addNextButtonListener(new NextButtonListener());
    }
    
    class SendButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = "Jani";
            
            name = chView.getName();
            chModel.setName(name);
            chView.setName(chModel.getName());
            
            chView.setHello("Szia " + chModel.getName());
        }                          
    }
    
    class NextButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            chView.setVisible(false);
        }
    }
}
      

