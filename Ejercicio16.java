import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad, por favor: ");
        int edad = entrada.nextInt();
        if(edad<12){
            System.out.print("Eres un infante");
        }
        else if(edad<18){
            System.out.println("Eres un adolescente.");
        }
        else if(edad<40){
            System.out.println("Eres joven.");
        }
        else if(edad<65){
            System.out.println("Eres adulto.");
        }
        else{
            System.out.println("Eres anciano.");
        }
    }
}
