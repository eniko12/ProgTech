package gamifyyourlife.Model;

public abstract class TaskModel {
    protected String taskName;
    protected int goldReward;
    protected int pointReward;
    public void addGold(ProfileModel p){
       p.setGold(p.getGold() + goldReward);
    }
    public abstract void addPoints(ProfileModel p);       
}
