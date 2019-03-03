
import java.util.Scanner;

/*
 * Calcular el maximo comun divisor de dos numeros 
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
        
        System.out.println("Introduce el primer numero: ");
        int n1 = sCaptu.nextInt(); //Captura el primer numero
        System.out.println("Introduce el segundo numero: ");
        int n2 = sCaptu.nextInt(); //Captura el segundo numero
        
        sCaptu.nextLine();
        
        System.out.println(gcdRecu(n1, n2)); //Muestra el resultado del maximo comun divisor llamando a la funcion
    }
    
    public static int gcdRecu(int iVal1, int iVal2){ //Funcion para calcular al gcd
        int residuo = 0; //Inicializar variable
        residuo = iVal1 % iVal2; //Calcular el residuo de esos numeros
        
        if(residuo == 0){ //Si el residuo es igual a cero
            return iVal2; //Regresa el segundo valor usado
        }
        
        else { //Si no
            return gcdRecu(iVal2, residuo); //Se llama de nuevo a la funcion ahora con los argumentos de la segunda variable y el residuo
        }
    }
    
    
}
