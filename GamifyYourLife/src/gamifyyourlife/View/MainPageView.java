/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.View;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainPageView extends JFrame {
    
    
    public MainPageView(){
        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        JPanel greetingP = new JPanel();
        JLabel greeting = new JLabel("Szia Regina!");
        //greetingP.setBackground(Color.red);
        greetingP.add(greeting);
        

        JPanel goldP = new JPanel();
        JLabel gold = new JLabel("Arany: ");
        JTextField goldT = new JTextField(8);
        goldP.add(gold);
        goldP.add(goldT);

        JPanel LevelsP = new JPanel();
        JLabel jobLevel = new JLabel("Munka: ");
        JTextField job = new JTextField(8);
        LevelsP.add(jobLevel);
        LevelsP.add(job);
        JLabel hobbyLevel = new JLabel("Hobbi: ");
        JTextField hobby = new JTextField(8);
        LevelsP.add(hobbyLevel);
        LevelsP.add(hobby);
        JLabel otherLevel = new JLabel("Egyéb: ");
        JTextField other = new JTextField(8);
        LevelsP.add(otherLevel);
        LevelsP.add(other);
        
        container.add(Box.createVerticalStrut(15));
        container.add(greetingP);
        container.add(Box.createVerticalStrut(15));
        container.add(goldP);
        container.add(Box.createVerticalStrut(10));
        container.add(LevelsP);
        container.add(Box.createVerticalStrut(15));

        JPanel tasksP1 = new JPanel();
        tasksP1.setLayout(new BoxLayout(tasksP1,BoxLayout.X_AXIS));
        JLabel mytasks = new JLabel("Feladataim: ");
        JButton updateBtn = new JButton("Frissít");
        
        tasksP1.add(mytasks);
        tasksP1.add(Box.createHorizontalStrut(290));
        tasksP1.add(updateBtn);
        
        JPanel tasksP2 = new JPanel();
        JTextArea taskListTA =new JTextArea(20,40); 
        tasksP2.add(taskListTA);
        
        container.add(tasksP1);
        container.add(Box.createVerticalStrut(5));
        container.add(tasksP2);
        container.add(Box.createVerticalStrut(15));
        
        JPanel tasksP3 = new JPanel();
        tasksP3.setLayout(new BoxLayout(tasksP3,BoxLayout.X_AXIS));
        JRadioButton doneRBtn = new JRadioButton("Kész", false);
        JRadioButton deleteRBtn = new JRadioButton("Törlés", false);
        JButton send = new JButton("Küldés");
        tasksP3.add(doneRBtn);
        tasksP3.add(Box.createHorizontalStrut(20));
        tasksP3.add(deleteRBtn);
        tasksP3.add(Box.createHorizontalStrut(20));
        tasksP3.add(send);
        
        container.add(tasksP3);
        
        JPanel p1=new JPanel(); 
        p1.add(container);
         
        JPanel historyP = new JPanel();
        historyP.setLayout(new BoxLayout(historyP,BoxLayout.Y_AXIS));
        JLabel history = new JLabel("Előzmények");
        JTextArea historyTA =new JTextArea(30,40); 
        historyP.add(Box.createVerticalStrut(15));
        historyP.add(history);
        historyP.add(Box.createVerticalStrut(15));
        historyP.add(historyTA);        
        
        JPanel p2=new JPanel();  
        p2.add(historyP);
        
        JPanel newTask = new JPanel();
        newTask.setLayout(new BoxLayout(newTask, BoxLayout.Y_AXIS));        ;       
        
        
        JPanel newTask0 = new JPanel();
        newTask0.setLayout(new BoxLayout(newTask0, BoxLayout.X_AXIS));
        JLabel newTitle = new JLabel("Új feladat hozzáadása");
        newTask0.add(newTitle);
        
        
        JPanel newTask1 = new JPanel();
        newTask1.setLayout(new BoxLayout(newTask1, BoxLayout.X_AXIS));
        JLabel taskName = new JLabel("Feladat: ");
        JTextField newTaskName = new JTextField("   Írd ide a feladatot!",20);
        JLabel taskGold = new JLabel("Arany jutalom: ");
        JTextField newTaskGold = new JTextField(10);
        newTask1.add(Box.createHorizontalStrut(100));
        newTask1.add(taskName);
        newTask1.add(Box.createHorizontalStrut(10));
        newTask1.add(newTaskName);
        newTask1.add(Box.createHorizontalStrut(15));
        newTask1.add(taskGold);
        newTask1.add(Box.createHorizontalStrut(10));
        newTask1.add(newTaskGold);
        newTask1.add(Box.createHorizontalStrut(100));
        
        JPanel newTask2 = new JPanel();
        newTask2.setLayout(new BoxLayout(newTask2, BoxLayout.X_AXIS));
        JRadioButton hobbyRBtn = new JRadioButton("Hobbi", false);
        JRadioButton jobRBtn = new JRadioButton("Munka", false);
        JRadioButton otherRBtn = new JRadioButton("Egyéb", true);
        newTask2.add(hobbyRBtn);
        newTask2.add(Box.createHorizontalStrut(20));
        newTask2.add(jobRBtn);
        newTask2.add(Box.createHorizontalStrut(20));
        newTask2.add(otherRBtn);
        newTask2.add(Box.createHorizontalStrut(300));
        
        JPanel newTask3 = new JPanel();        
        newTask3.setLayout(new BoxLayout(newTask3, BoxLayout.X_AXIS));
        JLabel taskPoint = new JLabel("Jutalom pontok: ");
        JTextField newTaskPoint = new JTextField(5);  
        JButton create = new JButton("Létrehozás");
        newTask3.add(Box.createHorizontalStrut(100));
        newTask3.add(taskPoint);
        newTask3.add(Box.createHorizontalStrut(10));
        newTask3.add(newTaskPoint);
        newTask3.add(Box.createHorizontalStrut(200));
        newTask3.add(create);
        newTask3.add(Box.createHorizontalStrut(100));
        
        newTask.add(Box.createVerticalStrut(15));
        newTask.add(newTask0);
        newTask.add(Box.createVerticalStrut(15));
        newTask.add(newTask1);
        newTask.add(Box.createVerticalStrut(15));
        newTask.add(newTask2);
        newTask.add(Box.createVerticalStrut(15));
        newTask.add(newTask3);
       
        
        
       
        
        JPanel p3=new JPanel(); 
        p3.add(newTask);
        JTabbedPane tp=new JTabbedPane();  
        tp.setBounds(50,50,600,600);  
        tp.add("Main",p1);  
        tp.add("History",p2); 
        tp.add("Új feladat",p3);
        this.add(tp);  
        this.setSize(800,800);  
        this.setLayout(null);  
        this.setVisible(true);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
