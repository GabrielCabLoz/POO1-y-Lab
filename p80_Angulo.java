import java.util.*;
public class p80_Angulo {

    public static String tipoAngulpo(int ángulo){
       String tipoAngulo;
       if(ángulo<90)tipoAngulo=" Este es un angulo agudo";
       else if(ángulo==90)tipoAngulo=" Este es un angulo recto";
       else if (ángulo>90&&ángulo<180)tipoAngulo=" Este es un angulo obtuso";
       else if(ángulo==180)tipoAngulo=" Este es un angulo llano";
       else if (ángulo>180&&ángulo<360)tipoAngulo=" Este es un angulo concavo";
       else{
        tipoAngulo=" Angulo invalido";
       }


        return tipoAngulo;
        
    }

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");System.out.flush(); 
        
        int angulo;
        Scanner t=new Scanner(System.in);

        System.out.println("Ingresa el angulo para determinar su tipo");
        angulo=t.nextInt();
        t.close();

        System.out.println("El angulo que ingresaste es "+angulo+tipoAngulpo(angulo));

    
        
    }
}
