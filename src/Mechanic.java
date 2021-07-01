import java.util.ArrayList;
//import java.util.Random;
//Extension of Abstract class GarageEmployee
public class Mechanic extends GarageEmployee implements MyObservable {
    ArrayList<MyObserver> observerList = new ArrayList<MyObserver>();
    //Constructor to generate Mechanic name
    public Mechanic(GarageAnnouncer GA) {
        if (observerList.size() > 0) {
            observerList.remove(0);
        }
        //observerList.add(GA);
        /*String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand = new Random(); 
        employeeName = "";
        for (int i=0; i<5; i++) {
            employeeName = employeeName + letters.charAt(rand.nextInt(letters.length()));
        }*/
        employeeName = Singleton.getName();
    }
    
    /** 
     * @param o
     * @throws SecurityException
     * @throws NoSuchMethodException
     */
    //Observer Pattern applied
    public void notifyObserver(Object o) throws NoSuchMethodException, SecurityException {
        for (int i=0; i<observerList.size(); i++) {
            observerList.get(i).update(this, o);
        }
    }
    public void notifyObserver() {
        for (int i=0; i<observerList.size(); i++) {
            observerList.get(i).update(this);
        }
    }

    /** 
     * @param vehicle
     */
    //After each command by mechanic, methods of Vehicle class are invoked for each vehicle object (Encapsulation)
    @Override
    public void unlock(Vehicle vehicle) {
        //Takes vehcile instance from driver class. This is abstraction and polymorphism
        System.out.println("Mechanic " + employeeName + " unlocks " + vehicle);
        //Encapsulation
        vehicle.unlocked();
    }
    
    /** 
     * @param vehicle
     */
    public void tuneUp(Vehicle vehicle) {
        System.out.println("Mechanic " + employeeName + " tuneup " + vehicle);
        // Strategy Pattern is applied
        vehicle.executeRunStrategy();
    }
    
    /** 
     * @param vehicle
     */
    public void wash(Vehicle vehicle) {
        System.out.println("Mechanic " + employeeName + " washes " + vehicle);
        if(vehicle.getClass().equals(Monster.class)){
            CarWash cw = new WashVehicle();
            cw = new Soap(vehicle, cw);
            cw = new Scrub(vehicle, cw);
            cw = new Rinse(vehicle, cw);
            cw = new Dry(vehicle, cw);
            cw = new Wax(vehicle, cw);
            cw = new Wax(vehicle, cw);
            cw = new Polish(vehicle, cw);
            cw = new Detail(vehicle, cw);
            System.out.print(cw.washCar());
        }else if(vehicle.getClass().equals(Convertible.class)){
            CarWash cw = new WashVehicle();
            cw = new Soap(vehicle, cw);
            cw = new Scrub(vehicle, cw);
            cw = new Rinse(vehicle, cw);
            cw = new Dry(vehicle, cw);
            cw = new Wax(vehicle, cw);
            cw = new Detail(vehicle, cw);
            cw = new Detail(vehicle, cw);
            System.out.print(cw.washCar());
        }else{
            CarWash cw = new WashVehicle();
            cw = new Soap(vehicle, cw);
            cw = new Scrub(vehicle, cw);
            cw = new Rinse(vehicle, cw);
            cw = new Dry(vehicle, cw);
            System.out.print(cw.washCar());
        }
        vehicle.shines();
    }
    
    /** 
     * @param vehicle
     * @return boolean
     */
    public boolean testDrive(Vehicle vehicle) {
        System.out.println("Mechanic " + employeeName + " drives " + vehicle);
        return vehicle.drives();
    }
    
    /** 
     * @param vehicle
     */
    public void lockUp(Vehicle vehicle) {
        System.out.println("Mechanic " + employeeName + " locksUp " + vehicle);
        vehicle.locked();
    }

   



    
    
}