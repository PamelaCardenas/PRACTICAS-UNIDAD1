/*
 * Crear arreglo de 50 elementos, llenarlo con valores aleatorios entre 1-100
 * Imprimir el mas pequeño y el mas grande y su posicion
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
        
        int aiArr[] = new int[50]; //Creacion de arreglo
        
        //Llenar el arreglo con nuneros aleatorios de 1-100
        for (int i = 0; i < aiArr.length; i++) {
            aiArr[i] = (int)(Math.random() * 100 + 1);
        }
        
        //Asignar valor inicial a las variables para comparar los elementos
        int posicionMay=0, numMayor = aiArr[0];
        int posicionMen=0, numMenor = aiArr[0];
        
        //Mostrar el arreglo
        for (int i = 0; i < aiArr.length; i++) {
            System.out.print("[" + aiArr[i] + "]");
            
            //Si el numero asignado en la variable numMayor es menor al numero de la posicion actual
            if(numMayor <= aiArr[i]){ 
                numMayor = aiArr[i]; //numMayor sera ese nuevo elemento
                posicionMay = i;
            }
            //Si el numero asignado en la variable numMenor es mayor al numero de la posicion actual
            if(numMenor >= aiArr[i]){
                numMenor = aiArr[i]; //numMenor sera ese nuevo elemento
                posicionMen = i;
            }
        }
        //Mostrar numero mayor y menor
        System.out.println("\nNumero mayor: " + numMayor + " Posicion: " + posicionMay);
        System.out.println("Numero menor: " + numMenor + " Posicion: " + posicionMen);
    }
    
}
