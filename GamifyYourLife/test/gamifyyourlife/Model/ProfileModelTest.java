
package gamifyyourlife.Model;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfileModelTest {
    
    public ProfileModelTest() {
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
     * Test of setName method, of class ProfileModel.
     */
    @Test
    public void testSetName() { //nagybetű, kisbetű
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("REgINa", everyTask);        
        String expResult = "Regina";
        String name = p.getName();
        assertEquals(expResult, name);
    }

    
     
    @Test
    public void testGetName() {
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);        
        String expResult = "Regina";
        String name = p.getName();
        assertEquals(expResult, name);
    }
  

    
    @Test
    public void testSetGold() { //gold nem kisebb mint 0!
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);   
        p.setGold(-10);
        int gold = p.getGold();
        int expResult = 0;        
        assertEquals(expResult, gold);   
    }
    
    public void testSetGold2() {
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);  
        p.setGold(110);
        int gold = p.getGold();
        int expResult =110;        
        assertEquals(expResult, gold);   
    }
    
    public void testSetGold3() { //gold nem kisebb mint 0, akkor se ha feladat volt!
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);  
        HandleTaskModel create = new HandleTaskModel(HistoryModel.getInstance());
        TaskJobModel jobT = new TaskJobModel("Email-ek kiküldése", -100, 10);
        create.TaskType(jobT);
        create.taskDone(p, everyTask);  
        int expResult = 0;
        int gold = p.getGold();
        assertEquals(expResult, gold);   
    }
  

    
    @Test
    public void testGetGold() {
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);  
        int expResult = 50;
        int gold = p.getGold();
        assertEquals(expResult, gold);
    }

   
    @Test
    public void testSetJobLevel() {
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);   
        int expResult = 10;
        p.setJobLevel(10);
        int points = p.getJobLevel();
        assertEquals(expResult, points);
        
    }

    
    @Test
    public void testGetJobLevel() {
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);  
        int expResult = 0;
        int points = p.getJobLevel();
        assertEquals(expResult, points);
    }
    
     @Test
    public void testSetHobbyLevel() {
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);  
        int expResult = 10;
        p.setHobbyLevel(10);
        int points = p.getHobbyLevel();
        assertEquals(expResult, points);
        
    }

    
    @Test
    public void testGetHobbyLevel() {
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);  
        int expResult = 0;
        int points = p.getHobbyLevel();
        assertEquals(expResult, points);
    }
    
     @Test
    public void testOtherLevel() {
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);  
        int expResult = 10;
        p.setOtherLevel(10);
        int points = p.getOtherLevel();
        assertEquals(expResult, points);
        
    }

    
    @Test
    public void testGetOtherLevel() {
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", everyTask);  
        int expResult = 0;
        int points = p.getOtherLevel();
        assertEquals(expResult, points);
    }
    
    

}
