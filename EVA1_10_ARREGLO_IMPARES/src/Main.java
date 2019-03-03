/*
 * Arreglo con 100 numeros aleatorios, mostrar el arreglo con los numeros impares
 */

/**
 *
 * @author Karla Pamela Cardenas Leyva 18550338
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiArreglo = new int[100]; //Se crea arreglo con 100 numeros
        
        int countCopia = 0;
        for (int i = 0; i < aiArreglo.length; i++) { //Se llena el arreglo con numeros aleatorios del 1-100
            aiArreglo[i] = (int)(1 + Math.random() * 100);
            
            if(aiArreglo[i]%2 !=0){ //Si el elemento es impar
            countCopia++; //Incrementa variable countCopia
            }
        }
        
       int[] aiCopia = new int [countCopia]; //Nuevo arreglo
       int j = 0;
        //Leer elemento por elemento y copiar
        for (int i = 0; i < aiArreglo.length; i++) {
            if (aiArreglo[i] % 2 != 0){ //Si el elemento es impar
                aiCopia[j] = aiArreglo[i]; //Ese elemento se copia al nuevo arreglo
                j++; //Incrementa posisicion del nuevo arreglo 
            }
            
        }
        
        //Mostrar arreglo original
        System.out.println("--------------Original-------------");
        for (int i = 0; i < aiArreglo.length; i++) {
            
            System.out.print("[" + aiArreglo[i] + "]");
        }
        
        System.out.println("");
        //Mostrar arreglo de numeros impares
        System.out.println("-------------Copia------------");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.print("{" + aiCopia[i] + "]");
            
        }
        
    }
    
}
