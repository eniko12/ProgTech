/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.View;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Felhasználó
 */
public class CharacterView extends JFrame {
    
    private JLabel nameLabel = new JLabel("A karaktered neve: ");
    private JTextField name = new JTextField(10);
    
    public CharacterView(){
        
        JPanel profile = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,300);
        
        profile.add(nameLabel);
        profile.add(name);
        
        this.add(profile);
    }
    
    public String getName(){
        return name.getText();
    }
   
    
}
