package gamifyyourlife.Model;

public class TaskJobModel extends TaskModel{
    
    public TaskJobModel(String name, int gold, int point){
        this.taskName = name;
        this.goldReward = gold;
        this.pointReward = point;        
    }
        
    @Override
    public void addPoints(ProfileModel p) {
       p.setJobLevel(this.pointReward + p.getJobLevel());
       this.addGold(p);
    }
    
    @Override
    public String toString(){
        return String.format(taskName + " " + "Arany: " + goldReward + " " + "Pontok: " + pointReward);
    }
}