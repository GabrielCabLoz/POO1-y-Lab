package P98_Circulo;
public class main_Circulo{
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); System.out.flush();
        
        radio_circulo c1 = new radio_circulo(10.40);
        System.out.println(c1);
        radio_circulo c2 = new radio_circulo(12.45);
        c2.setRadio(12.45);

        System.out.println(c2.toString())
        ;
        System.out.println("El radio es : " + c2.getRadio() );
        System.out.println("Area = " + c1.getArea() );
        System.out.println("Circunferencia = " + c1.getCircunferencia() );
        }
}