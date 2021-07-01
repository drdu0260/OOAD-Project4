public class CarFactory {
    /** 
     * @param carType
     * @return Car
     */
    public static Car getCar(String carType){
        if(carType == null){
           return null;
        }		
        if(carType.equalsIgnoreCase("Hatchback")){
           return new Hatchback();
           
        } else if(carType.equalsIgnoreCase("SUV")){
           return new SUV();
           
        } else if(carType.equalsIgnoreCase("Wagon")){
           return new Wagon();
        }
        else if(carType.equalsIgnoreCase("Convertible")){
            return new Convertible();
        }
        return null;
     }
}