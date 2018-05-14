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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new Person(33);
        String expResult = "Person{age=33}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Person.
     */
    @Test
    public void testGetAge() {
        System.out.println("Testing getAge");
        Person instance = new Person(79);

        int result = instance.getAge();
        assertEquals(79, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Person.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 11;
        Person instance = new Person(1);
        instance.setAge(age);
        int result = instance.getAge();
        assertEquals(age, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTooBig() {
        System.out.println("Set Too Big");
        Person p = new Person(50);
        p.setAge(200);
        assertEquals("Trying to go to 200 but should be 150", Person.MAX_AGE, p.getAge());
    }
    
}
