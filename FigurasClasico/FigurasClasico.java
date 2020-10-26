import java.util.*;

class FigurasClasico{


    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);
        int base, altura, opcion, res, apotema, lado;
        char letra;
        double resultado;
    do{
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Calcular el area de un cuadrado ");
        System.out.println("2.- Calcular el area de un triangulo ");
        System.out.println("3.- Calcular el area de un circulo ");
        System.out.println("4.- Calcular el area y perimetro de un rectangulo ");
        System.out.println("5.- Calcular el area y perimetro de un pentagono ");
        System.out.println("6.- Salir ");

        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingresa el valor del lado");
                base = leer.nextInt();

                resultado = base*base;

                System.out.println("El area del cuadrado es de: "+resultado);
                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                base = leer.nextInt();

                System.out.println("Ingresa el valor de la altura");
                altura = leer.nextInt();

                resultado = (base*altura)/2;

                System.out.println("El area del triangulo es de: "+resultado);
                break;

            case 3:
                System.out.println("Ingresa el valor de la radio");
                base = leer.nextInt();

                resultado = 3.1416*base*base;

                System.out.println("El area del circulo es de: "+resultado);
                break;

            case 4:
                System.out.println("Ingresa el valor de la altura");
                altura = leer.nextInt();
                System.out.println("Ingresa el valor de la base");
                base = leer.nextInt();
                res = base * altura;

                System.out.println("El area del rectangulo es de: "+res);
                res = (2 * base) + (2 * altura);

                System.out.println("El perimetro del rectangulo es de: "+res);
                break;
            case 5:
                System.out.println("Ingrese el valor del lado del pentagono");
                lado = leer.nextInt();
                System.out.println("Ingrese el apotema del lado del pentagono");
                apotema = leer.nextInt();
                res = lado * 5;
                System.out.println("El perimetro del pentagono es: "+res);
                resultado = (res * apotema) / 2;
                System.out.println("El area del pentagono es: " + resultado);
            default:
                System.out.println("Gracias por participar unu nwn/ ");





        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        letra = leer.next().charAt(0);


    }while(letra == 's');
    }
}