/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EP_3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javie
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
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
     * Test of verificarPassword method, of class PasswordValidator.
     */
    @Test
    public void testVerificarPassword() {
        System.out.println("verificarPassword true");
        PasswordValidator instance = new PasswordValidator();
        boolean result = instance.verificarPassword("conT#raSenia");
        assertEquals(true, result);
        
        System.out.println("verificarPassword false");
        instance = new PasswordValidator();
        result = instance.verificarPassword("cont#rasenia");
        assertEquals(false, result);
    }
    
}
