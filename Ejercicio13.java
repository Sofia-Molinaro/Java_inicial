import javax.swing.*; 
public class Ejercicio13 {
    public static void main(String[] args){
    String nombre_usuario = JOptionPane.showInputDialog("Introduzca su nombre, por favor");
    
    String edad=JOptionPane.showInputDialog("Introduzca su edad, por favor");   

    int edad_usuario=Integer.parseInt(edad);

    System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad_usuario+1) + " años.");
    }
}
