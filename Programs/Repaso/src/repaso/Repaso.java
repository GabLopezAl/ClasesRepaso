
package repaso;


public class Repaso {

    public static void main(String[] args) {
        
        //Auto a1 = new Auto();
        /*Auto a1 = new Auto();
        int vel = a1.getVelocidad();
        System.out.println("La velocidad del coche es: " + vel);
        a1.aumentarVelocidad(20);
        vel = a1.getVelocidad();
        System.out.println('\n' + "Nueva velocidad" + '\n' + "La velocidad del coche es: " + vel);*/
        
        Animal a1 = new Animal("Jirafa",'M',"Pasto");
        a1.setComiendo("Pasto");
        String comida = a1.getComiendo();
        a1.cazando();
        a1.durmiendo();
        System.out.println(a1);
        
        System.out.println(Animal.numAnimales());
        
        Persona p1 = new Persona("Angel","Lopez","Student");
        p1.estudiando();
        p1.comiendo();
        p1.durmiendo();
    }
    
}

