
package proaula.clases;


public class Cliente extends Persona {

    private static int numClien;
    
        public Cliente(String nombre, String apellido, int edad, String correo, String celular, String cedula, String contraseña) {
        super(nombre, apellido, edad, correo, celular, cedula, contraseña);
        Cliente.numClien++;
    }

    public static int getNumClien() {
        return numClien;
    }


    public Cliente() {
    }
   
    
}
