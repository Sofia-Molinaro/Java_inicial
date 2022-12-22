public class Ejercicio9 {
    public static void main(String[] args){
        String nombre = "Pablo";

        System.out.println("El nombre es: " + nombre);

        System.out.println("El nombre tiene: " + nombre.length() + " letras.");

        System.out.println("La primera letra de "+  nombre+ " es la: " + nombre.charAt(0));

        int ultima_letra;
        
        ultima_letra = nombre.length();

        System.out.println("La ultima letra de " + nombre + " es: " + nombre.charAt(ultima_letra-1));
    }
    
}
