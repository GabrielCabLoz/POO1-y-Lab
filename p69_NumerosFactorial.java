import java.util.Scanner;

public class p69_NumerosFactorial {

public static void main(String[] args) {
long i,j,n,f;

Scanner obj = new Scanner(System.in);

System.out.print("\033[H\033[2J");System.out.flush();
System.out.print("Cuantos números ? "); n = obj.nextInt();
for(i=1; i<=n; i++) {
System.out.printf("%d!=",i);
f=1;
for(j=1; j<=i; j++) {
f *= j;

}
System.out.println(f);
}
}
}


    
