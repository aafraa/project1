/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HOUDA
 */
public class CompteFacadeTest {
    
    public CompteFacadeTest() {
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
     * Test of debiter method, of class CompteFacade.
     */
    @Test
    public void testDebiter() {
        System.out.println("debiter");
        String rib = "6";
        double montant = 10000;
        CompteFacade instance = new CompteFacade();
        int expResult =-1;
        int result = instance.debiter(rib, montant,true);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of crediter method, of class CompteFacade.
     */
    @Test
    public void testCrediter() {
        System.out.println("crediter");
        String rib = "4";
        double montant = 20.0;
        CompteFacade instance = new CompteFacade();
        int expResult = 1;
        int result = instance.crediter(rib, montant,true);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of transferer method, of class CompteFacade.
     */
    @Test
    public void testTransferer() {
        System.out.println("transferer");
        String source = "4";
        String destination = "5";
        double montant = 3.0;
        CompteFacade instance = new CompteFacade();
        int expResult = 1;
        int result = instance.transferer(source, destination, montant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
