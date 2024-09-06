import java.util.Scanner;
public class p22_VerificaSuma {
public static void main(String[] args) {
int n1, n2, n3;
Scanner t = new Scanner(System.in);
System.out.print("\033[H\033[2J"); System.out.flush();
System.out.println("Verificar si la suma de dos numeros es igual a un tercero\n");
System.out.print("Dame el primer numero ? "); n1 = t.nextInt();
System.out.print("Dame el seguno numero ? "); n2 = t.nextInt();
System.out.print("Dame el tercer numero ? "); n3 = t.nextInt();
t.close();
if( n1+n2 == n3 )
System.out.println("\nSon iguales");
else
System.out.println("\nSon distintos");
System.out.println("\nGracias por utilizar este programa");
}
}