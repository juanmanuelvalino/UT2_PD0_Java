/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro;

/**
 *
 * @author estudiante.fit
 */
public class MainMaquinaA {
    public static void main(String[] args) {
       Perro gala = new Perro("Gala"); 
       System.out.println(gala.getNombre());
       System.out.println(gala.respondeA("Spike"));
       System.out.println(gala.respondeA("Gala"));
       gala.ladrar();
    }
}
