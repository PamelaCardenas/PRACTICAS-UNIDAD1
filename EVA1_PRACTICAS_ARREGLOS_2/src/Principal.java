/*
 * Matriz de 100 x 100 llena con ceros y unos en diagonal
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
        
        int[][] mI = new int[10][10]; //Creacion del arreglo
        
        //Llenar matriz
        for (int i = 0; i < mI.length; i++) { //Filas
            for (int j = 0; j < mI[i].length; j++) { //Columnas
                
                if (i==j){ //Cuando i sea igual a j esa casilla se llenara con 1
                    mI[i][j] = 1;
                }
                
                else { //Si no es asi se llena con 0
                  mI[i][j] = 0;  
                }
                
            }
            
        }
        
        //Mostrar matriz
        for (int i = 0; i < mI.length; i++) { //Filas
            for (int j = 0; j < mI.length; j++) { //Columnas
                
                System.out.print("[" + mI[i][j] + "]"); //Muestra los elementos de la matriz
                
            }
            System.out.println(""); //Salto de linea
        }
    }
    
}
