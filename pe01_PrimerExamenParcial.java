import java.util.*;
public class pe01_PrimerExamenParcial {

    public static void main(String[] args) {

        String nombre;
        int edad,contRechazados=0,alumo=0,docente=0,trabajador=0,contAlumno=0,contDocente=0,contTrabajador=0,contHombres=0,contMujeres=0,totalDineroAlumnos=0,TotalDineroDocentes=0,TotalDineroTrabajadores=0,totalHyM=0,TotalDinero=0;
        char tipo,sexo,continuar;
        Scanner t =new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
      do{
         System.out.println("Ingresa tu nombre");
         nombre=t.nextLine();
         System.out.println("Ingresa tu edad");
         edad=t.nextInt();
         System.out.println("Ingresa tu sexo (H) o (M)");
         sexo=t.next().charAt(0);
         

         if(sexo=='h'){
         contHombres++;
         }else if (sexo=='m'){
            contMujeres++;
         }

         if(edad>=23){System.out.println("Bienvenido "+nombre+" Tienes "+edad+" Años "+"y eres "+sexo);
        } else if(edad<23) System.out.println("Solo se aceptan alumnos con una edad de 23 en adelante ");
         contRechazados++;
        

         System.out.println("Ingresa tu tipo de usuario (a)lumno,(d)ocente,(T)rabajador)");
         tipo=t.next().charAt(0);

         if(tipo=='a'){
             alumo=40;
             contAlumno++;
             totalDineroAlumnos+=(contAlumno*alumo);
            } else if (tipo=='d'){
             docente=60;
             contDocente++;
             TotalDineroDocentes+=(contDocente*docente);
            }else if(tipo=='t'){
             trabajador=80;
             contTrabajador++;
             TotalDineroTrabajadores+=(contTrabajador*trabajador);
            } else {
             System.out.println("opcion Invalida");
             return;
            }
            System.out.println("Otro Alumno? (S/N) ");
            continuar = t.next().charAt(0);

        }while(continuar=='s');
        t.close();

        totalHyM=contHombres+contMujeres;
        TotalDinero=(totalDineroAlumnos+TotalDineroTrabajadores)+TotalDineroDocentes;

        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("Universidad Autonoma de Zacatecas");
        System.out.println("Sistema de control de alumnos  ");
        System.out.println("--------------------------------");
        System.out.println(" ");
        System.out.println("Resumen de alumnos inscritos");
        System.out.println("--------------------------------");
        System.out.println("Total de alumnos "+contAlumno);
        System.out.println("Total de docentes ");
        System.out.println("Total de trabajadores ");
        System.out.println("Total hombres");
        System.out.println("Total Mujeres");
        System.out.println("Total participantes"+((contRechazados+alumo)+trabajador)+docente);
        System.out.println("Promedio");
        System.out.println("Total rechazados"+contRechazados);
        System.out.println("Total dinero alumnos :"+totalDineroAlumnos);
        System.out.println("Total dinero docentes :"+TotalDineroDocentes);
        System.out.println("Total dinero trabajadores :"+TotalDineroTrabajadores);
        System.out.println("Total dinero recaudado :"+TotalDinero);


           
           
    }  








 }
    

