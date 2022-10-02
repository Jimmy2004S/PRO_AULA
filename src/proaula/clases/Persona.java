

package proaula.clases;


public class Persona {
    protected  int id;
    protected static int conClie;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String correo; 
    protected String celular;
    protected String cedula;
    protected String contraseña;
    protected String genero;

    public Persona( String nombre, String apellido, int edad, String correo, String celular, String cedula, String contraseña) {
        this.id = ++Persona.conClie;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.celular = celular;
        this.cedula = cedula;
        this.contraseña = contraseña;
    }
    
    public Persona(){
        this.id = ++Persona.conClie;
    }
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", edad=").append(edad);
        sb.append(", correo=").append(correo);
        sb.append(", celular=").append(celular);
        sb.append(", cedula=").append(cedula);
        sb.append(", contrase\u00f1a=").append(contraseña);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }


    
    
    
}
