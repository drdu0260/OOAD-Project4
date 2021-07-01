public class TruckFactory {
    
    /** 
     * @param truckType
     * @return Truck
     */
    public static Truck getTruck(String truckType){
        if(truckType == null){
           return null;
        }		
        if(truckType.equalsIgnoreCase("Pickup")){
           return new Pickup();
           
        } else if(truckType.equalsIgnoreCase("Delivery")){
           return new Delivery();
           
        } else if(truckType.equalsIgnoreCase("Monster")){
           return new Monster();
        }
        return null;
     }
}