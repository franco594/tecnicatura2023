
package poo;

import javax.swing.JOptionPane;


public class UsoCoche {
    
    public static void main(String[] args) {
        
        // Instanciamos una clase
        // focus sera un objeto de la clase Coche
        Coche focus = new Coche();
        
       focus.establecer_color(JOptionPane.showInputDialog("Introduce color"));
       
        System.out.println(focus.dime_datos_generales());
        
        System.out.println(focus.dime_color());
        
        focus.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        
        System.out.println(focus.dime_asientos());
        
        focus.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        
        System.out.println(focus.dime_climatizador());
    }
    
   
}
