package gamifyyourlife.Controller;

import gamifyyourlife.Model.ProfileModel;
import gamifyyourlife.View.ShowProfileView;


public class ProfileController {
    private ShowProfileView profileV;
    private ProfileModel profileM;
    
    public ProfileController(ProfileModel profileM, ShowProfileView profileV){
        this.profileM = profileM;
        this.profileV = profileV;
    }
    
    public void show(){
        this.profileV.setName(this.profileM.getName());
        this.profileV.setGold(this.profileM.getGold());
        this.profileV.setHobbyLevel(this.profileM.getHobbyLevel());
        this.profileV.setJobLevel(this.profileM.getJobLevel());
        this.profileV.setOtherLevel(this.profileM.getOtherLevel());
        this.profileV.setTaskList(this.profileM.listEveryTask());
        this.profileV.show();    
        
    }
    
}
