/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.View;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainPageView extends JFrame {
    
    private JButton profileBtn = new JButton("Profil");
    private JButton ujFeladat = new JButton("Új feladat");
    private JButton torlesFeladat = new JButton("Feladat Törlés");
    private JButton modositFeladat = new JButton("Feladat módosítás");
    private JButton elozmenyek = new JButton("Előzmények");    
    private ProfileView profileV = new ProfileView();
    private JPanel everything = new JPanel();
    
          
     public MainPageView(){
        JPanel buttons = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,500);
        buttons.add(profileBtn);
        buttons.add(ujFeladat);
        buttons.add(torlesFeladat);
        buttons.add(modositFeladat);
        buttons.add(elozmenyek);
        
        this.everything.add(buttons);
        buttons.setVisible(true);
        
        this.everything.add(profileV);               
        this.profileV.setVisible(true);
        
        
        
        
        this.add(everything);
    }
     
     public void addProfileButtonListener(ActionListener listenerForProfilBtn){
        profileBtn.addActionListener(listenerForProfilBtn);
    }
     public void addUjButtonListener(ActionListener listenerForSendBtn){
        ujFeladat.addActionListener(listenerForSendBtn);
    }
     public void addTorlesButtonListener(ActionListener listenerForTorlesdBtn){
       torlesFeladat.addActionListener(listenerForTorlesdBtn);
    }
     public void addModositButtonListener(ActionListener listenerForSendBtn){
        modositFeladat.addActionListener(listenerForSendBtn);
    }
     public void addElozmenyekButtonListener(ActionListener listenerForSendBtn){
        elozmenyek.addActionListener(listenerForSendBtn);
    }
}
