/*
 * Funciones recursivas, llamarse a si misma, ocasiona que se acabe la memoria
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Inicia Main");
        //Llama funcion recursiva
        recursiva();
        System.out.println("Fin Main");
    }
    
    public static void recursiva(){
        recursiva(); //Se llama a si misma
    }
    
}
