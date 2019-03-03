
import java.util.Scanner;

/*
 * Llamar a si misma una funcion, con recursividad y mostrar numeros del 1 al numero ingresado y del numero al 1
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
        System.out.println("Introduce un numero: ");
        int iNum = sCaptu.nextInt();
        sCaptu.nextLine();
        /*for (int i = iNum; i >= 1; i--) {
            System.out.println(i + " - ");
            
        }*/
        recursiveDown(iNum);
        System.out.println("");
        recursiveUp(iNum, 1);
    }
    
    public static void recursiveDown(int iVal){
        /*DOS CARACTERISTICAS:
        1. LLAMADA RECURSIVA: El metodo debe llamarse a si mismo
        2. DETENERSE: El metodo debe proporcionar maneras para detener la recursion
        */
        
        System.out.print(iVal);
        if(iVal > 1){
            System.out.print(" - ");
            recursiveDown(iVal - 1);
        }
        
    }
    
    public static void recursiveUp(int iVal, int iCont){
        
        System.out.print(iCont);
        
        if(iCont < iVal){
            System.out.print(" - ");
            recursiveUp(iVal, iCont+1);
        }
    }
    
}
