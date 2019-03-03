/*
 * GENERAR UNA MATRIZ DE 5 X 5 ENTEROS,
 * LLENAR CON NÚMERO ALEATORIOS ENTRE 1 Y 100 E IMPRIMIR NORMAL Y EN ORDEN INVERSO
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
        
        int [][] matriz = new int[5][5]; //Creacion de una matriz de 5x5
        
        
        //Llenar la matriz con numeros aleatorios del 1 al 100
        for (int i = 0; i < matriz.length; i++) { //Filas
            for (int j = 0; j < matriz[i].length; j++) { //Columnas
               
                matriz[i][j] = (int)(Math.random() * 100 + 1); //Asignacion de numeros
            }
        }
        
        //Mostrar la matriz
        for (int i = 0; i < matriz.length; i++) { //Filas
            for (int j = 0; j < matriz[i].length; j++) {//Columnas
               
                System.out.print("[" + matriz[i][j] + "]"); //Muestra los elementos de la matriz 
                
            }
            System.out.println(""); //Salto de linea
        }
        
        System.out.println("---------MATRIZ INVERSA-------");
        int[][] copia = matriz; //Copia de la matriz 
        
        //Mostrar copia inversa
        for (int i = copia.length -1; i > -1; i--) { //Filas 
            for (int j = copia.length - 1; j > -1; j--) { //Columnas
                
                System.out.print("[" + copia[i][j] + "]"); //Muestra los elementos de la copia
                
            }
            System.out.println(""); //Salto de linea
        }
    }
    
}
