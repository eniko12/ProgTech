package gamifyyourlife.Model;

public class TaskHobbyModel extends TaskModel{
    
    public TaskHobbyModel(String name, int gold, int point){
        this.taskName = name;
        this.goldReward = gold;
        this.pointReward = point;
    }
        
    @Override
    public void addPoints(ProfileModel p) {
       p.setHobbyLevel(this.pointReward + p.getHobbyLevel());
       this.addGold(p);
    }
       
    @Override
    public String toString(){
        return String.format(taskName + " " + "Arany: " + goldReward + " " + "Pontok: " + pointReward);
    }    
}
