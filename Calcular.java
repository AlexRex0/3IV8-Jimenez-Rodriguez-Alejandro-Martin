import java.util.*;

public class Calcular{
    
    Empleado persona = new Empleado();

    public void datosYSalario(){
        int nocturnas = 0, diurnas = 0, aux2;
        String aux;
        Scanner leer = new Scanner(System.in);

        // obtengo los datos del usuario:
        System.out.println("Ingrese su ID de empleado: ");
        aux = leer.nextLine();
        persona.setId(aux);
        
        System.out.println("Ingrese su nombre: ");
        aux = leer.nextLine();
        persona.setNombre(aux);

        System.out.println("eliga la opcion que le corresponde: ");
        System.out.println("1.- Empleado");
        System.out.println("2.- Supervisor");
        aux2 = leer.nextInt();
        if(aux2 == 1){
            persona.setPuesto("Empleado");
        }else{
            persona.setPuesto("Supervisor");
        }
        // obtengo las horas extra
        if(persona.getPuesto() == "Empleado"){
            System.out.println("Ingrese la cantidad de horas diurnas extra que realizo: ");
            diurnas = leer.nextInt();    
            System.out.println("Ingrese la cantidad de horas nocturnas extra que realizo: ");
            nocturnas = leer.nextInt(); 
            aux2 = 5000 + (diurnas * 50) + (nocturnas * 60);
            persona.setSueldo(aux2);   
        }else{
            double xd = 0;
            xd = 5000 * 0.81;
            persona.setSueldo((int)xd);
        }
        // obtener el sueldo del usuario
    }

    public void DatosPersona(){
        System.out.println("La persona:" + persona.getNombre());
        System.out.println("Con el ID:" + persona.getId());
        System.out.println("Con el puesto:" + persona.getPuesto());
        System.out.println("Su salario quincenal fue:" + persona.getSueldo());
    }
}