
package test;

import domain.Persona;


public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Franco");
        personas[1] = new Persona("Guido");
        System.out.println("Personas 0 = " + personas[0]);
        System.out.println("Personas 1 = " + personas[1]);
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas = "+ i + " = " + personas[i]);
        }
        
        String frutas[] = {"Banana", "Pera", "Durazno"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + i + " = " + frutas[i]);
        }
    }
}
  