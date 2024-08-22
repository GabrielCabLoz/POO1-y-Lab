import java.util.Scanner;
public class p26_TipoAngulo {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Scanner t =new Scanner(System.in);

        int ang;

        System.out.println("Dame un angulo para determinar si es agudo,recto,obtuso,llano o concavo");
        ang=t.nextInt();
        t.close();

        if(ang<90)System.out.println("El angulo es agudo");
        if(ang==90)System.out.println("El angulo es recto");
        if(ang>90&&ang<180)System.out.println("El angulo es obtuso");
        if(ang==180)System.out.println("El angulo es llano");
        if(ang>180&&ang<360)System.out.println("El angulo es concavo");
        if(ang==360)System.out.println("El angulo es completo");

        
    }

    
}