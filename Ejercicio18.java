import javax.swing.*;
public class Ejercicio18  {
    public static void main(String[] args) {
        String clave = "Coco";

        String pass = "";

        while(clave.equals(pass) == false){
            pass = JOptionPane.showInputDialog("Introduce la contraseña");

            if (clave.equals(pass) == false){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña incorrecta");
    }
}
