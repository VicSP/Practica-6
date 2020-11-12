/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Esta es la clase TrianguloRectangulo que se utilizó en la practica 4
 * @author Abigail y Victor
 */
public class TrianguloRectangulo {
    private float hipotenusa;
    private float ca;
    private float co;
    private boolean angulosCorretos;
    static int a1=90;
    static int a2=60;
    static int a3=30;
    
    /**
     * Costructor vacio persona
     */
    public TrianguloRectangulo() {
    }
    /**
     * Constuctor que recibe 3 parámetros
     * @param hipotenusa
     * @param ca
     * @param co 
     */

    public TrianguloRectangulo(float hipotenusa, float ca, float co) {
        this.hipotenusa = hipotenusa;
        this.ca = ca;
        this.co = co;
    }
    /**
     * 
     * @return Es de tipo flotante
     */

    public float getHipotenusa() {
        return hipotenusa;
    }
    /**
     * Establece el valor de la hipotenusa
     * @param hipotenusa 
     */

    public void setHipotenusa(float hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    /**
     * 
     * @return Es de tipo flotante
     */

    public float getCa() {
        return ca;
    }
    /**
     * Establece el valor del cateto adyacente
     * @param ca 
     */

    public void setCa(float ca) {
        this.ca = ca;
    }
    /**
     * 
     * @return Es de tipo flotante
     */

    public float getCo() {
        return co;
    }
    /**
     * Establece el valor del cateto opuesto
     * @param co 
     */

    public void setCo(float co) {
        this.co = co;
    }
    /**
     * 
     * @return Es de tipo boolean
     */

    public boolean isAngulosCorretos() {
        return angulosCorretos;
    }
    /**
     * Establece el valor de angulosCorrectos
     * @param angulosCorretos 
     */

    public void setAngulosCorretos(boolean angulosCorretos) {
        this.angulosCorretos = angulosCorretos;
    }
    /**
     * 
     * @return Es de tipo cadena
     */
    
    @Override
    public String toString() {
        return "TrianguloRectangulo{" + "hipotenusa=" + hipotenusa + ", ca=" + ca + ", co=" + co + '}';
    }
    /**
     * Método que calcula la hipotenusa
     * @return Es de tipo flotante
     */
    
    public float calculoHipotenusa(){
        float x,cuaCo,cuaCa;
        cuaCo=co*co;
        cuaCa=ca*ca;
        x=cuaCo+cuaCa;
        hipotenusa=(float)Math.sqrt(x);
        return hipotenusa;
    }
    /**
     * Método que calcula el perimetro
     * @return  Es de tipo flotante
     */
    
    public float perimetro(){
    return co+ca+hipotenusa;
    } 
    /**
     * Método que calcula el área
     * @return 
     */
    
    public float area(){
        return (co*ca)/2;
    }
    /**
     * Método que verifica si los angulos son correctos
     * @return Es de tipo flotante
     */
    
    public boolean angulos(){
        if (a1+a2+a3==180) {
            return angulosCorretos =true;
        }
        else{
            return angulosCorretos =false;
        }
    }
    /**
     * Método que muestra las funciones trigonométricas sen, cos y tan
     */
    
    public void funcionesTrigo(){
        float sen,cos,tan;
        sen=co/hipotenusa;
        cos=ca/hipotenusa;
        tan=co/ca;
        System.out.println("Seno: "+sen);
        System.out.println("Coseno: "+cos);
        System.out.println("Tangente: "+tan);  
    }
}
