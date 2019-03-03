/*
 * Arreglos y copias de arreglos
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
        
        int aiArreglo[] = new int[100]; //Nuevo arreglo con 100 elementos
        
        //LLamar metodos llenar y imprimir
        llenar(aiArreglo);
        imprimir(aiArreglo);
        
        System.out.println("");
        //CREAR UNA COPIA
        //int[] aiCopia = aiArreglo; //NO FUNCIONA
        int[] aiCopia = new int [100];
        //Leer elemento por elemento y copiar
        for (int i = 0; i < aiArreglo.length; i++) {
            aiCopia[i] = aiArreglo[i];
        }
        //Mostrar elementos de la copia
        System.out.println("");
        imprimir(aiCopia);
        System.out.println("");
        aiArreglo[1] = 100;
        imprimir(aiCopia);
        
    }
    //Metodo llenar
    public static void llenar(int[] aiArre){
        //Llena valores del arreglo con numeros aleatorios
        for (int i = 0; i < aiArre.length; i++) {
            aiArre[i] = (int)(1+Math.random()*100);
        }
    }
    //Metodo imprimir
    public static void imprimir(int[] aiArre){
        //Imprime valores del arreglo
         for (int i = 0; i < aiArre.length; i++) {
            System.out.print("[" + aiArre[i] + "]");
        }
    }
}
