
import java.util.Scanner;

/*
 * Ingresar un numero, calcular la suma de los digitos
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
        System.out.println("Ingrese un numero"); //Mensaje
        int num = sCaptu.nextInt(); //Ingresar un numero
        
        //Muestra mensaje con la suma de los digitos
        System.out.println("La suma de los digitos es: " + sumaDigitos(num));
    }
    
    //Metodo para sumar los digitos
    public static int sumaDigitos(int iVal){
        
        if(iVal==0){ //Si la variable es igual a 0
            return 0; //Regresa el valor 0
        }
        else{ //Si es diferente a 0
            //Llama de nuevo a la funcion mandando como argumento el resultado de
            // la division del numero entre 10, mientras se va sumando el residuo
            return sumaDigitos(iVal/10) + iVal%10; 
        }
    }
    
}
