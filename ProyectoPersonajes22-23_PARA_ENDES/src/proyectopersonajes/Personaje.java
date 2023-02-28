/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopersonajes;

import excepcionpersonaje.ExcepcionPersonaje;

/**
 *
 * @author ANTONIO
 */
public class Personaje {
    /* 
    constantes que nos servirán para controlar el número máximo de algunas características
    de los personajes.    
    */ 
    final static byte MAX_FUERZA=100;
    final static byte MAX_INTELIGENCIA=100;
    final static byte MAX_VIDA=100;
    final static byte MIN_FUERZA=0;
    final static byte MIN_INTELIGENCIA=0;
    final static byte MIN_VIDA=0;

    //variable estática qeu se irá incrementando con la creación de cada personaje.
    public static short numeroPersonajes;

    //nombre,vida, inteligencia y fuerza del personaje
    private String nombre;
    private byte vida;
    private byte inteligencia;
    private byte fuerza;

    public Personaje() {
        this.nombre = "S/N";
        this.vida = MAX_VIDA;
        this.inteligencia = MIN_FUERZA;
        this.fuerza = MIN_FUERZA;
        numeroPersonajes++;
    }
    public Personaje(String nombre,byte inteligencia, byte fuerza) throws ExcepcionPersonaje{
        this.nombre = nombre;
        this.vida=MAX_VIDA;
        this.setInteligencia(inteligencia);
        this.setFuerza(fuerza);
        numeroPersonajes++;
    }    
  
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getVida() {
        return vida;
    }


    public byte getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(byte inteligencia) throws ExcepcionPersonaje {
        if (inteligencia<MIN_INTELIGENCIA){
            throw new ExcepcionPersonaje ("La inteligencia no puede ser menor que "+MIN_INTELIGENCIA);
        }
        else{
            if(inteligencia>MAX_INTELIGENCIA){
                throw new ExcepcionPersonaje ("La inteligencia no puede ser mayor que "+MAX_INTELIGENCIA);
            }
            else{
                this.inteligencia=inteligencia;
            }
        }
    }

    public byte getFuerza() {
        return fuerza;
    }

    public void setFuerza(byte fuerza) throws ExcepcionPersonaje {
        if (fuerza<MIN_FUERZA){
            throw new ExcepcionPersonaje ("La fuerza no puede ser menor que "+MIN_FUERZA);
        }
        else{
            if(fuerza>MAX_FUERZA){
                throw new ExcepcionPersonaje ("La fuerza no puede ser mayor que "+MAX_FUERZA);
            }
            else{
                this.fuerza=fuerza;
            }
        }
    }
    
    public void batalla(Personaje p){
        short totalThis,totalP;
        totalThis= (short) (this.fuerza+this.inteligencia);
        totalP= (short) (p.fuerza+p.inteligencia);
        
        if(totalThis==totalP){
            this.restarVida();
            p.restarVida();
        }
        else{
            if(totalThis<totalP){
                this.restarVida();
            }
            else{
                p.restarVida();
            }
        }
    }
    private void restarVida(){
        //controlar límite negativo
        this.vida=-20;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", vida=" + vida + ", inteligencia=" + inteligencia + ", fuerza=" + fuerza + '}';
    }   
   

}
