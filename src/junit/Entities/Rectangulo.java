/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.Entities;

/**
 *
 * @author javie
 */
public class Rectangulo {
    private double ancho;
    private double largo;
    private String color;
    private boolean active;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
        this.color = "Rojo";
        this.active = true;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public String getColor() {
        return color;
    }

    public boolean isActive() {
        return active;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
