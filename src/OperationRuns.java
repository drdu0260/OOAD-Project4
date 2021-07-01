
import java.util.Random;

// Runs method in Vehicle class is implemented using Strategy Pattern
public class OperationRuns implements Strategy{
    Random r = new Random();
    
    /** 
     * @param vehicle
     */
    public void doOperation(Vehicle vehicle) {
        Double random = r.nextDouble();
        if (random < 0.25 && vehicle.getClass().getSuperclass().equals(Car.class)) {
            System.out.println(vehicle + " sputters");
        }
        else {
            System.out.println(vehicle + " runs");
        }
    }
    
}