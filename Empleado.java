public class Empleado{
    private String Id, nombre, puesto;
    private int sueldo;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setId(String Id){
        this.Id = Id;
    }
    public String getId(){
        return this.Id;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    public String getPuesto(){
        return this.puesto;
    }

    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    public int getSueldo(){
        return this.sueldo;
    }
}