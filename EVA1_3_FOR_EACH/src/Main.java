/*
 * 
 *
 * 
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
        //Crea un arreglo
        int aiDatos[]; //Referencia --> 1 byte
        aiDatos = new int[100]; //int --> 4 bytes  
        for (int i = 0; i < aiDatos.length; i++) { //Se recorre el arreglo
            aiDatos[i] = (int)((Math.random()*100)+1); //Asignan valores aleatorios
        }
        //Muestra los elementos del arreglo
        for (int aiDato : aiDatos) {
            System.out.print("[" + aiDato + "]");
        }
        //Muestra los elementos del arreglo
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" + aiDatos[i] + "]");            
        }
    }
    
}
