
import java.util.Scanner;

/*
 * PREGUNTAR CUANTOS GRUPOS TIENE DE CADA GRUPO, PREGUNTAR LA CANTIDAD DE ALUMNOS PARA 
 * CADA ALUMNO (Clase Alumno)
 * NOMBRE
 * EDAD
 * 
 * HAY QUE USAR MATRICES <--- 
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
        
        Scanner sCaptu = new Scanner(System.in);
        int gr=0, al=0;
        //Solicitar grupos
        System.out.println("¿Cuantos grupos tiene?");
        gr = sCaptu.nextInt();
        
        //Crear Matriz
        Alumno[][] aAlum = new Alumno[gr][];
        
        //Solicitar alumnos de cada grupo
        for (int i = 0; i < aAlum.length; i++) {
            System.out.println("¿Cuantos Alumnos son en el grupo?");
            al = sCaptu.nextInt();
            aAlum[i] = new Alumno[al];
            sCaptu.nextLine();
        }
        
        //Llenar con los datos de los alumnos
        for (int i = 0; i < aAlum.length; i++) { 
            for (int j = 0; j < aAlum[i].length; j++) {
                aAlum[i][j] = new Alumno();
                System.out.println("Nombre: ");
                aAlum[i][j].setNombre(sCaptu.nextLine());
                System.out.println("Edad: ");
                aAlum[i][j].setEdad(sCaptu.nextInt());
                sCaptu.nextLine();
            } 
        }
        
        //Mostrar los datos de los alumnos
        for (Alumno[] alumnos : aAlum) {
            System.out.println("Datos de la persona");
            for (Alumno alumno : alumnos) {
                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Edad: " + alumno.getEdad());
                System.out.println("-------------------");
            }
        }
    }
    
}

class Alumno{
    //Atributos
    private String nombre;
    private int edad;

    //Constructor default
    public Alumno() {
        
    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}