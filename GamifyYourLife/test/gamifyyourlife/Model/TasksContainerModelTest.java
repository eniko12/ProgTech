/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class TasksContainerModelTest {
    
    public TasksContainerModelTest() {
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
     * Test of getAll method, of class TasksContainerModel.
     */
    @Test
    public void testGetAll() {
        TasksContainerModel c = new TasksContainerModel();    
        TaskHobbyModel hobbyT = new TaskHobbyModel("Festeni egy képet", 15, 15);
        TaskOtherModel otherT = new TaskOtherModel("Meglocsolni a palántákat", 10, 15);
        c.addTask(hobbyT);
        c.addTask(otherT);
        ArrayList<TaskModel> result = c.getAll();
        ArrayList<TaskModel> exp = new ArrayList<TaskModel>();
        exp.add(hobbyT);
        exp.add(otherT);
        ArrayList<TaskModel> expResult = exp;
        assertEquals(expResult, result);
    }

      
    @Test
    public void testAddTask() {
        TasksContainerModel c = new TasksContainerModel();  
        TaskHobbyModel hobbyT = new TaskHobbyModel("Festeni egy képet", 15, 15);
        TaskOtherModel otherT = new TaskOtherModel("Meglocsolni a palántákat", 10, 15);
        c.addTask(hobbyT);
        c.addTask(otherT);
        TaskModel expResult = hobbyT;
        TaskModel first = c.getAll().get(0);
        TaskModel expResult2 = otherT;
        TaskModel second = c.getAll().get(1);
        assertEquals(expResult, first);
        assertEquals(expResult2, second);
    }
     @Test
    public void testAddTask2() {
        TasksContainerModel c = new TasksContainerModel();  
        TaskHobbyModel hobbyT = new TaskHobbyModel("Festeni egy képet", 15, 15);
        TaskOtherModel otherT = new TaskOtherModel("Meglocsolni a palántákat", 10, 15);
        c.addTask(hobbyT);
        c.addTask(otherT);
        assertFalse(c.getAll().isEmpty());
    }

      @Test
    public void testAddTask3() { //History check
        TasksContainerModel c = new TasksContainerModel();  
        TaskHobbyModel hobbyT = new TaskHobbyModel("Festeni egy képet", 15, 15);
        c.addTask(hobbyT);
        assertTrue(c.history.listLength()==1);
        
    }
    
    @Test
    public void testRemoveTask() {
       TasksContainerModel c = new TasksContainerModel();
       TaskOtherModel otherT = new TaskOtherModel("Meglocsolni a palántákat", 10, 15);
       c.addTask(otherT);
       c.removeTask(otherT);
       assertTrue(c.getAll().isEmpty());
    }

}
