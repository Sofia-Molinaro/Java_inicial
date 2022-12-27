//Informa sobre el peso "ideal" de una persona dependiendo de su estatura y sexo biológico. 
import javax.swing.*;
public class Ejercicio22 {
	public static void main(String[] args) {
		String sexo = "";
		
	do {
		sexo = JOptionPane.showInputDialog("Ingrese su sexo es femenino o masculino, por favor: ");
		
	}while(sexo.equalsIgnoreCase("femenino") == false && sexo.equalsIgnoreCase("masculino") == false);
	
	int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura en cm, por favor: "));
  
	int peso_ideal = 0; 
	if(sexo.equalsIgnoreCase("femenino")) {
		peso_ideal= altura - 120;
	}
	else if(sexo.equalsIgnoreCase("masculino")) {
		peso_ideal= altura - 110;
	}
	
	System.out.println("Tu peso ideal es " + peso_ideal + "kg.");
	}
}
