
package poo;

// Definimos los  4 propiedades  de la clase Coche
public class Coche {
    
    // Encapsulamos las propiedades con el modificador de acceso private
    // Asi las propiedades solo podran modificarse desde la clase Coche
    private int ruedas;
    private int ancho;
    private int largo;
    private int motor;
    private int peso_plataforma;
    
    private String color;
    private int peso_total;
    private boolean asientos_de_cuero, climatizador;
   
    // Metodo constructor da un estado inicial al objeto
    // Nuestro objeto tendra los siguientes valores iniciales en sus atributos
    public Coche(){
        ruedas = 4;
        ancho = 300;
        largo = 2000;
        motor = 1600;
        peso_plataforma = 500;
    }
     
    // Creamos un metodo GETTER, que nos dira el largo del auto
    public String dime_color() {
        
        return "EL color del coche es " + color;
        
    } 
    // GETTER
    public String dime_datos_generales() {
        
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas" +
                ", mide " + largo / 1000 + " metros de largo y " + ancho + " cm de ancho."
                + " Tiene un motor de " + motor + " caballos de fuerza y pesa "
                + peso_plataforma + "kg.";
        
    } 
    
    // GETTER
    public String dime_asientos() {
        
        if (asientos_de_cuero == true){
            return "El coche tiene asientos de cuero";
        }else{
            return "El coche tiene asientos de serie";
        }
        
    }
    
    //GETTER
    public String dime_climatizador(){
        if(climatizador == true) {
            
            return "El coche tiene climatizador.";
            
        }else{
            return "El coche tiene aire acondicionado";
        }
    }
    
    // Creamos un metodo SETTER, que nos permitira modificar el color del auto
    public void establecer_color(String color_coche){
        
        color = color_coche;
        
    }
    // SETTER
    public void configura_asientos(String asientos_de_cuero){
        
        if (asientos_de_cuero.equalsIgnoreCase("si")){
            this.asientos_de_cuero = true;
        }else{
            this.asientos_de_cuero = false;
        }
        
    }
    
    // SETTER
    public void configura_climatizador(String climatizador){
       
       if(climatizador.equalsIgnoreCase("si")){
           
           this.climatizador = true;
           
       }else{
           this.climatizador = false;
       }
       
   }
}
    

