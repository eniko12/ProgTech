package gamifyyourlife.Model;

public class TaskOtherModel extends TaskModel {
    
     public TaskOtherModel(String name, int gold, int point){
        this.taskName = name;
        this.goldReward = gold;
        this.pointReward = point;
    }
        
    @Override
    public void addPoints(ProfileModel p) {
       p.setOtherLevel(this.pointReward + p.getOtherLevel());
       this.addGold(p);
    }
        
    @Override
    public String toString(){
        return String.format(taskName + " " + "Arany: " + goldReward + " " + "Pontok: " + pointReward);
    }    
}
