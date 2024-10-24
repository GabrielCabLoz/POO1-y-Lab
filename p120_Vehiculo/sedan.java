package p120_Vehiculo;

public class sedan extends Maquina implements todoTerreno {

    
    public sedan(String nombre) {
    super(nombre);

    }

    public void sistemaElectrico(){
        System.out.println("Es un autómovil con sistema eléctrico es una Suv ");

    }

    @Override
    public void combustionInterna() {
        System.out.println(" Es un automóvil de combustion interna es una Suv");
       
    }

    @Override
    public void traccion4x4() {
        System.out.println("Es un autómovil con tracción 4 x 4 es una Suv ");
       
    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un autómovil con chaisis independiente es una Suv ");
        
    }
    
    
}
