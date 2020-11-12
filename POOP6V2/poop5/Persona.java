/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 * Esta es la clase persona que se utilizó en la practica 5
 * @author Santiago Victor
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimietno;
    
    /**
     * Constructor vacio persona
     */
    public Persona() {
    }
    
    /**
     * Es el constructor que recibe 3 parametros
     * @param nombre
     * @param apellido
     * @param fNacimietno 
     */

    public Persona(String nombre, String apellido, Fecha fNacimietno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimietno = fNacimietno;
    }
    
    /**
     * Es el constructo que recibe 2 parametros
     * @param nombre
     * @param apellido 
     */
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimietno= new Fecha(3,5,2000);
    }
    
    /**
     * 
     * @return nombre Es de tipo string
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el parametro nombre
     * @param nombre 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return apellido Es de tipo string
     */

    public String getApellido() {
        return apellido;
    }
    /**
     * Establece el parametro apellido
     * @param apellido 
     */

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * 
     * @return fNacimietno Es de tipo fecha
     */

    public Fecha getfNacimietno() {
        return fNacimietno;
    }
    /**
     * Establece fNacimiento
     * @param fNacimietno 
     */

    public void setfNacimietno(Fecha fNacimietno) {
        this.fNacimietno = fNacimietno;
    }
    /**
     * 
     * @return Es de tipo cadena
     */
    
    @Override //sobrecargar metodo
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimietno=" + fNacimietno + '}';
    }
    
    
    
}
