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
class Fecha {
    private int dia;
    private int mes;
    private int anio;
    /**
     * Constructor vacio Fecha
     */

    public Fecha() {
    }
    /**
     * Constructor que recibe 3 parametros
     * @param dia
     * @param mes
     * @param anio 
     */

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * 
     * @return Es de tipo entero
     */

    public int getDia() {
        return dia;
    }
    /**
     * Establece el parametro dia
     * @param dia 
     */

    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * 
     * @return Es de tipo entero
     */

    public int getMes() {
        return mes;
    }
    /**
     * Establece el parametro mes
     * @param mes 
     */

    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * 
     * @return Es de tipo entero
     */

    public int getAnio() {
        return anio;
    }
    /**
     * Establece el parametro anio
     * @param anio 
     */

    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * 
     * @return Es de tipo cadena 
     */

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
    
    
    
}
