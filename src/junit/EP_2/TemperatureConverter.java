/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EP_2;

/**
 *
 * @author javie
 */
public class TemperatureConverter {
    public double convertirCelsiusAFahrenheit(double celsius) {
        // Fórmula (0 °C × 9/5) + 32 = 32 °F
        return (celsius * 1.8) + 32;
    }
    
    public double convertirCelsiusAKelvin(double celsius) {
        // Fórmula 0 °C + 273.15 = 273.15 K
        return celsius + 273.15;
    }
    
    
}
