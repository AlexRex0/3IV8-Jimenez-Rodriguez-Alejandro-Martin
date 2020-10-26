import java.util.*;
import java.lang.Math.*;

class EsDeDatos{
    public static void main (String[] args){
        Scanner leer  = new Scanner(System.in);
        int edad, casa, saber, n, pos, tipo, tipoC, cont2, cont1, ladoC;
        double res, base, altura, aux2, lado1, lado2, lado, radio, radio2, abono, grados, aux;
        char caso;
        int arre[] = new int[102];
        System.out.println("Ingrese la opcion que desee: ");
        System.out.println("1. Problema 1 ");
        System.out.println("2. Problema 2 ");
        System.out.println("3. Problema 3 ");
        System.out.println("4. Problema 4 ");
        System.out.println("5. Problema 5 ");
        System.out.println("6. Problema 6 ");
        System.out.println("7. Problema 7 ");
        System.out.println("8. Problema 8 ");
        System.out.println("9. Problema 9 ");
        System.out.println("10. Terminar la ejecuccion");
        casa = leer.nextInt();
        while(casa != 10){
            pos = 0;
            res = 0;
            cont1 = 0;
            cont2 = 0;
            switch (casa) {
                case 1:
                    System.out.println("Ingresa el monto del abono: ");
                    abono = leer.nextFloat();
                    System.out.println("Ingresa tu Edad: ");
                    edad = leer.nextInt();
                    if(edad > 65){
                        abono = abono * .60;
                    }else{
                        if(edad < 21){
                            System.out.println("Tus padres son socios?");
                            System.out.println("Si son socios introduce 1");
                            System.out.println("Si no son socios introduce 2");
                            saber = leer.nextInt();
                            if(saber == 1){
                                abono = abono *.65;
                            }else{
                                abono = abono *.75;
                            }
                        }
                    }
                    System.out.println("El precio final del abono seria: " + abono);
                    break;

                case 2:
                    System.out.println("Escribe el numero que deseas convertir a sistema binario: ");
                    n = leer.nextInt();
                    System.out.print("Este es el numero en sistema binario: ");
                    while(n > 0){
                        pos++;
                        arre[pos] = n % 2;
                        n/= 2;
                    }
                    for(int i = pos; i >= 1; i--){
                        System.out.print(arre[i]);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el tipo unidad que ingresa");
                    System.out.println("1 para grados FAHRENHEIT");
                    System.out.println("2 para grados CELSIUS");
                    System.out.println("3 para grados KELVIN");
                    System.out.println("4 para grados RANKINE");
                    tipo = leer.nextInt();
                    System.out.println("Ingrese la cantidad: ");
                    grados = leer.nextInt();
                    if(tipo == 1){
                        grados = (grados - 32) / 1.8;
                    }else{
                        if(tipo == 3){
                            grados = grados - 273.15;
                        }else{
                            if(tipo == 4){
                                grados = (grados - 491.67) / 1.8;
                            }
                        }
                    }
                    System.out.println("Ingrese el tipo de unidad al que desea convertir: ");
                    System.out.println("1 para grados FAHRENHEIT");
                    System.out.println("2 para grados CELSIUS");
                    System.out.println("3 para grados KELVIN");
                    System.out.println("4 para grados RANKINE");
                    tipoC = leer.nextInt();
                    if(tipoC == 1){
                        grados = (grados * 1.8) + 32;
                    }else{
                        if(tipoC == 3){
                            grados+= 273.15;
                        }else{
                            if(tipoC == 4){
                                grados = (grados * 1.8) + 491.67; 
                            }
                        }
                    }
                    System.out.println("Este es el resultado de la conversion: " + grados);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de numeros: ");
                    n = leer.nextInt();
                    for(int i = 1; i <= n; ++i){
                        System.out.print("Ingrese el siguiente numero: ");
                        aux  = leer.nextInt();
                        System.out.println();
                        if(aux < 0){
                            cont1++;
                        }else{
                            cont2++;
                        }
                    }
                    System.out.println("Esta es la cantidad de numeros negativos: " + cont1);
                    System.out.println("Esta es la cantidad de numeros positivos: " + cont2);
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de cosas a comprar: ");
                    n = leer.nextInt();    
                    for(int i = 1; i <= n; ++i){
                        System.out.println("Ingrese el valor: ");
                        aux = leer.nextDouble();
                        res+= aux;
                    }
                    System.out.println("Este es el costo total de la compra: " + res);
                    break;
                case 6:
                    System.out.println("Ingrese el tipo de operacion que desea hacer");
                    System.out.println( "A. EL AREA Y PERIMETRO DE UN RECTANGULO");
                    System.out.println( "B. EL PERIMETRO Y AREA DE UN TRIANGULO");
                    System.out.println( "C. EL VOLUMEN DE UNA ESFERA Y VOLUMEN DE UN CILINDRO");
                    caso = leer.next().charAt(0);
                    if(caso == 'A' || caso == 'B'){
                        System.out.println("Ingrese la base: ");
                        base = leer.nextDouble();
                        System.out.println("Ingrese la altura: ");
                        altura = leer.nextDouble();
                        if(caso == 'A'){
                            aux2 = base * altura;
                            System.out.println("Esta es el area del rectangulo: " + aux2);
                            aux2 = (base * 2) + (altura * 2);
                            System.out.println("Esta es el perimetro del rectangulo: " + aux2);
                        }else{
                            System.out.println("Ingrese el primer lado ");
                            lado = leer.nextDouble();
                            System.out.println("Ingrese el segundo lado ");
                            lado1= leer.nextDouble();
                            System.out.println("Ingrese el tercer lado ");
                            lado2 = leer.nextDouble();
                            aux2 = (base * altura) / 2;
                            System.out.println("Esta es el area del triangulo: " + aux2);
                            aux2 = lado + lado1 + lado2;
                            System.out.println("Esta es el perimetro del triangulo: " + aux2);
                        }
                    }else{
                        System.out.println("Ingrese el radio de la esfera ");
                        radio = leer.nextDouble();
                        radio = ((4/3) * 3.1415) * (radio * radio * radio);
                        System.out.println("Ingrese el radio del cilindro: ");
                        radio2 = leer.nextDouble();
                        System.out.println("Ingrese el altura del cilindro: ");
                        altura = leer.nextDouble();
                        res = Math.PI * radio2 * radio2 * altura;
                        System.out.println("Esta es el volumen de la esfera: " + radio);
                        System.out.println("Esta es el volumen del cilindro: " + res);
                    }
                    break;
                
                case 7:
                    System.out.println("N");
                    for(int i = 1; i <= 10; ++i){
                        System.out.print(i * 1);
                        System.out.print("   ");
                        System.out.print(i * 10);
                        System.out.print("   ");
                        System.out.print(i * 100);
                        System.out.print("   ");
                        System.out.println(i * 1000);
                    }
                    break;

                case 8:
                    System.out.println("Ingrese el valor a factorirializar");
                    n = leer.nextInt();
                    while(n < 0){
                        System.out.println("El valor es negativo, ingrese otro valor");
                        n = leer.nextInt();
                    }
                    res = 1;
                    for(int i = 2; i <= n; ++i){
                        res*= i;
                    }
                    System.out.println("Este es el factorial: " + res);
                    break;

                case 9:
                    System.out.println("Ingrese el lado del cuadro: ");
                    ladoC  = leer.nextInt();
                    for(int i = 1; i <= ladoC; ++i){
                        for(int j = 1; j <= ladoC; ++j){
                            System.out.print("*");
                        }
                        System.out.print("/n");
                    }
                    break;
            }
            System.out.println("Ingrese la opcion con la que desea continuar: ");
            System.out.println("1. Problema 1 ");
            System.out.println("2. Problema 2 ");
            System.out.println("3. Problema 3 ");
            System.out.println("4. Problema 4 ");
            System.out.println("5. Problema 5 ");
            System.out.println("6. Problema 6 ");
            System.out.println("7. Problema 7 ");
            System.out.println("8. Problema 8 ");
            System.out.println("9. Problema 9 ");
            System.out.println("10. Terminar la ejecuccion");
            casa = leer.nextInt();
        }
        System.out.println("Se termino la ejecuccion");
    }
}