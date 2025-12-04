/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.x;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class RegisterClassIT {
    
    public RegisterClassIT() {
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
     * Test of LOGINUser method, of class RegisterClass.
     */
    @Test
    public void testLOGINUser() {
        System.out.println("LOGINUser");
        String logUser = "";
        String logPassword = "";
        RegisterClass instance = null;
        boolean expResult = false;
        boolean result = instance.LOGINUser(logUser, logPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class RegisterClass.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        RegisterClass instance = null;
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class RegisterClass.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        RegisterClass instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
