public class MotocycleFactory {

    public static Motorcycle getMotorcycle(String motorcycleType){
        if(motorcycleType == null){
           return null;
        }		
        if(motorcycleType.equalsIgnoreCase("Bike")){
           return new Bike();
           
        } else if(motorcycleType.equalsIgnoreCase("Trike")){
           return new Trike();
           
        } else if(motorcycleType.equalsIgnoreCase("Sidecar")){
           return new Sidecar();
        }
        return null;
     }
}