package CuentaBancaria;

import java.util.ArrayList;

public class CuentaBancaria_Main {

    public static void main(String[] args) {


        System.out.print("\033[H\033[2J"); System.out.flush();


        cuentaBancaria cuenta1=new cuentaBancaria(5000);
        cuentaBancaria cuenta2=new cuentaBancaria(5000);
        cuentaBancaria cuenta3=new cuentaBancaria(1000);

        ArrayList<cuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);

        System.out.println("Probando banco del bienestar");

        Banco banco1=new Banco("Bancobuaz","En la buaz");
        

        for (cuentaBancaria cuentasbBancaria:cuentas){
            System.out.println(cuentasbBancaria.toString());
        }


        System.out.println("Bienvenido a el banco de la buaz");
        System.out.println("tu saldo es de ;"+cuenta1.getSaldo());

        //400 pesos retiro

        boolean RSN;

        System.out.println("Retiraste ");
        System.out.println(" ");
        System.out.println("Te queda:"+cuenta1.getClass());
        

        System.out.println("No tienes ni para los cigarros ponte a trabajar ");


        // poder agregar cuetnas de dos personas 


        //Poder restar dinero entre cuentas y agregarlas a otras 

        System.out.println("Te quedan"+cuenta1.getSaldo());


        //Metodo para saber el saldo total de un banco 

        double Total=0;





        
    }
    
}
