package P110_CuentaBancaria;

public class CuentaBancaria_Main {

    public static void main(String[] args) {


        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nProbando clase CuentaBancaria:\n");
        cuentaBancaria cuenta1 = new cuentaBancaria(5000);
        cuenta1.depositar(10000);
        System.out.println("El saldo es " + cuenta1.getSaldo());
        double cretiro = 56;
        boolean retiro = cuenta1.retirar(cretiro);
        if(retiro) System.out.println("Retiro de " + cretiro + " efectuado con éxito, nuevo saldo " + cuenta1.getSaldo());
        else System.out.println("Ni para los cigarros tienes");

        System.out.println("\nProbando clase Cliente");
        Cliente cliente1 = new Cliente("Juan Perez", cuenta1);
        System.out.println("Cliente 1 : " + cliente1);
        Cliente cliente2 = new Cliente("Carlos Castaneda", new cuentaBancaria(1000));
        System.out.println("Cliente 2 : " + cliente2);
        double nvoretiro = 50;
        cliente2.getCuenta().retirar(nvoretiro);
        if( cliente2.getCuenta().retirar(nvoretiro) )

        System.out.println("El retiro de " + nvoretiro + " efectuado con exito, nuevo saldo " + cliente2.getCuenta().getSaldo());

        else System.out.println("No money man :( ");


        System.out.println("\nProbando clase Banco");
        Banco mibanco = new Banco("Banco Patito SA de CV","Arboledas 124");
        mibanco.agregarCliente(cliente1);
        mibanco.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente("Felipe Correa", new cuentaBancaria(2000));
        mibanco.agregarCliente(cliente3);
        mibanco.getClientes().get(0).getCuenta().depositar(1500);
        mibanco.getClientes().get(1).getCuenta().retirar(1000);
        mibanco.getClientes().get(2).getCuenta().depositar(12000);
        System.out.println("\nResumen del Banco \n");
        System.out.println(mibanco);
        double totalbanco = 0.0;
        for(Cliente cliente : mibanco.getClientes()) {
        System.out.println(cliente);
        totalbanco += cliente.getCuenta().getSaldo();

       }
        System.out.println("\nTotal de dinero en el Banco : " + totalbanco);
        
    }
    
}
