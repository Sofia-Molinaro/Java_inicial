import java.util.*;
import javax.swing.*;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
        int figura = entrada.nextInt();
        switch (figura){
            case 1:
         //int lado = JOptionPane.showInputDialog("Introduce el lado");  ----> ERROR: es un str no admite int, excepto que le agregue un parseInt(lo que hace es convertir un entero a un string)
            int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado: "));
            System.out.println("El área del cuadrado es: " + Math.pow(lado, 2)); //se usa el método pow --->parametros:(base, exponente).
            break;
            
            case 2:
            int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del rectángulo: "));
            int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del rectángulo: "));
            System.out.println("El área del rectángulo es: " + (base*altura));
            break;

            case 3:
            int base2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triángulo: "));
            int altura2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triángulo: "));
            System.out.println("El área del triángulo es: " + ((base2*altura2)/2));
            break;

            case 4: 
            int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del círculo: "));
            System.out.println("El área del círculo es: " + (Math.PI * (Math.pow(radio,2))));
            break;

        default:
            System.out.println("La opción no es correcta.");
        }
    }
}
