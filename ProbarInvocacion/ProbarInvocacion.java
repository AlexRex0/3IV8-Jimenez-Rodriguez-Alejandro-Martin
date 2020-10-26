import java.util.*;

class Probarinvocacion{

    public static void main (String[]args) {
        Scanner leer  = new Scanner(System.in);
        String nombre;
        int edad;
        float altura;
        System.out.println("Escribe tu nombre");
        nombre = leer.nextLine();
        System.out.println("Escribe tu edad");
        edad = leer.nextInt();
        System.out.println("Escribe tu estatura");
        altura = leer.nextFloat();

        System.out.println("Este es tu nombre: " + nombre);
        System.out.println("Esta es tu edad: " + edad);
        System.out.println("Esta es tu estatura: " +altura);
    }
}