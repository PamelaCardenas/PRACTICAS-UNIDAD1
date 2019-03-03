/*
 * Matriz de dos dimensiones con diferentes cantidades de elementos en cada fila
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
        //Creacion de matriz
        int[][] aiMatriz = new int[3][];
        //Asignacion de valores
        aiMatriz[0] = new int[15];
        aiMatriz[1] = new int[3];
        aiMatriz[2] = new int[100];
        
        //Direcciones de memoria
        System.out.println(aiMatriz);
        System.out.println(aiMatriz[0]);
        System.out.println(aiMatriz[1]);
        System.out.println(aiMatriz[2]);
        
        System.out.println(aiMatriz[0][0]);
        
        //Llenar matriz
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                aiMatriz[i][j] = (int)(Math.random() * 100 + 1);
                
            }
            
        }
        //Mostrar matriz
        for (int[] aiMatriz1 : aiMatriz) {
            for (int b : aiMatriz1) {
                System.out.print("[" + b + "]");
            }
            System.out.println("");
        }
    }
    
}
