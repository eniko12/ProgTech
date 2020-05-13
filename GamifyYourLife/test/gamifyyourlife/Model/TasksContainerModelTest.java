/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        c.addTask(hobbyT);                  //HandleTaskModel-en át majd kesobb
        c.addTask(otherT);
        ArrayList<TaskModel> result = c.getAll();
        ArrayList<TaskModel> exp = new ArrayList<>();
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
        c.addTask(hobbyT);               //HandleTaskModel-en át majd kesobb
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
        assertFalse(c.getAll().isEmpty());          //nem üres
    }

        
    @Test
    public void testRemoveTask() {
       TasksContainerModel c = new TasksContainerModel();
       TaskOtherModel otherT = new TaskOtherModel("Meglocsolni a palántákat", 10, 15);
       c.addTask(otherT);
       c.removeTask(otherT);
       assertTrue(c.getAll().isEmpty());        //ha töröljük az 1db-ot üres!
    }
    
    @Test    
    public void testNotifyObserver(){           //új feladat hozzáadása
        TasksContainerModel c = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", c );
        TaskOtherModel otherT = new TaskOtherModel("Meglocsolni a palántákat", 10, 15);
        c.addTask(otherT);
        
        ArrayList<TaskModel> exp = new ArrayList<>();
        exp.add(otherT);
        
        TaskModel expResult = otherT;
        TaskModel result= c.getAll().get(0);
        
        assertEquals(expResult, result);     
    }
    
    @Test    
    public void testNotifyObserver2(){           //feladat törölve
        TasksContainerModel c = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", c );
        TaskOtherModel otherT = new TaskOtherModel("Meglocsolni a palántákat", 10, 15);
        c.addTask(otherT);
        c.removeTask(otherT);
        
        assertTrue(p.listEveryTask().isEmpty());     
    }
    
    @Test
    public void testSetTaskList(){
        TasksContainerModel c = new TasksContainerModel();
        ProfileModel p = new ProfileModel("Regina", c );
        TaskOtherModel otherT = new TaskOtherModel("Meglocsolni a palántákat", 10, 15);
        TaskOtherModel otherT2 = new TaskOtherModel("Mosogatni", 5, 10);
        
        ArrayList<TaskModel> theList = new ArrayList<>();
        theList.add(otherT);
        theList.add(otherT2);
        
        c.setTaskList(theList);
        
        assertEquals(c.getAll().get(1), theList.get(1));
        assertTrue(( p.listEveryTask().size())==2);         //Observer: a profilnál is megjelentek a feladatok
        
    }

}
