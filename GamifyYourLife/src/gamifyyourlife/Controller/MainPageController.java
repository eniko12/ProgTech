package gamifyyourlife.Controller;

import gamifyyourlife.Model.ProfileModel;
import gamifyyourlife.Model.TaskCreateModel;
import gamifyyourlife.Model.TasksContainerModel;
import gamifyyourlife.View.MainPageView;
import gamifyyourlife.Model.TaskCreateModel;
import gamifyyourlife.Model.TaskHobbyModel;
import gamifyyourlife.Model.TaskJobModel;
import gamifyyourlife.Model.TaskOtherModel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class MainPageController {
    public MainPageView mainView = new MainPageView();
    private TasksContainerModel everyTask = new TasksContainerModel();
    private ProfileModel profile;
    private  TaskCreateModel create = new TaskCreateModel(everyTask.history); 
    
    public MainPageController(MainPageView mainView, ProfileModel profile){  
        this.mainView = mainView;
        this.profile = profile;
        this.mainView.setGreetingLabel(this.profile.getName());
        this.mainView.setJob(this.profile.getJobLevel());
        this.mainView.setHobby(this.profile.getHobbyLevel());
        this.mainView.setOther(this.profile.getOtherLevel());
        this.mainView.setGold(this.profile.getGold());
        
        
        this.mainView.addUpdateAllBtnListener(new UpdateAllListener());
        this.mainView.addSendBtnListener(new SendBtnListener());
        this.mainView.addHistoryUpdateBtnListener(new HistoryUpdateListener());
        this.mainView.addCreateBtnListener(new CreateButtonListener());
    }
    
    class UpdateAllListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            WindowEvent closingEvent = new WindowEvent(mainView, WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closingEvent);
            mainView.setVisible(true);
        }
        
    }
    class SendBtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
        
    class HistoryUpdateListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String list="";
            for(int i = 0; i<everyTask.history.listLength(); i++){
                list =everyTask.history.getListElement(i) + "<html><br></html>"+list;
            }
            mainView.HistoryList(list);
        }
    }
    
    class CreateButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
