/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.Controller;

import gamifyyourlife.Model.MainPageModel;
import gamifyyourlife.View.MainPageView;
import gamifyyourlife.View.ProfileView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Felhasználó
 */
public class MainPageController {
    MainPageView mainPageV = new MainPageView();
    MainPageModel mainPageM = new MainPageModel();
    
     public MainPageController(MainPageView mainPageV,MainPageModel mainPageM){
        this.mainPageV = mainPageV;
        this.mainPageM = mainPageM;
        
        this.mainPageV.addProfileButtonListener(new ProfilButtonListener());
        this.mainPageV.addUjButtonListener(new UjButtonListener());
        this.mainPageV.addTorlesButtonListener(new TorlesButtonListener());
        this.mainPageV.addTorlesButtonListener(new ModositButtonListener());
        this.mainPageV.addElozmenyekButtonListener(new ElozmenyekButtonListener());
    }
     

        
      class ProfilButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           mainPageV.setVisible(false);
        }
        
     }
      
     class UjButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
     }
     
      class TorlesButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
                      
           
           
        }
        
    }
      
    class ModositButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    class ElozmenyekButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
    

