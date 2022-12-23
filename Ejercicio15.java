import java.util.*;  //porque uso la clase Scanner.
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce tu edad, por favor: ");
        int edad=entrada.nextInt();
        if(edad>=18){
            System.out.println("Sos mayor de edad.");
        }
        else{
            System.out.println("Sos menor de edad.");
        }
    }
}