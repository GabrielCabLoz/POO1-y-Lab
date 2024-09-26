package p97_Empleado04;

import java.util.ArrayList;

public class app {

    public static void main(String[] args) {
    
     System.out.print("\033[H\033[2J"); System.out.flush();

     Empleado empleado1=new Empleado("Roberto",23,'f',true);
     ArrayList<Empleado> empleados = new ArrayList<>(); 
     empleados.add(new Empleado("Juan Perez",35,'H',false));
     empleados.add(new Empleado("Ximena",19,'f',false));
     empleados.add(new Empleado("Martin",40,'f',true));
     empleados.add(new Empleado(" Carlos",40,'f',false));
     
     System.out.print("\033[H\033[2J");System.out.flush(); 
     System.out.println("\nLos empleados en el ArrayList"); 
     for (Empleado empleado : empleados)  
        System.out.println(empleado.toString()); 
     System.out.println("\nEl primer elemento del ArrayList"); 
     System.out.println(empleados.get(0)); 
     System.out.println("\nRealizando calculos:"); 
     int suma=0, th=0, tm=0, tc=0, tnc=0; 
    
    for(int i=0; i < empleados.size(); i++) { 
        suma = suma + empleados.get(i).getEdad(); 
        if(empleados.get(i).getSexo()=='H') th++; else tm++; 
        if(empleados.get(i).getEstado_civil()) tc++; else tnc++; 
    }

    System.out.println("Mujeres"+tm);
    System.out.println("Hombres"+th);
    System.out.println("Casados"+tc);
    System.out.println("Solteros"+tnc);
    System.out.println(" ");
    System.out.println("Nombre del primer empleado"+empleado1.getNombre());


    

}
}
