import javax.swing.*;
public class Ejercicio25{
    public static void main(String[] args){
        int resultado = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        for(int i = numero; i >0; i--){
            resultado = resultado * i;
        }
        System.out.println("El factorial del número " + numero + " es " + resultado);
    } 
}