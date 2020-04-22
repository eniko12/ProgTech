/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.View;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainPageView extends JFrame {
     public MainPageView(PanelParentView p){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,300);
        
        this.add(p);
    }
}
