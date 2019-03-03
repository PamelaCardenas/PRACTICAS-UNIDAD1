/*
 * Llenar arreglo de 1000000 con numeros aleatorios
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
        
        int[] aiDatos = new int[1000000];
        
        //System.out.println(Integer.MAX_VALUE); Numero mayor para un arreglo
        
        for (int i = 0; i < aiDatos.length; i++) {
            for (int j = 0; j < aiDatos.length; j++) {
               
            aiDatos[j] = (int)(Math.random() * 100 + 1);
            }
            
        }
    }
    
}
