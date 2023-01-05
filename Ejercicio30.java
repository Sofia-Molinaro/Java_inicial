public class Ejercicio30 {
    public static void main(String[] args){
        int [][] matriz = {
            {10,15,18,17,21},
            {5,25,37,41,15},
            {7,19,32,14,90},
            {85,2,7,40,27},
        }; 
        for (int [] fila: matriz){
            System.out.println();
            for(int z: fila){
                System.out.print(z + " ");
            }
            
        }
    }
}