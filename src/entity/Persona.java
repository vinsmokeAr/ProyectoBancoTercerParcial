
package entity;


public class Persona {
   
   private String nombre;
   private String telefono;
   private String direccion;
    /*ArrayList<Cuenta> misCuentas();
    
    public Cliente() {
        misCuentas = new ArrayList<Cuenta>();
    } // Se creó el método constructor vacío 
    
    public void addCuenta(Cuenta c){
        misCuentas.add(c);
    } */

    public Persona( String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
    //Métodos Get y set
   
    public String getNombre() {
        return nombre;
    } 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
