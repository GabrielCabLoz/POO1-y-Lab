public class p121_Excepcion {
    public static void main(String[] args) {
     int a = 100;
     int b = 0;
     try {
      int c = a / b;
      System.out.println("El resultado es " + c);
     } catch (Exception e) {
    
     System.out.println("El denominador no puede ser 0");
    
     }
    }
}