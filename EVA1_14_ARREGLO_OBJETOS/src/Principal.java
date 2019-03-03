
import java.util.Scanner;

/*
 * Llenar arreglo con datos de personas
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
        Persona[] apDatos = new Persona[5];
        //int[] aiDatos = new int[5];
        
        Scanner sCaptu = new Scanner(System.in);
        //Llenar arreglo con los datos de las personas
        for (int i = 0; i < apDatos.length; i++) {
            //Solicitar datos
            apDatos[i] = new Persona();
            System.out.println("Nombre: ");
            apDatos[i].setNombre(sCaptu.nextLine());
            System.out.println("Apellido: ");
            apDatos[i].setApellido(sCaptu.nextLine());
            System.out.println("Edad: ");
            apDatos[i].setEdad(sCaptu.nextInt());
            sCaptu.nextLine();
            System.out.println("Nacionalidad: ");
            apDatos[i].setNacionalidad(sCaptu.nextLine());
            
        }
        //Mostrar los datos
        for (Persona apDato : apDatos) {
            System.out.println("Datos de la persona: ");
            System.out.println("Nombre completo " + apDato.getNombre() + " " + apDato.getApellido());
            System.out.println("Edad: " + apDato.getEdad());
            System.out.println("Nacionalidad: " + apDato.getNacionalidad());
            System.out.println("-------------------------------------------");
        }
    }
    
}

class Persona{
    //atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;

    //Constructor default
    public Persona() {
        nombre = "Ruben";
        apellido = "Hernandez";
        edad = 37;
        nacionalidad = "Mexicana";
        
    }

    //Constructor con argumentos
    public Persona(String nombre, String apellido, int edad, String nacionalidad) { //DEFAULT CON SUS DATOS
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
    
}
        
