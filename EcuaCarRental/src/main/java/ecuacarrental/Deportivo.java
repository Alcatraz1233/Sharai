package ecuacarrental;
/**
 * @author pablo
 */
public class Deportivo extends Vehiculo {
    //SUBCLASE
    private int cilindrada; //cm3
    
    public Deportivo(String matricula, 
            String marca, 
            String modelo, 
            String color, 
            double tarifa,
            boolean disponible,
            int cilindrada) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.cilindrada = cilindrada;
    }
    
    //get
    public int getCilindrada() {
        return this.cilindrada;
    }
    
    @Override
    public String getAtributos() {
        
        return super.getAtributos() + 
                " Cilindrada (cm3): " + this.cilindrada;}
       
        
    
}
