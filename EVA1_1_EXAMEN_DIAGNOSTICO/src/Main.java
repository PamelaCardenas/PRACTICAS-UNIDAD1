/*
 * Calcular numeros primos
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Nuevo objeto de la clase primo
        Primo pNum = new Primo();
        
        //Asignar valor
        pNum.setNumero(4);
        pNum.esPrimo(); //Llamar metodo
        
        Primo pNum2 = new Primo(4673); //Nuevo objeto de primo con valor diferente
        pNum2.esPrimo(); //Llamar metodo
    }
    
}

//Clase primo
class Primo{ //default
    private int numero; //Atributo

    //Constructor Default
    public Primo() {
    }

    //Constructor con argumentos
    public Primo(int numero) {
        this.numero = numero;
    }
    
    //Metodos get y set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Metodo para calcular si el numero ingresado es primo o no
    public void esPrimo(){
        String sMensa = numero + " Es primo";
        for(int i=2; i < numero; i++){ //Recorre del dos al numero
            if((numero % i) == 0 ){ //NO ES PRIMO
                sMensa = numero + " No es primo";
                break;
            }
                
        }
        System.out.println(sMensa); //despliega mensaje
    }
    
}
