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
public class ProfileView extends PanelParentView {
    private JLabel nameLabel = new JLabel("A karaktered neve: ");
    private JTextField name = new JTextField(10);
    private JLabel hobbiLabel = new JLabel("Hobbi szint:");
    private JTextField hobbi = new JTextField(5);
     private JLabel jobLabel = new JLabel("Munka szint:");
    private JTextField job = new JTextField(5);
     private JLabel otherLabel = new JLabel("Egyéb szint:");
    private JTextField other = new JTextField(5);
    
    public ProfileView(){    
        JPanel character = new JPanel();
        character.add(nameLabel);
        character.add(name);
        JPanel levels = new JPanel();
        levels.add(hobbiLabel);     
        levels.add(hobbi);
        levels.add(jobLabel);
        levels.add(job);
        levels.add(otherLabel);
        levels.add(other);
        JPanel tasks = new JPanel();;
        this.add(character);
        this.add(levels);
        this.add(tasks);
    }
    
     public void setName(String name){
        this.name.setText(name);
    }
    
         
}
