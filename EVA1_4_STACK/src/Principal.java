/*
 * Llamadas de funciones que se aplian de acuerdo a como son llamadas
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
        //Stack --> LIFO
        //LIFO --> LAST IN FIRST OUT
        //FIFO --> FIRST IN FIRST OUT
        System.out.println("Inicia Main");
        A(); //Llamada a funcion A
        System.out.println("Termina Main");
        
    }
    
    public static void A(){
        System.out.println("Inicia A");
        B(); //Llamada a funcion B

        System.out.println("Termina A");
    }
    
    public static void B(){
        System.out.println("Inicia B");
        C();//Llamada a funcion C

        //int iResu = 1/0;
        System.out.println("Termina B");
    }
    
    public static void C(){
        System.out.println("Inicia C");
        System.out.println("Termina C");
    }
    
}
