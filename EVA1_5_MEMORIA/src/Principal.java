/*
 * Creacion de objetos, mostrar direcciones, asignar valores null y crear copia para no perder los valores
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
        Principal pObj = new Principal(); //Objeto de principal
        Principal pObj2 = new Principal(); //Segundo objeto de principal
        
        //Direccion del objeto
        System.out.println(pObj);
        System.out.println(pObj2);
        
        //Copia del objeto
        Principal pCopia = pObj;
        //Muestra la direccion de memoria de la copia del objeto
        System.out.println(pCopia);
        
        //Asignan valores de null a los objetos
        pObj = null;
        pObj2 = null;
        
        //Muestra direcciones de los objetos y en los que se asigno null muestra null
        System.out.println(pObj);
        System.out.println(pObj2);
        System.out.println(pCopia);
        //GARBAGE COLLECTOR --> SE ENCARGA DE LIBERAR LA MEMORIA
    }
    
}
