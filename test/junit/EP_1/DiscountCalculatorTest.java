/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EP_1;

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
public class DiscountCalculatorTest {
    
    DiscountCalculator instance;
    
    public DiscountCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new DiscountCalculator();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularDescuento method, of class DiscountCalculator.
     */
    @Test
    public void testCalcularDescuento() {
        
        System.out.println("Calcular Descuento 10%");
        double result = instance.calcularDescuento(100, 0.1);
        assertEquals(90.0, result, 0.0);
        
        System.out.println("Calcular Descuento máximo");
        result = instance.calcularDescuento(100, 1.0);
        assertEquals(0.0, result, 0.0);
        
        System.out.println("Calcular Descuento sin descuento");
        result = instance.calcularDescuento(100, 0.0);
        assertEquals(100.0, result, 0.0);
        
    }
    
}
