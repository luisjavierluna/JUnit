/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EE_1;

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
public class RandomNumberGeneratorTest {
    RandomNumberGenerator instance;
    
    public RandomNumberGeneratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new RandomNumberGenerator();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of generarNumero method, of class RandomNumberGenerator.
     */
    @Test
    public void testGenerarNumeroCorrecto() {
        System.out.println("generarNumero");
        int result = instance.generarNumero(20, 60);
        assertTrue(40 >= 20 && 40 <= 60);
    }
    
    @Test
    public void testGenerarNumeroIncorrecto() {
        System.out.println("generarNumero");
        int result = instance.generarNumero(20, 60);
        assertFalse(70 >= 20 && 70 <= 60);
    }
    
}
