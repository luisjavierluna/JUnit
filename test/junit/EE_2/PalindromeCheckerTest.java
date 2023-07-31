/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EE_2;

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
public class PalindromeCheckerTest {
    PalindromeChecker instance;
    
    public PalindromeCheckerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new PalindromeChecker();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of revisarPalindromo method, of class PalindromeChecker.
     */
    @Test
    public void testRevisarPalindromoCorrecto() {
        System.out.println("Palindromo Correcto");
        String palindromo = "A Mercedes, ese de crema";
        boolean expResult = true;
        boolean result = instance.revisarPalindromo(palindromo);
        assertTrue(expResult);
    }
    
    @Test
    public void testRevisarPalindromoIncorrecto() {
        System.out.println("Palindromo Incorrecto");
        String palindromo = "Anita no lava la tina";
        boolean expResult = false;
        boolean result = instance.revisarPalindromo(palindromo);
        assertFalse(expResult);
    }
    
}
