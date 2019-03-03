/*
 * Arreglo con 50 numeros aleatorios entre 1-100, mostrar los numeros pares
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
        
        int arr[] = new int [50]; //Creacion de arreglo
        
        //LLenar arreglo
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() *100 +1);
        }
        
        //Mostrar valores del arreglo
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        
        System.out.println(""); //Salto de linea
        
        //Mostrar numeros pares del arreglo
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
               System.out.print("[" + arr[i] + "]");
           }
            
        }
        
    }
    
}
