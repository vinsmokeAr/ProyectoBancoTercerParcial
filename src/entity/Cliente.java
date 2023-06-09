package entity;

//import java.util.ArrayList;

public class Cliente extends Persona{
    private String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    public Cliente(String RFC, String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
        this.RFC = RFC;
    }

  
}

