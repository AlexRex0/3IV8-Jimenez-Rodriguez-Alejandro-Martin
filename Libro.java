public class Libro{

    private String titulo, autor;
    private int cantidad, prestados;

    public Libro(){
        
    }
    public Libro(String titulo, String autor, int cantidad){

        this.autor = autor;
        this.titulo = titulo;
        this.cantidad = cantidad;

    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }   

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public int getCantidad(){
        return this.cantidad;
    }

    public void setPrestados(int prestados){
        this.prestados = prestados;
    }
    public int getPrestados(){
        return this.prestados;
    }
    
}