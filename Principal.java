import java.util.*;

public class Principal{
    
    public static void main(String[] args){
        Scanner leer  = new Scanner(System.in);
        Calcular uno = new Calcular();
        TrabajarProvedor dos = new TrabajarProvedor();
        Biblioteca tres = new Biblioteca();

        int opcion;

        System.out.println("Ingrese la opcion que desea: ");
        System.out.println("1.- Calcular salarios"); 
        System.out.println("2.- Inventario");
        System.out.println("3.- Usar biblioteca");
        System.out.println("4.- Terminar ejecuccion del codigo");
        opcion = leer.nextInt();
        while(opcion != 4){
            switch (opcion) {
                case 1:
                    uno.datosYSalario();
                    uno.DatosPersona();
                    break;
                case 2:
                    dos.pedirDatos();
                    dos.DatosPovedor();
                    break;
                case 3:
                    tres.pedirDatos();
                    tres.DatosPovedor();
                    break;
                default:
                    break;
            }
            System.out.println("Ingrese la opcion que desea: ");
            System.out.println("1.- Calcular salarios"); 
            System.out.println("2.- Inventario");
            System.out.println("3.- Usar biblioteca");
            System.out.println("4.- Terminar ejecuccion del codigo");
            opcion = leer.nextInt();
        }
        System.out.println("Se termino la ejecuccion del programa xd");
    }
}