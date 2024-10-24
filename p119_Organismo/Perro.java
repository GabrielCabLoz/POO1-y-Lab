package p119_Organismo;

public class Perro extends organismo implements canino{

    public Perro(String Nombre){
        super(Nombre);
    }

    public void multiCelular(){
        System.out.println("Es un animal multicelular es un perro");

    }

    public void sangreCaliente(){
        System.out.println("Es un animal de sangre caliente");
        
    }

    public void correr(){
        System.out.println("Es un canino que corre ");
        
    }

    public void cuatroPatas(){
        System.out.println("Es un canino que corre en cuatro patas");
    }
    
}
