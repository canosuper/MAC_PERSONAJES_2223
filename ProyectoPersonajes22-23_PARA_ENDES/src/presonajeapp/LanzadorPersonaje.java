/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presonajeapp;

import excepcionpersonaje.ExcepcionPersonaje;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectopersonajes.Personaje;

/**
 *
 * @author antonio
 */
public class LanzadorPersonaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("He creado: "+Personaje.numeroPersonajes+" personajes");
            Personaje p1= new Personaje();
            
            Personaje p2=new Personaje("Frodo",(byte)101,(byte)67);
            
            System.out.println("P1: "+p1.toString());
            System.out.println("P2: "+p2.toString());
            
            p1.setNombre("Gandalf");
            p1.setInteligencia((byte)50);
            
            System.out.println("P1: "+p1.toString());
            System.out.println("P2: "+p2.toString());
            
            System.out.println("He creado: "+Personaje.numeroPersonajes+" personajes");
        } catch (ExcepcionPersonaje ex) {
            System.out.println(ex.getMessage());            
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
