/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.x;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author lab_services_student
 */
public class RegisterClassNGTest {
    
    public RegisterClassNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
        assertEquals(result, expResult);
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
