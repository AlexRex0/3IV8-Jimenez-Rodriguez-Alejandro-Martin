import java.util.*;

class Metodos{
    private static int hacer;
    private static long fecha, edad;
    private static double radio, ladoR, lado2R, ladoC, Base, altura, lado1, lado2, lado3;
    private static double perimetro, area;
    private static long numero, opcion;
    private static double credito;
    public static void main(String[] args){
        Scanner leer  = new Scanner(System.in);
        int XD;
        System.out.println("ingrese la opcion que desea: ");
        System.out.println("1 Calcular edad ");
        System.out.println("2 Calcular figuras ");
        System.out.println("3 Calcular telefono(con pillofon con mas megas por el buen fin) ");
        System.out.println("4 salir del menu");
        XD = leer.nextInt();
        while(XD != 4){
            switch (XD) {
                case 1:
                    Edad();
                    break;
                case 2:
                    Figuras();
                break;
                case 3:
                    telefono();
                break;
                default:
                    break;
            }
            System.out.println("ingrese la opcion que desea: ");
            System.out.println("1 Calcular edad ");
            System.out.println("2 Calcular figuras ");
            System.out.println("3 Calcular telefono(con pillofon con mas megas por el buen fin) ");
            System.out.println("4 salir del menu");
            XD = leer.nextInt();
        }
    }
    public static void pedirDatos1(){
        Scanner leer  = new Scanner(System.in);
        System.out.println("ingrese el año en que nacio:");
        fecha = leer.nextInt();
    }
    public static void calcular(){
        edad = 2020 - fecha;
        System.out.println("Esta es su edad:" + edad);
    }
    public static void Edad(){
        pedirDatos1();
        calcular();
    }

    public static void pedirDatos(){
        Scanner leer  = new Scanner(System.in);
        System.out.println("ingrese el radio del circulo:");
        radio = leer.nextInt();
        System.out.println("ingrese el primer lado del rectangulo:");
        ladoR = leer.nextInt();
        System.out.println("ingrese el primer lado del rectangulo:");
        lado2R = leer.nextInt();
        System.out.println("ingrese el lado del cuadrado:");
        ladoC = leer.nextInt();
        System.out.println("ingrese la altura del triangulo, su base, y sus tres lados:");
        altura = leer.nextInt();
        Base = leer.nextInt();
        lado1 = leer.nextInt();
        lado3 = leer.nextInt();
        lado2 = leer.nextInt();
    }
    public static void circulo(){
        area = 3.1416 * (radio * radio);
        perimetro = 3.1416 * (radio + radio);
        System.out.println("Este es el perimetro del circulo:" + perimetro);
        System.out.println("Este es el area del circulo:" + area);
    }
    public static void rectangulo(){
        perimetro = (ladoR * 2) + (lado2R * 2);
        area = ladoR * lado2R;
        System.out.println("Este es el perimetro del rectangulo:" + perimetro);
        System.out.println("Este es el area del rectangulo:" + area);
    }
    public static void cuadrado(){
        perimetro = ladoC * 4;
        area = ladoC * ladoC;
        System.out.println("Este es el perimetro del cuadrado:" + perimetro);
        System.out.println("Este es el area del cuadrado:" + area);
    }
    public static void triangulo(){
        perimetro = lado1 + lado2 + lado3;
        area = (Base * altura) / 2;
        System.out.println("Este es el perimetro del triangulo:" + perimetro);
        System.out.println("Este es el area del triangulo:" + area);
    }
    public static void Figuras(){
        pedirDatos();
        circulo();
        rectangulo();
        cuadrado();
        triangulo();
    }

    public static void pedirDatos2(){
        Scanner leer  = new Scanner(System.in);
        System.out.println("ingrese su numero de telefono sin dejar espacios:");
        numero = leer.nextLong();
        System.out.println("ingrese el credito con el que cuenta en su telefono:");
        credito = leer.nextInt();
    }
    public static void descontar(){
        Scanner leer  = new Scanner(System.in);
        System.out.println("ingrese la opcion que desea: ");
        System.out.println("1 hacer una llamada nacional ");
        System.out.println("2 hacer una llamada internacional ");
        System.out.println("3 hacer una llamada a celular ");
        opcion = leer.nextInt();
        if(opcion == 1){
            credito-=.5;
        }else{
            if(opcion == 2){
                credito-=.6;
            }else{
                credito-=.2;
            }
        }
    }
    public static void solicitar(){
        System.out.print("Su numero de telefono: " + numero);
        System.out.println(" cuenta con el credito de $: " + credito);
    }
    public static void telefono(){
        Scanner leer  = new Scanner(System.in);
        pedirDatos2();
        System.out.println("ingrese la opcion que desea: ");
        System.out.println("1 hacer una llamada ");
        System.out.println("2 solicitar saldo ");
        System.out.println("3 Salir del menu ");
        hacer = leer.nextInt();
        while(hacer != 3 && credito > .2){
            switch (hacer) {
                case 1:
                    descontar();
                    break;
                case 2:
                    solicitar();
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            System.out.println("ingrese la opcion que desea: ");
            System.out.println("1 hacer una llamada ");
            System.out.println("2 solicitar saldo ");
            System.out.println("3 Salir del menu ");
            hacer = leer.nextInt();
        }
        System.out.println("Gracias por utlizar pillofon");
        if(credito < .2){
            System.out.println("Su credito se ha agotado    ");
        }
    }
}