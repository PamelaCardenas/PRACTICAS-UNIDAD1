
import java.util.Scanner;

/*
 * Elevar una base a una n potencia 
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sCaptu = new Scanner(System.in);
        
        //Ingreso de datos 
        System.out.println("Ingrese el numero que desea elevar");
        int num = sCaptu.nextInt();
        
        System.out.println("¿A que potencia desea elevarlo?");
        int po = sCaptu.nextInt();
        
        System.out.println(potenciaN(num, po)); //Muestra resultado llamando al metodo
        
    }
    
    //Nuevo metodo pata calcular resultado de un numero elevado a una potencia
    public static int potenciaN(int num, int pot){
        
        
        if(num == 0 && pot == 0){ //si el numero y la potencia son iguales a 0 da 0
            return 0;
        }
        //Si el numero es diferente a 0 pero la potencia igual a 0 es 1
        else if (num != 0 && pot == 0){ 
            
            return 1;
        }
        //Si ambos son numeros diferentes a 0
        else{
            //Regresa el valor del numero multiplicado por si mismo segun el valor
            // de la potencia, cada vez que se llama el metodo se resta 1
            return num*potenciaN(num, pot-1);
        }
    }
    
}
