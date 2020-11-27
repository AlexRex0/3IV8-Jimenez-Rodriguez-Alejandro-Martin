import java.util.*;

public class TrabajarProvedor{
    
    Provedor persona = new Provedor();

    public void  pedirDatos(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del provedor: ");
        persona.setNombre(leer.nextLine());

        System.out.println("Ingrese los datos de los 10 productos: ");
        for(int i = 0; i < 10; ++i){
            System.out.println("Ingrese el siguiente nombre: ");
            persona.setProducto(leer.next(), i);

            System.out.println("Ingrese el costo del producto: ");
            persona.setCosto(leer.nextInt(), i);

            System.out.println("Ingrese la cantidad en el inventario del producto: ");
            persona.setInventario(leer.nextInt(), i);
        }
    }


    public void DatosPovedor(){
        int max = persona.getCosto(0), min = persona.getCosto(0), total = 0, sumaTotal = 0;
        String productoMayor = persona.getProducto(0), productoMenor = persona.getProducto(0);
        System.out.println("Provedor: " + persona.getNombre());
        System.out.println("Los datos de los productos son: ");
        for(int i = 0; i < 10; ++i){
            System.out.println("Producto: " + persona.getProducto(i));
            System.out.println("Costo del producto: " + persona.getCosto(i));
            System.out.println("Cantidad en el inventario: " + persona.getInventario(i));
            if(max < persona.getCosto(i)){
                max = persona.getCosto(i);
                productoMayor = persona.getProducto(i);
            }
            if(min > persona.getCosto(i)){
                min = persona.getCosto(i);
                productoMenor = persona.getProducto(i);
            }
            total+= persona.getCosto(i);
            sumaTotal+= persona.getCosto(i) * persona.getInventario(i);
        }
        System.out.println("El producto con mayor costo es:" + productoMayor + ", con el costo de: " + max);
        System.out.println("El producto con menor costo es:" + productoMenor + ", con el costo de: " + min);
        System.out.println("La suma total de los costos: " + total);
        System.out.println("Costo promedio de los productos: " + total / 10);
        System.out.println("El costo total de todo el inventario: " + sumaTotal);
    }
}