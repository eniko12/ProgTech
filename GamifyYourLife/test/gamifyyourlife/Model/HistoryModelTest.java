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
public class HistoryModelTest {
    
    public HistoryModelTest() {
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
     * Test of getInstance method, of class HistoryModel.
     */
    @Test
    public void testGetInstance() {
        HistoryModel h1 = HistoryModel.getInstance();
        h1.addToHistory("Valami");
        HistoryModel h2 = HistoryModel.getInstance();
        
       assertTrue(h1 == h2);
    }

    /**
     * Test of addToHistory method, of class HistoryModel.
     */
    @Test
    public void testAddToHistory() {
        HistoryModel h1 = HistoryModel.getInstance();
        h1.addToHistory("Valami");
        
        assertTrue(h1.getList().size()>0);
    }
    
     @Test
    public void testAddToHistory2() {
        HistoryModel h1 = HistoryModel.getInstance();
        h1.addToHistory("Valami");
        
        boolean result = h1.getList().get(0).contains("Valami");
        String num = Integer.toString(h1.getList().size() + 1);
        boolean result2 = h1.getList().get(0).contains(num);    //sorszám
        assertTrue(result && result2);
    }

    /**
     * Test of listLength method, of class HistoryModel.
     */
    @Test
    public void testListLength() {
        HistoryModel h1 = HistoryModel.getInstance();
        h1.addToHistory("Valami");
        h1.addToHistory("Másik valami");
        
        int length = h1.getList().size();
        assertEquals(length, h1.listLength());
    }

    /**
     * Test of getListElement method, of class HistoryModel.
     */
    @Test
    public void testGetListElement() {
        HistoryModel h1 = HistoryModel.getInstance();
        h1.addToHistory("Valami");
        h1.addToHistory("Másik valami");
        
        String expected = h1.getList().get(0);
        String result = h1.getListElement(0);
        
        assertTrue(expected == result);
        
    }

    /**
     * Test of getList method, of class HistoryModel.
     */
    @Test
    public void testGetList() {
        HistoryModel h1 = HistoryModel.getInstance();
        h1.addToHistory("Valami");
        h1.addToHistory("Másik valami");
        
        assertTrue(h1.getList().size() == 2);
        assertTrue(h1.getList().get(0).contains("Valami"));
        assertTrue(h1.getList().get(1).contains("Másik valami"));
        assertFalse(h1.getList().get(0).contains("Másik"));
        
        
    }
    
}
