package ecuacarrental;
/**
 * @author pablo
 */
public class Turismo extends Vehiculo {
    //SUBCLASE
    private int puertas;
    private boolean marchaAutomatica;
    
    //set
    public Turismo(String matricula, 
            String marca, 
            String modelo, 
            String color, 
            double tarifa, 
            boolean disponible,
            int puertas, 
            boolean marchaAutomatica) {
        super(matricula, marca, modelo, color, tarifa, disponible); //inicializa los atributos heredados
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }
    
    //get
    public int getPuertas() {
        return this.puertas;
    }
    
    public boolean getMarchaAutomatica() {
        return this.marchaAutomatica;
    }
    @Override
    public String getAtributos() {
       

        return super.getAtributos() + 
                " Puertas: " + this.puertas + 
                " Marcha automática: " + this.marchaAutomatica;
    
    }
    
}
