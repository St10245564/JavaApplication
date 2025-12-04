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
public class ReportIT {
    
    public ReportIT() {
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
     * Test of menus method, of class Report.
     */
    @Test
    public void testMenus() {
        System.out.println("menus");
        Report instance = new Report();
        instance.menus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of taskDetails method, of class Report.
     */
    @Test
    public void testTaskDetails() {
        System.out.println("taskDetails");
        Report instance = new Report();
        instance.taskDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTasksWithStatus method, of class Report.
     */
    @Test
    public void testDisplayTasksWithStatus() {
        System.out.println("displayTasksWithStatus");
        String status = "";
        Report instance = new Report();
        instance.displayTasksWithStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTaskWithLongestDuration method, of class Report.
     */
    @Test
    public void testDisplayTaskWithLongestDuration() {
        System.out.println("displayTaskWithLongestDuration");
        Report instance = new Report();
        instance.displayTaskWithLongestDuration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class Report.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        Report instance = new Report();
        instance.searchTaskByName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class Report.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        Report instance = new Report();
        instance.searchTasksByDeveloper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTaskByName method, of class Report.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        Report instance = new Report();
        instance.deleteTaskByName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayFullTaskReport method, of class Report.
     */
    @Test
    public void testDisplayFullTaskReport() {
        System.out.println("displayFullTaskReport");
        Report instance = new Report();
        instance.displayFullTaskReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateTaskID method, of class Report.
     */
    @Test
    public void testGenerateTaskID() {
        System.out.println("generateTaskID");
        String taskName = "";
        int count = 0;
        String developerName = "";
        Report instance = new Report();
        String expResult = "";
        String result = instance.generateTaskID(taskName, count, developerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
