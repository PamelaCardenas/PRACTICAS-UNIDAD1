
import java.util.Scanner;

/*
 * Factorial de un numero con For y Funcion recursiva
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
        System.out.println("Introduce un valor: ");
        int iNum = sCaptu.nextInt();
        sCaptu.nextLine();
        System.out.println("Factorial (" + iNum + ") = " + factorial(iNum));
        
        System.out.println("FactorialRecu (" + iNum + ") = " + factorialRecu(iNum));
        
    }
    
    //Funcion factorial para calular el factorial de un numero
    public static int factorial(int iVal){
        int iResu = 1;
        for (int i = 1; i <= iVal; i++) {
            iResu = iResu * i;
            //iResu *= i;
        }
        return iResu;
    }
    
    //Calcular factorial de un numero con funcion recursiva
    public static int factorialRecu(int iVal){
        if(iVal == 0){
            return 1;
        }
        else{
        return iVal * factorialRecu(iVal - 1);
        }
    }
    
}
