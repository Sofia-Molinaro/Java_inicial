import java.util.*;
public class Ejercicio12 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Escriba su nombre, por favor: ");
            
            String nombre_usuario = entrada.nextLine();
            
            System.out.println("Introduzca su edad, por favor");
            
            int edad=entrada.nextInt();
            
            System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1)+ " años.");
        }    
    }
}
