public class Ejercicio28{
    public static void main (String[] args){
        int [] matriz_aleatoria = new int[150];

        for (int i = 0; i < matriz_aleatoria.length; i++){
            matriz_aleatoria[i] = (int)Math.round(Math.random()*100); //devuelve un decimal entre 0 y 100
        }
        for (int numeros: matriz_aleatoria){
            System.out.print(numeros + ", ");
        }
    }
}