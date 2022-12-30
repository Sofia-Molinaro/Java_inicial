import javax.swing.*;
public class Ejercicio24{
    public static void main(String[] args){
        int arroba = 0;
        boolean punto = false;
        
        String mail = JOptionPane.showInputDialog("Escribí tu mail, por favor:");

        for(int i=0; i<mail.length(); i++){
            if(mail.charAt(i)=='@'){
                arroba ++;
            }
            if (mail.charAt(i) == '.'){
                punto = true;
                if(mail.charAt(mail.length()- 1) == '.'){
                    punto = false;
                }
            }
            
        }
        if(arroba == 1 && punto == true){
            System.out.println("Es correcto");
        }
        else{
            System.out.println("No es correcto"); 
        }


    }
}