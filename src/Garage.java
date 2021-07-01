//package OOAD;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

//Garage of vehicles creation
public class Garage {
    ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
    Random r = new Random();
    GarageAnnouncer GA = new GarageAnnouncer();
    GarageClock GC = new GarageClock();
    public Garage() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
       
        //hashMap creation
        HashMap<String,Class<?>> hashMap = new HashMap<String,Class<?>>();
        hashMap.put("Bike", Motorcycle.class);
        hashMap.put("Trike", Motorcycle.class);
        hashMap.put("Sidecar", Motorcycle.class);
        hashMap.put("Hatchback", Car.class);
        hashMap.put("SUV", Car.class);
        hashMap.put("Wagon", Car.class);
        hashMap.put("Convertible", Car.class);
        hashMap.put("Pickup", Truck.class);
        hashMap.put("Delivery", Truck.class);
        hashMap.put("Monster", Truck.class);
        hashMap.put("Expresstrain", Train.class);
        hashMap.put("Freighttrain", Train.class);

        // Creating the vehicle objects of each of sub classes of Vehicle class
        for (String vehicleType : hashMap.keySet()) { 
            /*int rand = r.nextInt(2)+3;
            for (int i=0; i<rand; i++) {
                addVehicleToGarage(vehicleType, hashMap);
            }*/
            addVehicleToGarage(vehicleType, hashMap);
        }
    }

    
    /** 
     * @param hashMap
     */
    public void addVehicleToGarage (String vehicleType, HashMap<String,Class<?>> hashMap) {
        Vehicle vehicleObj;
        if (hashMap.get(vehicleType) == Motorcycle.class) {
            vehicleObj = MotocycleFactory.getMotorcycle(vehicleType);
        }
        else if (hashMap.get(vehicleType) == Car.class) {
            vehicleObj = CarFactory.getCar(vehicleType);
        }
        else if (hashMap.get(vehicleType) == Truck.class) {
            vehicleObj = TruckFactory.getTruck(vehicleType);
        }
        else {
            vehicleObj = TrainFactory.getTrain(vehicleType);
        }
        vehicleList.add(vehicleObj);
    }
}