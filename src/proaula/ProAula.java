
package proaula;

import proaula.clases.Cliente;
import proaula.clases.ventanasGui.InterfazCine;



public class ProAula {

    
    public static void main(String[] args) {        
      
        InterfazCine v = new InterfazCine();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        v.setExtendedState(5);
        
        /////Cliente cliente = new Cliente("Maria", "Jose", 18, "maria@hotmail.com", "3016634773", "1043", "123");               
        System.out.println("");
       
    }
    
}
