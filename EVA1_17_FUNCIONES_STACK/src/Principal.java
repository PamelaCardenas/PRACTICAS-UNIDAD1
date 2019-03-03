/*
 * 
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
        
        System.out.println("Inicia Main");
        
        //Concatenar mensaje hola con el mensaje que se encuentra en la funcion cadena
        String sCade = "Hola " + cadena();
        
        System.out.println(sCade);
        System.out.println("Termina Main");
        
    }
    
    public static String cadena(){
        System.out.println("Inicia Cadena");
        System.out.println("Termina cadena");
        return "Mundo";
    }
    
}
