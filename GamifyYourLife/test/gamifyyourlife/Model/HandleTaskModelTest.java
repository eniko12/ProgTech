package gamifyyourlife.Model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felhasználó
 */
public class HandleTaskModelTest {
    
    public HandleTaskModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   

    /**
     * Test of addToList method, of class HandleTaskModel.
     */
    @Test
    public void testAddToList() {
       HistoryModel h = HistoryModel.getInstance();
       HandleTaskModel handle = new HandleTaskModel(h);
       handle.TaskType(new TaskOtherModel("Meglocsolni a palántákat", 10, 15));
       TasksContainerModel c = new TasksContainerModel();
       handle.addToList(c);
       
       ArrayList<TaskModel> exp = new ArrayList<>();
       exp.add(new TaskOtherModel("Meglocsolni a palántákat", 10, 15));
       
       String result = c.getAll().get(0).taskName;
       String expected = exp.get(0).taskName;
       
       assertEquals(result, expected);  //hozzáadva
       assertEquals(h.listLength(), 1);        //Előzményekben bejegyzés történt
     
       
    }

    /**
     * Test of deleteFromList method, of class HandleTaskModel.
     */
    @Test
    public void testDeleteFromList() {
       HistoryModel h = HistoryModel.getInstance();
       HandleTaskModel handle = new HandleTaskModel(h);
       handle.TaskType(new TaskOtherModel("Mosogatni", 10, 5));
       TasksContainerModel c = new TasksContainerModel();
       handle.addToList(c);
       
       handle.deleteFromList(c);
       
       
       assertTrue(c.getAll().isEmpty());
       assertTrue(h.listLength() == 2);    //Új bejegyzés az előzményekben
    }

    /**
     * Test of taskDone method, of class HandleTaskModel.
     */
    @Test
    public void testTaskDone() {
       HistoryModel h = HistoryModel.getInstance();
       HandleTaskModel handle = new HandleTaskModel(h);
       
       handle.TaskType(new TaskOtherModel("Mosogatni", 10, 5));
       TasksContainerModel c = new TasksContainerModel();
       ProfileModel p = new ProfileModel("Regina",c);
       handle.addToList(c);
       
       handle.taskDone(p, c);
       
       int expGold = 50 + 10;
       int expH = 0;
       int expJ = 0;
       int expO = 5;
       
       
       assertTrue(c.getAll().isEmpty());            //törlésre került
       assertTrue(h.listLength() == 2);    //Új bejegyzés az előzményekben
       assertTrue(p.getGold() == expGold);      //gold jól hozzáadva
       assertTrue(p.getHobbyLevel() == expH && p.getJobLevel() ==expJ && p.getOtherLevel() == expO); //Pontok jól hozzááadva
    }

    
}
