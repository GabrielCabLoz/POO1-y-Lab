package p112_ControlVentas;


public class ventas_main {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println(" ");
        System.out.println("Reporte sin ventas ");
        System.out.println(" ");

        Tienda tiendaBuaz=new Tienda("Abarrotes buaz", "Gabriel Cabrera Lozano","Zacatecas zac ");
        Cliente cliente1=new Cliente("Carlos Castañeda", "Zacatecas zac", "Carlos@hotmail.com");
        Cliente cliente2=new Cliente("Juan Carlos", "Zacatecas zac", "Juan@hotmail.com");
        Cliente cliente3=new Cliente("Ximena ", "Zacatecas zac", "Ximena@hotmail.com");

        tiendaBuaz.agregarCliente(cliente1);
        tiendaBuaz.agregarCliente(cliente2);
        tiendaBuaz.agregarCliente(cliente3);

        System.out.println(tiendaBuaz);
        System.out.println("    ");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        tiendaBuaz.getClientes().get(0).agregarVenta(new VentaContado("Alambre", 10, 5, 10, "clavos"));
        tiendaBuaz.getClientes().get(0).agregarVenta(new VentaCredito("Cuatin", 5, 100, 5, 10));
        tiendaBuaz.getClientes().get(1).agregarVenta(new VentaCredito("Tornillos", 2.5, 160.34, 2, 20));
        tiendaBuaz.getClientes().get(1).agregarVenta(new VentaCredito("tubulares de 2x3", 5, 71.34, 6, 20));
        tiendaBuaz.getClientes().get(1).agregarVenta(new VentaContado("Laminas", 10, 650.33, 20, "Pinzas"));;
        tiendaBuaz.getClientes().get(2).agregarVenta(new VentaContado("Martillo", 50, 65, 10, "$500"));;
        
        System.out.println(" ");
        System.out.println("Reporte de los clientes : ");
        System.out.println(" ");
        System.out.println(tiendaBuaz);
        tiendaBuaz.reporte();


    }
    
}
