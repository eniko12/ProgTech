/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.Model;

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
    public void testSetName() {
        ProfileModel p = new ProfileModel("REgINa");        
        String expResult = "Regina";
        String name = p.getName();
        assertEquals(expResult, name);
    }

    
     
    @Test
    public void testGetName() {
        ProfileModel p = new ProfileModel("Regina");        
        String expResult = "Regina";
        String name = p.getName();
        assertEquals(expResult, name);
    }
  

    
    @Test
    public void testSetGold() {
        ProfileModel p = new ProfileModel("Regina");  
        p.setGold(-10);
        int gold = p.getGold();
        int expResult = 0;        
        assertEquals(expResult, gold);   
    }
    
    public void testSetGold2() {
        ProfileModel p = new ProfileModel("Regina");  
        p.setGold(110);
        int gold = p.getGold();
        int expResult =110;        
        assertEquals(expResult, gold);   
    }
    
    public void testSetGold3() {
        ProfileModel p = new ProfileModel("Regina"); 
        TaskCreateModel create = new TaskCreateModel(); 
        TaskJobModel jobT = new TaskJobModel("Email-ek kiküldése", -100, 10);
        create.TaskType(jobT);
        create.taskDone(p);  
        int expResult = 0;
        int gold = p.getGold();
        assertEquals(expResult, gold);   
    }

    
    @Test
    public void testGetGold() {
        ProfileModel p = new ProfileModel("Regina"); 
        int expResult = 50;
        int gold = p.getGold();
        assertEquals(expResult, gold);
    }

   
    @Test
    public void testSetJobLevel() {
        ProfileModel p = new ProfileModel("Regina"); 
        int expResult = 10;
        p.setJobLevel(10);
        int points = p.getJobLevel();
        assertEquals(expResult, points);
        
    }

    
    @Test
    public void testGetJobLevel() {
        ProfileModel p = new ProfileModel("Regina"); 
        int expResult = 0;
        int points = p.getJobLevel();
    }
    
     @Test
    public void testSetHobbyLevel() {
        ProfileModel p = new ProfileModel("Regina"); 
        int expResult = 10;
        p.setHobbyLevel(10);
        int points = p.getHobbyLevel();
        assertEquals(expResult, points);
        
    }

    
    @Test
    public void testGetHobbyLevel() {
        ProfileModel p = new ProfileModel("Regina"); 
        int expResult = 0;
        int points = p.getHobbyLevel();
    }
    
     @Test
    public void testOtherLevel() {
        ProfileModel p = new ProfileModel("Regina"); 
        int expResult = 10;
        p.setOtherLevel(10);
        int points = p.getOtherLevel();
        assertEquals(expResult, points);
        
    }

    
    @Test
    public void testGetOtherLevel() {
        ProfileModel p = new ProfileModel("Regina"); 
        int expResult = 0;
        int points = p.getOtherLevel();
    }

}
