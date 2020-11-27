import java.util.*;

public class Biblioteca{
    
    Libro Ejemplar = new Libro();
    Libro arre[] = new Libro[5];

    public void  pedirDatos(){
        Scanner leer = new Scanner(System.in);
        String t, a;
        int n = 0;
        for(int i = 0; i < 5; ++i){
            System.out.println("Ingrese el titulo del libro: ");
            t = leer.next();
            System.out.println("Ingrese el autor del libro: ");
            a = leer.next();
            System.out.println("Ingrese la cantidad de libros: ");
            n = leer.nextInt();
            arre[i] = new Libro(t, a, n);
        }
    }
    

    public void DatosPovedor(){
        Scanner leer = new Scanner(System.in);
        int caso;
        System.out.println("Ingrese la opcion que desea: ");
        System.out.println("1.- Hacer un prestamo "); 
        System.out.println("2.- Hacer una devolucion ");
        System.out.println("3.- Salir ");
        caso = leer.nextInt();
        while(caso != 3){
            String aux;
            int i = 0 ;
            switch (caso) {
                case 1:
                    i = 0 ;
                    System.out.println("Ingrese el libro que quiere solicitar: ");
                    aux = leer.next();
                    while(arre[i].getTitulo() != aux && i < 4){
                        i++;
                    }
                    if(i == 5){
                        System.out.println("Ese libro no se encuetra en la libreria: ");
                    }else{
                        if(arre[i].getCantidad() - arre[i].getPrestados() > 0){
                            arre[i].setPrestados(arre[i].getPrestados() + 1);
                            System.out.println("Se realizo el prestamo");
                        }else{
                            System.out.println("No hay libros disponibles del titulo solicitado");
                        }
                    }
                    break;
                
                case 2:
                    i = 0;
                    System.out.println("Ingrese el libro que quiere devolver: ");
                    aux = leer.next();
                    while(arre[i].getTitulo() != aux && i < 4){
                        i++;
                    }
                    if(i == 5){
                        System.out.println("Ese libro no se encuetra en la libreria: ");
                    }else{
                        if(arre[i].getCantidad() > arre[i].getPrestados()){
                            System.out.println("Se ha devuelto el libro: ");
                            arre[i].setPrestados(arre[i].getPrestados() - 1);
                        }else{
                            System.out.println("No se puede devolver el libro ya que el invetario esta lleno: ");
                        }
                    }
                    break;

                default:
                    break;
            }
            System.out.println("Ingrese la opcion que desea: ");
            System.out.println("1.- Hacer un prestamo "); 
            System.out.println("2.- Hacer una devolucion ");
            System.out.println("3.- Salir ");
            caso = leer.nextInt();
        }
        System.out.println("El uso de la libreria a terminado");
    }
}