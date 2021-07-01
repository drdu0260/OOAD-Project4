// Observer class observes Mechanic class
public class GarageAnnouncer extends GarageEmployee implements MyObserver {

    /** 
     * @param o
     * @param arg
     * @throws NoSuchMethodException
     * @throws SecurityException
     */
    public void update(MyObservable o, Object arg) throws NoSuchMethodException, SecurityException {
        // if (o.getClass().getMethod("isMechanic") != null) {
            System.out.println("Hi, this is the Garage Announcer. The Mechanic is about to " + arg + " the vehicles");
        // }
        // else {
        //     System.out.println("Hi, this is the Garage Announcer. The time change is " + arg);
        // }
        // if (o.isMechanic()) {
        //     
        // }
    }

    
    /** 
     * @param o
     */
    @Override
    public void update(MyObservable o) {
        System.out.println("Hi, this is the Garage Announcer. The Garage is closing");
    }    
}