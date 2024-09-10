//objetivo; Crear un programa que te permita llevar el control de las ventas
//Gabriel Cabrera Lozano
//Fecha 08/09/2024

import java.util.*;
public class practica_Examn {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner t =new Scanner(System.in);
        int carta,oficio,doble,numVentas=1,contVentas=0,contOficio=0,contCarta=0,contDoble=0,totalVentas,totalCarta=0,totalOficio=0,totalDoble=0,dineroTotal=0;
        char continuar,tipocopia;
        
        do{
            System.out.println("--------------------------------");
            System.out.println("Papeleria Lozano,SA.de CV.");
            System.out.println("Sistema de ventas de copias ");
            System.out.println("--------------------------------");

            System.out.println("Venta "+numVentas);
            System.out.println("Tipo de copia (C)arta (O)ficio (D)oble");
            tipocopia=t.next().charAt(0);

            if(tipocopia=='c'){
             carta=3;
             System.out.println("Cantidad? ");
            contCarta+=t.nextInt();
            totalCarta+=(carta*contCarta);
            } else if (tipocopia=='o'){
             oficio=4;
             System.out.println("Cantidad? ");
            contOficio+=t.nextInt();
            totalOficio+=(oficio*contOficio);
            }else if(tipocopia=='d'){
            doble=6;
            System.out.println("Cantidad? ");
            contDoble+=t.nextInt();
            totalDoble+=(doble*contDoble);
            } else {
            System.out.println("opcion Invalida");
            break;
            }
            
            dineroTotal=(totalCarta+totalOficio)+totalDoble;

            System.out.println("Otra venta ? (S/N) ");
            continuar = t.next().charAt(0);
            numVentas++;
            contVentas++;
            
        } while(continuar=='s');

        t.close();

        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("Papeleria Lozano,SA.de CV.");
        System.out.println("Sistema de ventas de copias ");
        System.out.println("--------------------------------");
        System.out.println(" ");
        System.out.println("Resumen diario de ventas");
        System.out.println("--------------------------------");

        System.out.println("");
        System.out.println("Ventas realizadas "+contVentas);
        System.out.println("--------------------------------");
        System.out.println("Carta: "+contCarta+" - $"+totalCarta);
        System.out.println("Oficio: "+contOficio+" - $"+totalOficio);
        System.out.println("Dobles: "+contDoble+" - $"+totalDoble);
        System.out.println("--------------------------------");
        totalVentas=(contCarta+contOficio)+contDoble;

        System.out.println(">>>FORMA DE PAGO<<<");
        System.out.println(">>>>>EFECTIVO<<<<<");
        System.out.println("--------------------------------");
        System.out.println("Fecha de su compra 08/09/2024");
        System.out.println("Lo atendio Gabriel Cabrera - num de empleado: 030");
        System.out.println("--------------------------------");
        System.out.println("Tot.ventas : "+totalVentas+" - $"+dineroTotal);
        System.out.println("--------------------------------");
        if(totalVentas<50){
        System.out.println("Esta es una venta muy mala");
        }else if(totalVentas>50&&totalVentas<=100){
        System.out.println("Esta es una venta frecuente ");
        }else if (totalVentas>101)
        System.out.println("Venta superada somos ricos ");
        

        
    }
}