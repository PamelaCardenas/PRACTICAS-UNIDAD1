/*
 * Arreglo de 50 elementos, llenado con valores aleatorios de 1-100, 
 * crear un nuevo arreglo con los numeros pares y otro con los impares
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
        
        int aiArr[] = new int [50]; //Creacion de arreglo
        //Variables para usar como contadores
        int cPar = 0;
        int cImpar = 0;
        
        //Llenar el arreglo con numeros aleatorios
        for (int i = 0; i < aiArr.length; i++) {
            aiArr[i] = (int)(Math.random() * 100 + 1);
        }
        
        //Mostrar el arreglo
        System.out.println("ARREGLO ORIGINAL");
        for (int i = 0; i < aiArr.length; i++) {
            System.out.print("[" + aiArr[i] + "]");
            if(aiArr[i]%2==0){ //Si el elemento entre dos tiene residuo de 0 es par
                cPar++; //Incrementar cantidad de pares
            }else{ //Si no es par
                cImpar++; //Incrementar cantidad de impares
            }
        }
        
        //Creacion de nuevos arreglos para pares e impares
        int aPares [] = new int [cPar];
        int aImpares[] = new int [cImpar];
        
        //Recorrer arreglo 
        for (int j=0,f=0,i = 0; i < aiArr.length; i++) {
            //Si el elemento del arreglo entre dos su residuo es 0
            if(aiArr[i] % 2 == 0){ 
                aPares[f] = aiArr[i]; //Se agrega ese elemento al arreglo de pares
                f++;//Incrementa posicion de pares
            }else{ //Si es impar
                aImpares[j] = aiArr[i]; //Se agrega el elemento al arreglo de los impares
                j++;//Incrementa posicion de impares
            }
            
        }
        
        System.out.println("\nARREGLO DE PARES"); //Mensaje
        //Mostrar arreglo de los pares
        for (int i = 0; i < aPares.length; i++) {
            System.out.print("[" + aPares[i] + "]");
        }
        
        System.out.println("\nARREGLO DE IMPARES"); //Mensaje
        //Mostrar arreglo de los impares
        for (int i = 0; i < aImpares.length; i++) {
            System.out.print("[" + aImpares[i] + "]");
        }
        
    }
    
}
