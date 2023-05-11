package javaejercicio1;

import java.util.Scanner;

public class JavaEjercicio1 {
    
    public static void main(String[] args) {
     
        // Primer ejercicio en Java usando la clase scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2 +" "+ usuario2);
    }
    
}
