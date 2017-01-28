/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author João
 */
public class MyProjectTest {
    
    public MyProjectTest() {
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

    @Test
    public void testOperação() {
        System.out.println("opera\u00e7\u00e3o");
        int num1 = 1;
        int num2 = 2;
        char sinal = '+';
        MyProject instance = new MyProject();
        int expResult = 3;
        int result = instance.operação(num1, num2, sinal);
        assertEquals(expResult, result);
    }
    
}
