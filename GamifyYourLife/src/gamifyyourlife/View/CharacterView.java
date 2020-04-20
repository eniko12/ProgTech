/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.View;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CharacterView extends PanelParentView{
    private JLabel nameLabel = new JLabel("A karaktered neve: ");
    private JTextField name = new JTextField(10);
    private JButton send = new JButton("Kész");
    private JTextField hello = new JTextField(15);
    private JButton next = new JButton("Tovább");
    
    public CharacterView(){       
        this.add(nameLabel);
        this.add(name);
        this.add(send);     
        this.add(hello);
        this.add(next);
    }
         
    public String getName(){
        return name.getText();
    }
    
    public String getHello(){
        return hello.getText();
    }
    
    public void setHello(String hello){
        this.hello.setText(hello);
    }
    
  
    
    public void addSendButtonListener(ActionListener listenerForSendBtn){
        send.addActionListener(listenerForSendBtn);
    }
    
     public void addNextButtonListener(ActionListener listenerForNextBtn){
        next.addActionListener(listenerForNextBtn);
    }
    
    
       
}
