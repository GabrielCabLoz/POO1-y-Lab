package p109_FormaV2;

public class Formasv2_Main {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); System.out.flush();
        
        Circulo circulo1 = new Circulo(10.23, "Rojo", true);
        Circulo circulo2 = new Circulo(99.12, "Verde", false);
        Rectangulo rectangulo1 = new Rectangulo(10.0, 20.0, "Amarillo", false);
        Rectangulo rectangulo2 = new Rectangulo(15.0, 44.0, "Azul", true);

        System.out.println("Todas las formas");
        System.out.println(circulo1.toString());
        System.out.println(circulo2.toString());
        System.out.println( rectangulo1.toString());
        System.out.println( rectangulo2.toString());
        System.out.println(" ");
        System.out.println("Calculando areas y perimetros de las figuras");
        System.out.println("La figura es un circulo: ");
        System.out.println("El area es : "+circulo1.getArea());
        System.out.println("El perimetro es : "+circulo1.getPerimetro());
        System.out.println("La figura es un circulo: ");
        System.out.println("El area es : "+circulo2.getArea());
        System.out.println("El perimetro es : "+circulo2.getPerimetro());
        System.out.println("La figura es un rectangulo ");
        System.out.println("El area es : "+circulo2.getArea());
        System.out.println("El perimetro es : "+circulo2.getPerimetro());
        System.out.println("La figura es un rectangulo: ");
        System.out.println("El area es : "+circulo2.getArea());
        System.out.println("El perimetro es : "+circulo2.getPerimetro());





    }





    
}
