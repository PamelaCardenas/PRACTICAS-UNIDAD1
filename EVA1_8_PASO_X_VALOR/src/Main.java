/*
 * Paso por valor --> se manda una copia del valor
 * Paso por referencia --> Se manda una dirección de memoria
 * JAVA --> SOLO USA PASO POR VALOR
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArreglo[] = new int[100]; //Creacion de un arreglo
        
        //Llamar funcion llenar y imprimir
        llenar(aiArreglo);
        imprimir(aiArreglo);
        
        int iVal = 10; //Asigna valor a la variable
        System.out.println("\niVal = " + iVal);
        incremeneta(iVal); //Llama funcion incremeta llevando como argumento la variable
        System.out.println("iVal = " + iVal);
    }
    //Metodo llenar
    public static void llenar(int[] aiArre){
        for (int i = 0; i < aiArre.length; i++) {
            //Llena el arreglo con numeros aleatorios
            aiArre[i] = (int)(1+Math.random()*100);
        }
    }
    
    //Metodo imprimir 
    public static void imprimir(int[] aiArre){
        //Imprime el arreglo 
         for (int i = 0; i < aiArre.length; i++) {
            System.out.print("[" + aiArre[i] + "]");
        }
    }
    //Metodo incrementa
    public static void incremeneta(int i){
        i++; //La variable incrementa su valor en 1
    }
    
}
