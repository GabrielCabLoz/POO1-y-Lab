import java.util.*;
public class p81_InicializaArregloNumeros {

    public static void main(String[] args) {
        
        double[]nums=new double[7];//inicializar arreglo[0]

        nums[0]=5.0;
        nums[1]=10.0;
        nums[2]=15.0;
        nums[3]=20.5;
        nums[4]=25.0;
        nums[5]=100.22;
        nums[6]=90.0;

        Scanner t =new Scanner(System.in);
        System.out.println("primer elemento "+nums[0]);
        System.out.println("Ultimo elemento "+nums[6]);
        System.out.println(" ");
        System.out.println("todos los elementos con un for en base al indice ");
        for(int i=0;i<nums.length;i++)
            System.out.println(nums[1]+" ");
        System.out.println("Todos los elementos del arreglo con un for sin indice");
        for (double i:nums)
         System.out.println(i+" ");
        System.out.println("Proceso terminado");
        t.close();






    }
    
}
