package javaejercicio1;

import java.util.Scanner;

public class JavaEjercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        var usuario = entrada.nextLine();
        System.out.println("Escriba el titulo: ");
        var titulo = entrada.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }

}
