//Adivina un número generado aleatoriamente por la computadora. 
import java.util.*;
public class Ejercicio21 {
  public static void main(String[] args){
      int aleatorio = (int)(Math.random()*100);
      Scanner entrada = new Scanner(System.in);
      int numero = 0;
      int intentos = 0;

      do{
          
          intentos ++;
         
          System.out.println("Introduce un número, por favor: ");

          numero = entrada.nextInt();

          if(aleatorio < numero){
              System.out.print("Es número es menor.");
          }

          else if(aleatorio > numero){
              System.out.print("El número es mayor.");
          }
      }while(numero!=aleatorio);

      System.out.print("¡Correcto! Lo haz conseguido en " + intentos + " intentos.");
  }
}
