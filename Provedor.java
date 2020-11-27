public class Provedor{

    private String nombre;
    private String productos[] = new String[10];
    private int costos[] = new int[10];
    private int inventarios[] = new int[10];
   
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setProducto(String producto, int ind){
        this.productos[ind] = producto;
    }
    public String getProducto(int ind){
        return this.productos[ind];
    }

    public void setCosto(int costo, int ind){
        this.costos[ind] = costo;
    }
    public int getCosto(int ind){
        return this.costos[ind];
    }

    public void setInventario(int inventario, int ind){
        this.inventarios[ind] = inventario;
    }
    public int getInventario(int ind){
        return this.inventarios[ind];
    }
}