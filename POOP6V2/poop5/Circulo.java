/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *
 * @author Santiago Victor
 */
public class Circulo {
    static double PI=Math.PI;
    private double radio;
    private String color;
    
    /**
     * Constructor vacio Circulo
     */
    public Circulo() {
    }
    
    /**
     * Constructor que recibe 1 parametro 
     * @param radio 
     */
    public Circulo(double radio) {
        this.radio = radio;
    }
    /**
     * 
     * @return radio es de tipo double
     */

    public double getRadio() {
        return radio;
    }
    /**
     * Establece el parámetro radio
     * @param radio 
     */

    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * 
     * @return Es de tipo cadena 
     */

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }
    /**
     * 
     * @return Es de tipo double
     */

    public double perimetro(){
        return 2 * PI * radio;
    }
    /**
     * 
     * @return Es de tipo double
     */
    
    public double area(){
        return PI * radio * radio;
    }
    
    
    
    
    
    
}
