/*
 * Llenar matriz de 3x3 y mostrar
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
        int[][] aiMatriz = new int[3][3]; //Matriz con 3x3 elementos --> 9 enteros
        // [FILAS] [COLUMNAS]
        /*
        0 [][][]
        1 [][][]
        2 [][][]
        */
        
        for (int i = 0; i < aiMatriz.length; i++) { //FOR --> FILAS
            for (int j = 0; j < aiMatriz[i].length; j++) { //FOR ANIDADO --> COLUMNAS
                aiMatriz[i][j] = (int)(Math.random() * 100 + 1);
                
            }
            
        }
        
        for (int i = 0; i < aiMatriz.length; i++) { //FOR --> FILAS
            for (int j = 0; j < aiMatriz[i].length; j++) { //FOR ANIDADO --> COLUMNAS
                System.out.print("[" + aiMatriz[i][j] + "]");
            }
            
            System.out.println("");
            
        }
    }
    
}
