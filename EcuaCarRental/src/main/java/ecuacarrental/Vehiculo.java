package ecuacarrental;
/**
 * @author pablo
 */
public class Vehiculo {
    //SUPERCLASE
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa=0.0;
    private boolean disponible;
    
    //set
    public Vehiculo(String matricula, 
            String marca, 
            String modelo, 
            String color, 
            double tarifa,
            boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible=disponible;
    }
    //get
    public String getAtributos() {
        return "Matrícula: " + this.matricula +
                " Modelo: " + this.marca + " " + this.modelo +
                " Color: " + this.color + 
                " Tarifa: " + this.tarifa + 
                " Disponible: " + this.disponible;
    }
    public boolean cambioDispon(){
    if(disponible==false){    
    return false;
    }
    else{
       disponible=false;
    return true;
    }
    }

    public boolean isDisponible() {
        return disponible;
    }
    
}
