/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *
 * @author Abigail y Victor
 */

public class Perro {
    private String nombre;
    private String raza;
    private String sexo;
    private String color;
    boolean hambriento;
    boolean cansado;
    
    /**
     * Contructor Perro que no recibe parámetros
     */
    public Perro(){
        this.hambriento = true;
        this.cansado = true;
    }
    /**
     * Contructor Perro que recibe 3 parámetros
     * @param nombre
     * @param raza
     * @param color 
     */
    public Perro(String nombre,String raza, String color) {
       this.nombre=nombre;
       this.raza=raza;
       this.sexo= "Masculino";
       this.color=color;
       this.hambriento = false;
        this.cansado = true;
    }
    /**
     * Constructor Perro que recibe 2 parámetros
     * @param nombre
     * @param raza 
     */
    
    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = "Femenino";
        this.color = "cafe";
        this.hambriento = false;
        this.cansado = false;
    }
    
    /**
     * 
     * @return Es de tipo cadena
     */

    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el parámetro nombre
     * @param nombre 
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Es de tipo cadena 
     */

    public String getRaza() {
        return raza;
    }
    /**
     * Establece el parámetro de raza
     * @param raza 
     */

    public void setRaza(String raza) {
        this.raza = raza;
    }
    /**
     * 
     * @return Es de tipo cadena
     */
    
    public String getSexo() {
        return sexo;
    }
    /**
     * Establece el parámetro sexo
     * @param sexo 
     */

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * 
     * @return Es de tipo cadena
     */

    @Override
    public String toString() {
        return "Perro{" + "Nombre= " + nombre + ", Raza= " + raza + ", Sexo= " + sexo + ", Color= " + color + '}';
    }
    /**
     * Método que indica si el perro come o no tiene hambre
     * @param comida Es de tipo cadena
     * @return Es de tipo boolean
     */
    
    boolean comer (String comida) {
        if(hambriento==false) {
            System.out.println("No tengo hambre"); 
        }
        else {
            System.out.println("Estoy comiendo "+comida);
        }
        return hambriento=false;
    }
    /**
     * Método que indica con que está jugando el perro y cambia los valores de hambriento y candado a true
     * @param juguete Es de tipo cadena 
     */
    
    void jugar (String juguete) {
        System.out.println("Estoy jugando con " + juguete);
        hambriento=true;
        cansado=true;
    }
    /**
     * Método que indica el truco que reliza el perro y cambia el valor de cansado a true
     * @param truco Es de tipo caracter 
     */
    
    void hacerTruco(String truco){
        System.out.println("Soy bueno en "+truco);
        cansado=true;
        
    }
    /**
     * Método que indica si el perro duerme y cambia el valor de casado a false
     */

    void dormir ( ) {
        System.out.println("Estoy durmiendo");
        cansado=false;
    }

}