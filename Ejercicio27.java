import javax.swing.*;
public class Ejercicio27 {
    public static void main(String[] args){
        String [] paises = new String[8];

        /*paises [0]= "Argentina";
        paises [1]= "Italia";
        paises [2]= "España";
        paises [3]= "Alemania";
        paises [4]= "India";
        paises [5]= "Brasil";        
        paises [6]= "Suecia";
        paises [7]= "Suiza"; 

        String[] paises = {"Argentina", "Italia", "España", "Alemania", "India", "Brasil", "Suecia", "Suiza"};
        
        */

        for(int i = 0; i < 8; i++){
            paises [i] = JOptionPane.showInputDialog("Introduce el nombre del país N° "+ (i +1) + ": ");
        }

        for(String elemento: paises){
            System.out.println("País: " + elemento);
        }
    }
}
