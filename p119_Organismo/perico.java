package p119_Organismo;


 public class perico extends organismo implements ave {
    
    public perico(String nombre) {
    super(nombre);
    }
  
    public void multiCelular() {

    System.out.println("Es un animal multicelular es un perico");
    }
  
    public void sangreCaliente() {
    System.out.println("Es un animal de sangre caliente es un perico");
    }
   
    public void dosPatas() {
    
        System.out.println("Es un ave y camina en dos Patas es un perico");
    }
    
    public void volar() {

    System.out.println("Es un ave puede volar es un perico ");
    }
}