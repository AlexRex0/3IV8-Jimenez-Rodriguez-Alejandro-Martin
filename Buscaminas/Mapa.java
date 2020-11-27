
import java.lang.Math.*;
public class Mapa{

    Casilla Mina = new Casilla();
    Casilla mapa[][] = new Casilla[12][12];
    boolean noVisitados[][] = new boolean[12][12];
    int mov[][] = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    int aux, contMinas = 0;

    public void generMapa(){
        // esta funcino me va a generar el tablero de juego

        //genero con un random las minas en el tablero
        for(int i = 0; i <= 11; ++i){
            for(int j = 0; j <= 11; ++j){
                aux =(int) Math.floor(Math.random()*6);;
                if(aux == 0 && i > 0 && i < 11 && j > 0 && j < 11){
                    //mapa[i][j].setBomba(true);
                    mapa[i][j] = new Casilla(true);
                    contMinas++;    
                }else{
                    mapa[i][j] = new Casilla(false);
                }
            }
        }
        //checo las bombas que tiene cada casilla a su alrededor
        for(int i = 1; i <= 10; ++i){
            for(int j = 1; j <= 10; ++j){
                aux = 0;
                if(mapa[i - 1][j - 1].getBomba()){
                    aux++;
                }
                if(mapa[i - 1][j].getBomba()){
                    aux++;
                }
                if(mapa[i - 1][j + 1].getBomba()){
                    aux++;
                }
                if(mapa[i + 1][j].getBomba()){
                    aux++;
                }
                if(mapa[i][j + 1].getBomba()){
                    aux++;
                }
                if(mapa[i + 1][j + 1].getBomba()){
                    aux++;
                }
                if(mapa[i][j - 1].getBomba()){
                    aux++;
                }
                if(mapa[i + 1][j - 1].getBomba()){
                    aux++;
                }
                mapa[i][j].setAdyacentes(aux);
            }
        }

        //inicializo mi matriz de visitados
        for(int i = 0;  i < 12; ++i){
            for(int j  = 0; j < 12; ++j){
                noVisitados[i][j] = false;
            }
        }
    }
    
    // este metodo nos va a descubrir los casillas adyacentes de la casilla que seleccione el usuario
    public void descubrir(int i, int j){
        if(i < 1 || i > 10 || j < 1 || j > 10){
            return;
        }
        if(noVisitados[i][j]){
            return;
        }
        noVisitados[i][j] = true;
        if(mapa[i][j].getBomba()){
            return;
        }
        mapa[i][j].setDescubierto(true);
        if(mapa[i][j].getAdyacentes() == 0){
            for(int x = 0; x < 4; ++x){
                descubrir(i + mov[x][0], j + mov[x][1]);
            }
        }
    }
    boolean acabo = false;

    // esta informacion nos va a imprimir el mapa del juego en su estado actual
    public void imprimir(){
        int contador = 0;
        System.out.print("   ");
        for(int i = 1; i <= 10; ++i){
            System.out.print("\u001B[32m" + i + " " + "\u001B[32m" + "\u001B[0m");
        }
        System.out.println(" ");
        for(int i = 1; i <= 9; ++i){
            System.out.print("\u001B[32m" + i + "  " + "\u001B[32m" + "\u001B[0m");
            for(int j = 1; j <= 10; ++j){
                if(mapa[i][j].getDescubierto()){
                    if(mapa[i][j].getAdyacentes() > 0){
                        System.out.print("\u001B[34m" + mapa[i][j].getAdyacentes() + " " + "\u001B[34m" + "\u001B[0m");
                    }else{
                        System.out.print(mapa[i][j].getAdyacentes() + " ");
                    }
                    contador++;
                }else{
                    System.out.print("\u001B[35m" + "? " + "\u001B[35m" + "\u001B[0m");
                }
            }
            System.out.println("");
        }
        System.out.print("\u001B[32m" + 10 + " " + "\u001B[32m" + "\u001B[0m");
        for(int j = 1; j <= 10; ++j){
            if(mapa[10][j].getDescubierto()){
                if(mapa[10][j].getAdyacentes() > 0){
                    System.out.print("\u001B[34m" + mapa[10][j].getAdyacentes() + " " + "\u001B[34m" + "\u001B[0m");
                }else{
                    System.out.print(mapa[10][j].getAdyacentes() + " ");
                }
                contador++;
            }else{
                System.out.print("\u001B[35m" + "? " + "\u001B[35m" + "\u001B[0m");
            }
        }
        System.out.println("");
        if((10 * 10) - contador == contMinas){
            System.out.println("\u001B[33m" +"Haz ganado el buscaminas yeii" + "\u001B[33m" + "\u001B[0m");
            acabo = true;
        }
    }
    public boolean getAcabo(){
        return acabo;
    }
}