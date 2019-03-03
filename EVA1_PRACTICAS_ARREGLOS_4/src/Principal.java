/*
 * Crear dos matrices de 5x5 con numeros aleatorios de 1 -10 y crear  nueva matriz con la multiplicacion de esas dos matrices
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
        //Crear matrices
        double [][] m1 = new double [5][5];
        double [][] m2 = new double [5][5];
        double [][] mR = new double [5][5];
        
        //Llamar al metodo llenar para llenarlas con numeros aleatorios
        llenar(m1);
        llenar(m2);
        
        //Llamar el metodo mostrar para mostrar las matrices 
        System.out.println("\n --------Matriz1-------");
        mostrar(m1);
        System.out.println("\n-------Matriz2-------");
        mostrar(m2);
        
        System.out.println("\n--------Multiplicacion de matrices---------");
        //Llamar al metodo multiMatriz para realizar la multiplicacion de las matrices
        multiMatriz(mR, m1, m2); 
    }
    
    //Metodo para llenar las matrices
    public static void llenar(double [][] matriz){
        for (int i = 0; i < matriz.length; i++) { //Filas
            for (int j = 0; j < matriz.length; j++) { //Columnas
                matriz[i][j] = (Math.random() * 10 + 1); //Llenar con numeros aleatorios del 1-10
            }
        }
    }
    
    //Metodo para mostrar los elementos de las matrices
    public static void mostrar(double [][] matriz){
        for (int i = 0; i < matriz.length; i++) { //Filas
            for (int j = 0; j < matriz.length; j++) { //Columnas
                System.out.print("[" + matriz[i][j] + "]"); //Mostrar el elemento
            }
            System.out.println(""); //Salto de linea
        }
    }
    
    //Metodo para ejecutar la multiplicacion de las matrices
    public static void multiMatriz (double [][] matRes, double [][] matriz1, double [][] matriz2){
        
        for (int i = 0; i < matRes.length; i++) { //Recorrer filas
            for (int j = 0; j < matRes.length; j++) {//Recorrer columnas
                //Llenar posicion con el valor de la multiplicacion entre las matrices
                matRes[i][j] = (matriz1[i][j])*(matriz2[i][j]); 
            }
        }
        //Llamar metodo mostrar para mostrar los elementos de la matriz con las multplicaciones
        mostrar(matRes);  
    }
    
}
