/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EP_1;

/**
 *
 * @author javie
 */
public class DiscountCalculator {
    
    public double calcularDescuento(double precio, double descuento) {
        return precio - (precio * descuento);
    }
}
