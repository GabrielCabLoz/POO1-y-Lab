package P103_ClienteFactura;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteFactura_Main {

    public static Factura llenar() {
        Factura f = new Factura();
        Cliente c = new Cliente();
        Scanner t = new Scanner(System.in);

        System.out.println("Dame los datos de la Factura y el Cliente");

        System.out.print("Id Factura: ");
        f.setId(t.nextInt());

        System.out.print("Monto: ");
        f.setMonto(t.nextDouble());

        System.out.print("Cliente Id: ");
        c.setId(t.nextInt());

        System.out.print("Cliente Nombre: ");
        t.nextLine();  
        c.setNombre(t.nextLine());

        System.out.print("Cliente Descuento: ");
        c.setDescuento(t.nextFloat());

        f.setCliente(c);
        return f;
    }

    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();

        
        Factura f1 = new Factura(1, 1500, new Cliente(1, "Juan Perez", 0.03f));
        Factura f2 = new Factura(2, 2300, new Cliente(2, "Maria Lopez", 0.01f));

        facturas.add(f1);
        facturas.add(f2);

        Factura f3 = llenar();
        System.out.println("Mi Factura es: " + f3.toString());
        facturas.add(f3);

        Factura f4 = llenar();
        System.out.println("Mi otra factura es: " + f4.toString());
        facturas.add(f4);

        
        for (Factura factura : facturas) {
            System.out.println("Id Factura: " + factura.getId());
            System.out.println("Monto: " + factura.getMonto());
            System.out.println("Cliente Id: " + factura.getCliente().getId());
            System.out.println("Cliente Nombre: " + factura.getCliente().getNombre());
            System.out.println("Cliente Descuento: " + factura.getCliente().getDescuento());
            System.out.println();
        }
    }
}

