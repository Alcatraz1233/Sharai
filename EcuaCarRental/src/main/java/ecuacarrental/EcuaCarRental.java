package ecuacarrental;

import java.util.Scanner;

public class EcuaCarRental {

    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        Turismo Jeep = new Turismo("PFS-3456", "MERCEDES BENZ", "GL 300", "AZUL", 150, true, 5, true);
        Furgoneta f1 = new Furgoneta("PGT-001", "Volkswagen", "Nuevo Multivan", "Rojo", 15, true, 200, 6);
        Deportivo d1 = new Deportivo("PGT-002", "Laborghini", "LAmborghini Radon", "Verde", 12, true, 5);
        do {
            System.out.println("Escoja un Vehiculo"); //El usuario debe escojer uno de los tres modelos de vehiculos
            System.out.println("1. Turismo");
            System.out.println("2. Furgoneta");
            System.out.println("3. Deportivo");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                //CLASE PRINCIPAL
                case 1:
                    if(Jeep.isDisponible()==true){
                    System.out.println("Turismo: \n" + Jeep.getAtributos());
                    Jeep.cambioDispon();}
                    else{
                        System.out.println("Vehiculo Alquilado");
                            }
                    break;
                case 2:
                    if(f1.isDisponible()==true){
                    System.out.println("Furgoneta: \n" + f1.getAtributos());
                    
                    f1.cambioDispon();}
                    else{
                            System.out.println("Vehiculo Alquilado");}
                    break;
                case 3:
                    if(d1.isDisponible()==true){
                    System.out.println("Deportivo: \n" + d1.getAtributos());
                    d1.cambioDispon();}
                    else{
                    System.out.println("Vehiculo Alquilado");
                            
                    }
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        } while (opcion != 4);
    }
}
