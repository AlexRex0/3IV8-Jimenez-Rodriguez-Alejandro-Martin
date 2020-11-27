public class Casilla{
    // Esta clase guarda la informacion de cada casilla en el tablero
    private boolean bomba, descubierto; 
    private int adyacentes;

    public Casilla(){
        
    }
    public Casilla(boolean bomba){
        this.bomba = bomba;
    }

    // set para establecer el vaor y get para obetener el valor
    public void setBomba(boolean bomba){
        this.bomba = bomba;
    }
    public boolean getBomba(){
        return this.bomba;
    }

    public void setAdyacentes(int adyacentes){
        this.adyacentes = adyacentes;
    }
    public int getAdyacentes(){
        return this.adyacentes;
    }

    public void setDescubierto(boolean descubierto){
        this.descubierto = descubierto;
    }
    public boolean getDescubierto(){
        return this.descubierto;
    }
}