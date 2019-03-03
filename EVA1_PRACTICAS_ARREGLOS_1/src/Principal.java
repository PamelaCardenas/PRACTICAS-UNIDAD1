
import java.util.Scanner;

/*
 * Sacar media, moda y desviacion estandar
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
        
        System.out.println("Ingrese cuantas edades va a capturar");
        int nEd = sCaptu.nextInt();
        
        int aEdades[] = new int[nEd];
        
        for (int i = 0; i < aEdades.length; i++) {
            System.out.println("Edad: ");
            aEdades[i] = sCaptu.nextInt();
            
        }
        
        System.out.println(" media = " + media(aEdades) + "\n Moda = " + moda(aEdades) 
                + "\nDesviacion estandar = " + desviacionEstan(aEdades));
        
        
    }
    
    public static double media(int[] arr){
        int e = 0, cont = 0;
        for (int i = 0; i < arr.length; i++) {
           e += arr[i];
           cont++;
        }
        
        double med = e/cont;
        return med;
    }
    
    public static int moda(int[] arr){
        
        int moda = 0, frec, frecTemp, frecModa=0, moda1 = -1;
        
        for (int i = 0; i < arr.length; i++) {
            frecTemp = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    frecTemp++;
                }
                if (frecTemp > frecModa){
                    frecModa = frecTemp;
                    moda1 = arr[i];
                }
                
            }
            
        }return  moda1;
    }
    
    public static double desviacionEstan(int[] arr){
        double prom, sum=0;
        int i;
        prom = media(arr);
        
        for (i = 0; i < arr.length; i++) {
            sum+= Math.pow(arr[i] - prom, 2);
            
        }
        
        return Math.sqrt(sum/(arr.length));
    }
    
}
