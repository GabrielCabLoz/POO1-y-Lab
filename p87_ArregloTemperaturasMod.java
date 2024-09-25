public class p87_ArregloTemperaturasMod { 
    public static void mostrarTemperaturas(double[] temperaturas) { 
        for (double temperatura : temperaturas) { 
            System.out.print(temperatura + " "); 
        }
    }

    public static double encontrarMayor(double[] temperaturas) { 
        double mayor = temperaturas[0]; 
        for (int indice = 1; indice < temperaturas.length; indice++) { 
            if (temperaturas[indice] > mayor) { 
                mayor = temperaturas[indice]; 
            }
        }
        return mayor; 
    }

    public static double calcularPromedio(double[] temperaturas) { 
        double suma = 0; 
        for (double temp : temperaturas) { 
            suma += temp; 
        }
        return suma / temperaturas.length; 
    }

    public static int buscarTemperatura(double[] temperaturas, double objetivo) { 
        for (int indice = 0; indice < temperaturas.length; indice++) { 
            if (temperaturas[indice] == objetivo) { 
                return indice; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) { 
        double[] temperaturas = {12.34, 56.22, 56.78, 0.0, 10.25, 60.22}; 
        double valorBuscado = 10.25; 
        int posicion; 
        
        System.out.print("\033[H\033[2J");System.out.flush(); 
        
        
        System.out.println("\nValores de las temperaturas:"); 
        mostrarTemperaturas(temperaturas); 
        
        System.out.printf("\nLa temperatura más alta es: %.2f", encontrarMayor(temperaturas)); 
        System.out.printf("\nEl promedio de las temperaturas es: %.2f", calcularPromedio(temperaturas)); 
        
        posicion = buscarTemperatura(temperaturas, valorBuscado); 
        
        if (posicion != -1) { 
            System.out.printf("\nLa temperatura %.2f se encuentra en la posición %d", valorBuscado, posicion); 
        } else { 
            System.out.printf("\nLa temperatura %.2f no fue encontrada.", valorBuscado); 
        }
    }
}
