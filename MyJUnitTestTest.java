/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myjunittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author X00114930
 */
public class MyJunitTestTest {
    
    public MyJunitTestTest() {
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
     * Test of main method, of class MyJunitTest.
     */
    //@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyJunitTest.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of grade method, of class MyJunitTest.
     */
    @Test
    public void testGrade50_60() {
        System.out.println("grade");
        String examMark = "50";
        String caMark = "60";
        String expResult = "Pass";
        String result = MyJunitTest.grade(examMark, caMark);
        assertEquals(expResult, result);
    }
    @Test
    public void testGrade30_20() {
        System.out.println("grade");
        String examMark = "30";
        String caMark = "20";
        String expResult = "Component fail";
        String result = MyJunitTest.grade(examMark, caMark);
        assertEquals(expResult, result);
    }
    @Test
    public void testGrade74_90() {
        System.out.println("grade");
        String examMark = "74";
        String caMark = "90";
        String expResult = "Pass with distinction";
        String result = MyJunitTest.grade(examMark, caMark);
        assertEquals(expResult, result);
    }
    @Test
    public void testGrade45_45() {
        System.out.println("grade");
        String examMark = "45";
        String caMark = "45";
        String expResult = "Fail";
        String result = MyJunitTest.grade(examMark, caMark);
        assertEquals(expResult, result);
    }
    @Test
    public void testGradeMinus1_101() {
        System.out.println("grade");
        String examMark = "-1";
        String caMark = "101";
        String expResult = "Invalid input";
        String result = MyJunitTest.grade(examMark, caMark);
        assertEquals(expResult, result);
    }
}
