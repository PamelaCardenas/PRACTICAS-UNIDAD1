/*
 * Matrices de 5 dimensiones
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
        
        //Creacion de arreglo de 5 dimensiones
        int[][][][][] aiArreX = new int[5][5][5][5][5];
        
        
        //Llenar arreglo
        for (int i = 0; i < aiArreX.length; i++) {
            for (int j = 0; j < aiArreX[i].length; j++) {
                for (int k = 0; k < aiArreX[i][j].length; k++) {
                    for (int l = 0; l < aiArreX[i][j][k].length; l++) {
                        for (int m = 0; m < aiArreX[i][j][k][l].length; m++) {
                            aiArreX[i][j][k][l][m] = (int)(Math.random() * 100 + 1);
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
        //Mostrar arreglo
        for (int i = 0; i < aiArreX.length; i++) {
            for (int j = 0; j < aiArreX[i].length; j++) {
                for (int k = 0; k < aiArreX[i][j].length; k++) {
                    for (int l = 0; l < aiArreX[i][j][k].length; l++) {
                        for (int m = 0; m < aiArreX[i][j][k][l].length; m++) {
                            System.out.print("[" + aiArreX[i][j][k][l][m] + "]");
                            
                        }
                        
                    }
                    
                } 
                
            }
            
           System.out.println("");
        }
    }
    
}
