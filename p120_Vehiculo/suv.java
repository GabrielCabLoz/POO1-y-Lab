package p120_Vehiculo;

public class suv extends Maquina implements familiar{

    public suv(String nombre) {
        super(nombre);
    
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es un Sedan");
       
    }

    @Override
    public void combustionInterna() {
        System.out.println("Es un automóvil de combustion interna es un Sedan ");
        
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan ");
        
    }

    @Override
    public void chasisMonocasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan ");
        
    }


   
    
}
