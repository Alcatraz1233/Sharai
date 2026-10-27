package ecuacarrental;
/**
 * @author pablo
 */
public class Furgoneta extends Vehiculo {
    //SUBCLASE
    private double carga; //kilos
    private double volumen; //m3
    
    public Furgoneta(String matricula, 
            String marca, 
            String modelo, 
            String color, 
            double tarifa,
            boolean disponible,
            double carga, 
            double volumen) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }
    
    //get
    public double getCarga() {
        return this.carga;
    }
    
    public double getVolumen() {
        return this.volumen;
    }
    @Override
    public String getAtributos() {
        
        return super.getAtributos() + 
                " Carga (kg): " + this.carga + 
                " Volumen (m3): " + this.volumen;
    }
    
}
