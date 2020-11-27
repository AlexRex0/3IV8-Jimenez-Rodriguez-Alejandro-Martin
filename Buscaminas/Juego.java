import java.util.*;

public class Juego{
    public static void main(String[] args){
        
        // declaro los objetos de las clases que voy a utilizar
        Mapa game = new Mapa();
        Scanner leer  = new Scanner(System.in);

        int x, y;
        
        //genero mi mapa
        game.generMapa();

        // se realiza el juego
        while(!game.getAcabo()){
            //se piden las coordenadas de la casilla que desea al usuario
            while(true){
                try{
                    System.out.println("Elige las coordenadas x, y de tu siguiente movimiento (que esten entre el 1 y el 10): ");
                    x = leer.nextInt();
                    y = leer.nextInt();
                    while(x < 1 || x > 10 || y < 1 || y > 10){
                        System.out.println("\u001B[31m" + "Ingrese las coordenadas sin valores positivos y dentro del rango establecido" + "\u001B[31m" + "\u001B[0m");
                        System.out.println("Elige las coordenadas x, y de tu siguiente movimiento (que esten entre el 1 y el 10): ");
                        x = leer.nextInt();
                        y = leer.nextInt();
                    }
                    break;
                }catch(Exception e){
                    System.out.println("\u001B[31m" + "Por favor, coloca valores numeriocos" + "\u001B[31m" + "\u001B[0m");
                    System.out.println("Error: " + e.getMessage());   
                    leer.nextLine();      
                }
            }
            //pregunta si eligio una bomba
            if(game.mapa[x][y].getBomba()){
                System.out.println("Has explotado una mina, fin del juego T_T");
                break;
            }
            //descubrimos las casillas adyacentes de la casilla deseada
            game.descubrir(x, y);

            // imprimimos nuestro tablero actual
            game.imprimir();
        }

        // Imprimimos nuestro tablero final de juego
        System.out.print("   ");
        for(int i = 1; i <= 10; ++i){
            System.out.print("\u001B[32m" + i + " " + "\u001B[32m" + "\u001B[0m");
        }
        System.out.println(" ");
        for(int i = 1; i <= 9; ++i){
            System.out.print("\u001B[32m" + i + "  " + "\u001B[32m" + "\u001B[0m");
            for(int j = 1; j <= 10; ++j){
                if(game.mapa[i][j].getBomba()){
                    System.out.print("\u001B[31m" + "M " + "\u001B[31m" + "\u001B[0m");
                }else{
                    if(game.mapa[i][j].getAdyacentes() > 0){
                        System.out.print("\u001B[34m" + game.mapa[i][j].getAdyacentes() + " " + "\u001B[34m" + "\u001B[0m");
                    }else{
                        System.out.print(game.mapa[i][j].getAdyacentes() + " ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.print("\u001B[32m" + 10 + " " + "\u001B[32m" + "\u001B[0m");
        for(int j = 1; j <= 10; ++j){
            if(game.mapa[10][j].getBomba()){
                System.out.print("\u001B[31m" + "M " + "\u001B[31m" + "\u001B[0m");
            }else{
                if(game.mapa[10][j].getAdyacentes() > 0){
                    System.out.print("\u001B[34m" + game.mapa[10][j].getAdyacentes() + " " + "\u001B[34m" + "\u001B[0m");
                }else{
                    System.out.print(game.mapa[10][j].getAdyacentes() + " ");
                }
            }
        }
    }
}