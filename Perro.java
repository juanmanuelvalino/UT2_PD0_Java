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
public class Perro {
    
    private String nombre;
    
    public Perro(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void ladrar(){
        System.out.println("wof");
    }
    public boolean respondeA(String unNombre){
        return this.nombre.equals(unNombre);
    }
    
}
