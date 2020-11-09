import java.util.*;
import java.util.Arrays; 
class Arreglos{
    public static void main(String[] args){
        Scanner leer  = new Scanner(System.in);
        Arreglos trial = new Arreglos();
        int opcion = 0;
        System.out.println("Seleccione la opcion que quiere ejecutar: ");
        trial.opciones();
        opcion = leer.nextInt();
        while(opcion < 0 || opcion > 5){
            System.out.println("La opcion que eligio es incorrecta, ingrese otra ");
            trial.opciones();
            opcion = leer.nextInt();
        }
        while(opcion != 5){
            switch (opcion) {
                case 1:
                    trial.promedio1();
                    break;
                case 2:
                    trial.promedioPares();
                    break;
                case 3:
                    trial.Asignatura();
                    break;
                case 4:
                    trial.matrices();
                    break;
            }
            System.out.println("Seleccione la opcion que quiere repetir: ");
            trial.opciones();
            opcion = leer.nextInt();
            while(opcion < 0 || opcion > 5){
                System.out.println("La opcion que eligio es incorrecta, ingrese otra ");
                trial.opciones();
                opcion = leer.nextInt();
            }
        }
        System.out.println("Adios UwU");
    }
    public void promedio1(){
        Scanner leer  = new Scanner(System.in);
        double arre[] = new double[12];
        System.out.println("Ingrese los 10 numeros para obtener los promedios");
        for(int i = 1; i <= 10; ++i){
            arre[i] = leer.nextDouble();
        }
        double negativos = 0, postivos = 0, contadorN = 0, contadorP = 0, promedio;
        for(int i = 1; i <= 10; ++i){
            if(arre[i] < 0){
                negativos+= arre[i];
                contadorN++;
            }
        }
        for(int i = 1; i <= 10; ++i){
            if(arre[i] > 0){
                postivos+= arre[i];
                contadorP++;
            }
        }
        promedio = postivos / contadorP;
        System.out.println("Este es el promedio de los numeros positivos: " + promedio);
        promedio = negativos / contadorN;
        System.out.println("Este es el promedio de los numeros negativos: " + promedio);
    }
    public void promedioPares(){
        Scanner leer  = new Scanner(System.in);
        double arre[] = new double[12];
        System.out.println("Ingrese los 10 numeros para obtener los promedios de las casilas pares: ");
        for(int i = 1; i <= 10; ++i){
            arre[i] = leer.nextDouble();
        }
        int suma = 0, promedio = 0;
        for(int i = 1; i <= 10; i+= 2){
            suma+= arre[i];
        }
        promedio = suma / 5;
        System.out.println("Este es el promedio de los numeros en posicion par: " + promedio);
    }
    public void Asignatura(){
        Scanner leer  = new Scanner(System.in);
        double arre[] = new double[10];
        System.out.println("Ingrese las 10 calificaciones de los alumnos: ");
        for(int i = 0; i < 10; ++i){
            arre[i] = leer.nextDouble();
        }
        Arrays.sort(arre);
        System.out.println("Estas son 10 calificaciones de los alumnos: ");
        double promedio, suma = 0;
        for(int i = 0; i < 10; ++i){
            System.out.println(arre[i] + " ");
            suma+= arre[i];
        }
        promedio = suma / 10;
        System.out.println("Este es el promedio de las calificaciones: " + promedio);
        System.out.println("Esta es la calificacion mas alta: " + arre[9]);
        System.out.println("Esta es la calificacion mas baja: " + arre[0]);
        int aprobados = 0, reprobados = 0, superiores = 0;
        for(int i = 0; i < 10; ++i){
            if(arre[i] > promedio){
                superiores++;
            }
            if(arre[i] > 5.9){
                aprobados++;
            }else{
                reprobados++;
            }
        }
        System.out.println("Esta es la cantidad de calificaciones mayores al promedio: " + superiores);
        System.out.println("Esta es la cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Esta es la cantidad de alumnos reprobados: " + reprobados);
    }
    public void matrices(){
        Scanner leer  = new Scanner(System.in);
        double matriz[][] = new double[5][5];
        System.out.println("Ingrese los valores de la matriz A que es de 3x3: ");
        for(int i = 1; i <= 3; ++i){
            for(int j = 1; j <= 3; ++j){
                matriz[i][j] = leer.nextDouble();
            }
        }
        System.out.println("Ingrese los valores de la matriz B que es de 3x3: ");
        for(int i = 1; i <= 3; ++i){
            for(int j = 1; j <= 3; ++j){
                matriz[i][j]+= leer.nextDouble();
            }
        }
        System.out.println("Asi queda la suma dee las dos matrices: ");
        for(int i = 1; i <= 3; ++i){
            for(int j = 1; j <= 3; ++j){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void opciones(){
        System.out.println("1.- Obtener el promedio de los valores negativos y positivos de una lista de 10 numeros");
        System.out.println("2.- Calcular el promedio de los numeros en posiciones pares de una lista de 10 numeros");
        System.out.println("3.- Dar informacion sobre 10 calificaciones de una materia");
        System.out.println("4.- Sumar dos matrices de 3x3");
        System.out.println("5.- No realizar otra tarea");
    }
}