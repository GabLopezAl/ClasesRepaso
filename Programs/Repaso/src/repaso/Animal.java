package repaso;

public class Animal {
    
    private static int cantidad;
    private String dieta;
    private int edad;
    private String especie;
    private String nombre;
    private float peso;
    private char sexo;
    private float tamanio;
    
    public Animal(){
         Animal.cantidad = 5;
         this.dieta = "";
         this.edad = 0;
         this.especie = "";
         this.nombre = "";
         this.peso = 0;
         this.sexo = '\0';
         this.tamanio = 0;
         
    }
    public Animal(String nombre, char sexo, String dieta){
        this.nombre = nombre;
        this.sexo = sexo;
        this.dieta = dieta;
    }
    
    public void cazando(){
       System.out.println("El animal " + this.nombre + " está cazando");
    }
    
    public void durmiendo(){
        System.out.println("El animal " + this.nombre + " está durmiendo");
    }
    
    public void setComiendo(String food){
        this.dieta = food;
    }
    
    public String getComiendo(){
        return this.dieta;
    }
    
    public static int numAnimales(){
        return Animal.cantidad;
    }
    
    public String toString(){
        return this.nombre + this.especie + this.dieta;
    }
}
