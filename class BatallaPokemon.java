import java.util.*;
class BatallaPokemon{
    
    public static void main (String[] args){
        Scanner leer  = new Scanner(System.in);
        int opcion, random, continuar;
        BatallaPokemon squirtle = new BatallaPokemon();
        BatallaPokemon charmander = new BatallaPokemon();
        BatallaPokemon bulbasaur = new BatallaPokemon();
        double bId = 2;
        String bNombre = "Bulbasaur";
        double bFuerza = 10;
        double bDefensa = 8;
        double bVida = 20;
        String bAtaquePrincipal = "Latigo Cepa";
        String bAtaqueSecundario = "placaje";
        
        double cId = 1;
        String cNombre = "Charmander";
        double cFuerza = 15;
        double cDefensa = 13;
        double cVida = 19;
        String cAtaquePrincipal = "ascuas";
        String cAtaqueSecundario = "placaje";

        double sId = 3;
        String sNombre = "Squirtle";
        double sFuerza = 12;
        double sDefensa = 17;
        double sVida = 23;
        String sAtaquePrincipal = "rayo burbuja";
        String sAtaqueSecundario = "placaje";
        System.out.println("3iv8 Jimenez Rodriguez Alejandro Martin");
        System.out.println("Ingrese la opcion que desee: ");
        System.out.println("1. Mostrar los datos del pokemon Carmander");
        System.out.println("2. Mostrar los datos del pokemon Bulbasaur");
        System.out.println("3. Mostrar los datos del pokemon Squirtle");
        System.out.println("4. Batalla Pokemon");
        System.out.println("5. Terminar de utilizar la Pokedex");
        opcion = leer.nextInt();
        while(opcion < 1 || opcion > 5){
            System.out.println("Opcion Invalida, Vuelva a ingresar otra opcion: ");
            opcion = leer.nextInt();
        }
        while(opcion != 5){
            bVida = 20;
            cVida = 19;
            sVida = 23;
            switch (opcion) {
                case 1:
                    System.out.println("Charmander, es un pokemon de tipo fuego");
                    System.out.println("Numero de la pokedex: " + cId);
                    System.out.println("Fuerza: " + cFuerza);
                    System.out.println("Defensa: " + cDefensa);
                    System.out.println("Vida : PS " + cVida);
                    System.out.println("Ataque principal: " + cAtaquePrincipal);
                    System.out.println("Ataque secundaria: " + cAtaqueSecundario);
                    break;
                case 2:
                    System.out.println("Bulbasaur, es un pokemon de tipo planta");
                    System.out.println("Numero de la pokedex: " + bId);
                    System.out.println("Fuerza: " + bFuerza);
                    System.out.println("Defensa: " + bDefensa);
                    System.out.println("Vida : PS " + bVida);
                    System.out.println("Ataque principal: " + bAtaquePrincipal);
                    System.out.println("Ataque secundaria: " + bAtaqueSecundario);
                    break;
                case 3:
                    System.out.println("Squirtle, es un pokemon de tipo agua");
                    System.out.println("Numero de la pokedex: " + sId);
                    System.out.println("Fuerza: " + sFuerza);
                    System.out.println("Defensa: " + sDefensa);
                    System.out.println("Vida : PS " + sVida);
                    System.out.println("Ataque principal: " + sAtaquePrincipal);
                    System.out.println("Ataque secundaria: " + sAtaqueSecundario);
                    break;
                case 4:
                    continuar = 1;
                    while(continuar == 1){
                        bVida = 20;
                        cVida = 19;
                        sVida = 23;
                        System.out.println("Ingrese un numero al azar del 1 al 10: ");
                        random = leer.nextInt();
                        while(random < 1 || random > 10){
                            System.out.println("Opcion Invalida, Vuelva a ingresar otra numero entre el 1 y el 10: ");
                            random = leer.nextInt();
                        }
                        if(random < 5){
                            System.out.println("Squirtle");
                            System.out.println("Fuerza: " + sFuerza);
                            System.out.println("Defensa: " + sDefensa);
                            System.out.println();
                            System.out.println("Chamander");
                            System.out.println("Fuerza: " + cFuerza);
                            System.out.println("Defensa: " + cDefensa);
                            while(sVida > 0 && cVida > 0){
                                System.out.println("PS Squirtle: " + sVida);
                                System.out.println("PS Charmander: " + cVida);
                                sVida-= (cFuerza * cDefensa) / 3;
                                System.out.println("Charmander uso: " + cAtaquePrincipal);
                                if(sVida <= 0){
                                    System.out.println("Squirtle no puede continuar, el ganador en Charmander");
                                    break;
                                }
                                cVida = (sFuerza * sDefensa) / 3;
                                System.out.println("Squirtle uso: " + sAtaquePrincipal);
                                if(cVida <= 0){
                                    System.out.println("Charmander no puede continuar, el ganador en Squirtle");
                                    break;
                                }
                            }
                        }else{
                            if(random  < 8){
                                System.out.println("Squirtle");
                                System.out.println("Fuerza: " + sFuerza);
                                System.out.println("Defensa: " + sDefensa);
                                System.out.println();
                                System.out.println("Bulbasaur");
                                System.out.println("Fuerza: " + bFuerza);
                                System.out.println("Defensa: " + bDefensa);
                                while(sVida > 0 && bVida > 0){
                                    System.out.println("PS Squirtle: " + sVida);
                                    System.out.println("PS Bulbasaur: " + bVida);
                                    sVida-= (bFuerza * bDefensa) / 3;
                                    System.out.println("Bulbasaur uso: " + bAtaquePrincipal);
                                    if(sVida <= 0){
                                        System.out.println("Squirtle no puede continuar, el ganador en Bulbasaur");
                                        break;
                                    }
                                    bVida = (sFuerza * sDefensa) / 3;
                                    System.out.println("Squirtle uso: " + sAtaquePrincipal);
                                    if(bVida <= 0){
                                        System.out.println("Bulbasaur no puede continuar, el ganador en Squirtle");
                                        break;
                                    }
                                }
                            }else{
                                System.out.println("Charmander");
                                System.out.println("Fuerza: " + cFuerza);
                                System.out.println("Defensa: " + cDefensa);
                                System.out.println();
                                System.out.println("Bulbasaur");
                                System.out.println("Fuerza: " + bFuerza);
                                System.out.println("Defensa: " + bDefensa);
                                while(cVida > 0 && bVida > 0){
                                    System.out.println("PS Charmander: " + cVida);
                                    System.out.println("PS Bulbasaur: " + bVida);
                                    cVida-= (bFuerza * bDefensa) / 3;
                                    System.out.println("Bulbasaur uso: " + bAtaquePrincipal);
                                    if(cVida <= 0){
                                        System.out.println("Charmander no puede continuar, el ganador en Bulbasaur");
                                        break;
                                    }
                                    bVida = (cFuerza * cDefensa) / 3;
                                    System.out.println("Charmander uso: " + cAtaquePrincipal);
                                    if(bVida <= 0){
                                        System.out.println("Bulbasaur no puede continuar, el ganador en Charmander");
                                        break;
                                    }
                                }
                            }
                        }
                        System.out.println("Si quiere recrear otro combate ingrese 1");
                        System.out.println("Si ya no desea recrear otro combate ingrese 2");
                           continuar = leer.nextInt();
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Ingrese la opcion que desee continuar: ");
            System.out.println("1. Mostrar los datos del pokemon Carmander");
            System.out.println("2. Mostrar los datos del pokemon Bulbasaur");
            System.out.println("3. Mostrar los datos del pokemon Squirtle");
            System.out.println("4. Batalla Pokemon");
            System.out.println("5. Terminar de utilizar la Pokedex");
            opcion = leer.nextInt();
            while(opcion < 1 || opcion > 5){
                System.out.println("Opcion Invalida, Vuelva a ingresar otra opcion: ");
                opcion = leer.nextInt();
            }
        }
        System.out.println("Gracias por utilizar la pokedex UwU");
    }
}