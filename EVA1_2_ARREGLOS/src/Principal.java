/*
 * Muestra direcciones de los arreglos creados
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
        int[] aiDatos = new int[100]; //Declaracion de arreglos
        //EL PRIMER ELEMENTO EMPIEZA EN CERO
        int[] a,b,c; //Los tres son arreglos
        int d[], e; //Solo d es arreglo
        //JAVA , LOS ARREGLOS SON OBJETOS
        //VARIABLE ES UNA REFERENCIA (DIRECCIÓN EN MEMORIA)
        //MAQUINA VIRTUAL
        
        System.out.println(aiDatos); //Despliega direccion de memoria
        
        String asCadena[] = new String[100]; //Declaracion de arreglo String
        System.out.println(asCadena);//Direccion de arreglo
    }
    
}
