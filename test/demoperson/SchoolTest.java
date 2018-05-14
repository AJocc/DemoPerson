/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoperson;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cwcis
 */
public class SchoolTest {
    
    public SchoolTest() {
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
     * Test of getName method, of class School.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        School instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class School.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Robert";
        School instance = new School("Samuel");
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(name, instance.getName());
    }

    /**
     * Test of toString method, of class School.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        School instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
