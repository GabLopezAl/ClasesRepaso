
package repaso;


public class Auto {
   
    private float cantidadGasolina;
    private float kilometraje;
    private int velocidad;
    
    public Auto(){
         this.cantidadGasolina = 0;
         this.kilometraje = 0;
         this.velocidad = 0;
         System.out.println("Valores por default");
    }
    public Auto(float newCantGas, float newKilometraje, int newVelocidad){
        this.cantidadGasolina = newCantGas;
        this.kilometraje = newKilometraje;
        this.velocidad = newVelocidad;
    }
    
    public void aumentarVelocidad(int velocidadAumentar){
       this.velocidad += velocidadAumentar;
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
}
