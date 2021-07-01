public class TrainFactory {
    
    public static Train getTrain(String trainType){
        if(trainType == null){
           return null;
        }		
        if(trainType.equalsIgnoreCase("Expresstrain")){
           return new Expresstrain();
           
        } else if(trainType.equalsIgnoreCase("Freighttrain")){
           return new Freighttrain();
        } 
        return null;
     }
}