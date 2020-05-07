package gamifyyourlife.Controller;
import gamifyyourlife.Model.HistoryModel;
import gamifyyourlife.Model.TaskCreateModel;
import gamifyyourlife.Model.TasksContainerModel;
import gamifyyourlife.View.CreateNewTaskView;

public class CreateNewTaskController {
    private CreateNewTaskView createV;
    private TaskCreateModel createM;
    private TasksContainerModel container;
    
    public CreateNewTaskController(TaskCreateModel createM, TasksContainerModel container, CreateNewTaskView createV){
        this.createM = createM;
        this.container = container;
        this.createV = createV;
        
    }
    
}
