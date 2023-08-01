/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EE_3;

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
public class SecurePasswordGeneratorTest {
    
    SecurePasswordGenerator instance;
    boolean expResult;
    boolean result;
    
    public SecurePasswordGeneratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SecurePasswordGenerator();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generarPassword method, of class SecurePasswordGenerator.
     */
    @Test
    public void testContiene$() {
        System.out.println("Contiene lel Simbolo $");
        expResult = true;
        String generatedPassword = instance.generarPassword();
        
        result = generatedPassword.contains("$");
        assertTrue(result);
    }
    
    @Test
    public void testNoContiene$() {
        System.out.println("No Contiene lel Simbolo $");
        expResult = true;
        String generatedPassword = instance.generarPassword();
        
        result = generatedPassword.length() == 10;
        assertTrue(result); 
    }
    
    @Test
    public void testTieneLongitud10() {
        System.out.println("Longitud de la contraseña es igual a 10");
        expResult = false;
        String generatedPassword = instance.generarPassword();
        result = !generatedPassword.contains("$");
        assertFalse(result);        
    }
    
    @Test
    public void testNoTieneLongitud10() {
        System.out.println("Longitud de la contraseña es diferente de 10");
        expResult = false;
        String generatedPassword = instance.generarPassword();
        
        result = generatedPassword.length() != 10;
        assertFalse(result);        
    }
    
}
