
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

/**
 *
 * @author DELL
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String ocupacion;
    private char sexo;
    private static int cantidad;
    
    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.sexo = '\0';
        this.edad = 0;
        this.ocupacion = "";
        this.cantidad = 5;
    }
    
    public Persona(String nombre, String apellido, String ocupacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
    }
    
    public static int numPersonas(){
      return Persona.cantidad;
    }
    
    public void comiendo(){
        System.out.println(this.nombre + " está comiendo");
    }
    
    public void durmiendo(){
        System.out.println(this.nombre + " está durmiendo");
    }
    
    public void estudiando(){
        System.out.println(this.nombre + " está estudiando");
    }
}
