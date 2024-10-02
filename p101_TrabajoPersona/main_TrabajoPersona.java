package p101_TrabajoPersona;

public class main_TrabajoPersona {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); System.out.flush();
        
        Persona persona1=new Persona();//objeto
        Trabajo trabajo1=new Trabajo();//objeto

        trabajo1.setId(1);
        trabajo1.setRol("Chofer");
        trabajo1.setSalario(5000.00);

        persona1.setNombre("Juan");
        persona1.setTrabajo(trabajo1);

        System.out.println("Datos persona 1");
        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Id: "+persona1.getTrabajo().getId());
        System.out.println("Rol: "+persona1.getTrabajo().getRol());
        System.out.println("Salario: "+persona1.getTrabajo());
        System.out.println(persona1.toString());
        System.out.println(" ");
        Persona persona2 = new Persona("Maria Soto", new Trabajo(2, "Cocinera", 2500.00));

        System.out.println("Datos persona 2");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Id: " + persona2.getTrabajo().getId());
        System.out.println("Rol: " + persona2.getTrabajo().getRol());
        System.out.println("Salario: " + persona2.getTrabajo().getSalario());
        System.out.println(persona2.toString());




    }
    
}
