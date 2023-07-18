/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EP_2;

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
public class TemperatureConverterTest {
    
    TemperatureConverter instance;
    double celsius;
    
    public TemperatureConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         instance = new TemperatureConverter();
         celsius = 30;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertirCelsiusAFahrenheit method, of class TemperatureConverter.
     */
    @Test
    public void testConvertirCelsiusAFahrenheit() {
        System.out.println("convertirCelsiusAFahrenheit");
        double result = instance.convertirCelsiusAFahrenheit(celsius);
        assertEquals(86, result, 0.0);
    }

    /**
     * Test of convertirCelsiusAKelvin method, of class TemperatureConverter.
     */
    @Test
    public void testConvertirCelsiusAKelvin() {
        System.out.println("convertirCelsiusAKelvin");
        double result = instance.convertirCelsiusAKelvin(celsius);
        assertEquals(303.15, result, 0.0);
    }
    
}
