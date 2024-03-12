
package repaso;


public class Repaso {

    public static void main(String[] args) {
        
        //Auto a1 = new Auto();
        Auto a1 = new Auto();
        int vel = a1.getVelocidad();
        System.out.println("La velocidad del coche es: " + vel);
        a1.aumentarVelocidad(20);
        vel = a1.getVelocidad();
        System.out.println('\n' + "Nueva velocidad" + '\n' + "La velocidad del coche es: " + vel);
    }
    
}

