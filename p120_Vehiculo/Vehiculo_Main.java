package p120_Vehiculo;

public class Vehiculo_Main {

    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");System.out.flush();

        sedan misedan=new sedan("Vochito");
        System.out.println("Nombre: "+misedan.getNombre()+" Propietario= Maria Diaz , pasajeros= 4");
        misedan.sistemaElectrico();
        misedan.combustionInterna();
        misedan.chasisIndependiente();
        misedan.traccion4x4();
        misedan.repostar();
        misedan.arrancar();
        misedan.frenar();
        System.out.println();

        suv misuv=new suv("La mamalona 4x4 del profre ");
        System.out.println("Nombre: "+misuv.getNombre()+" Propietario=Carlos Castañeda , pasajeros= 6");
        misuv.sistemaElectrico();
        misuv.combustionInterna();
        misuv.carroceriaTres();
        misuv.chasisMonocasco();
        misuv.repostar();
        misuv.arrancar();
        misuv.frenar();
        System.out.println();
        
        
        
    }
    
}
