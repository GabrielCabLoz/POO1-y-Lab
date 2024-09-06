import java.util.Scanner;
public class p28_leyDeNewton {
public static void main(String[] args) {
float f, m, a;
char op;
Scanner t= new Scanner(System.in);
System.out.print("\033[H\033[2J");
System.out.flush();
System.out.println("Calcula la segunda ley de newton");
System.out.println("[F]uerza ( f=m*a ) ");
System.out.println("[M]asa ( m=f/a ) ");
System.out.println("[A]celeracion ( a=f/m ) ");
System.out.print("Elije una opcion ? ");
op = Character.toUpperCase(t.next().charAt(0));
f = m = a = 0;
if (op == 'F') {
System.out.println("\nCalculando la Fuerza ...");
System.out.print("Masa ? ");
m = t.nextFloat();
System.out.print("Aceleracion ? ");
a = t.nextFloat();
f = m * a;
System.out.printf("\nFuerza: %.2f", f);
} else if (op == 'M') {
System.out.println("\nCalculando la Masa ...");
System.out.print("Fuerza ? ");
f = t.nextFloat();
System.out.print("Aceleracion ? ");
a = t.nextFloat();
m = f / a;
System.out.printf("\nMasa: %.2f", m);
} else if (op == 'A') {
System.out.println("\nCalculando la Aceleracion ...");
System.out.print("Fuerza ? ");
f = t.nextFloat();
System.out.print("Masa ? ");
m = t.nextFloat();
t.close();
a = f / m;
System.out.printf("\nAceleración: %.2f", a);
} else
System.out.println("\nOpcion Invalida \n");
}
}