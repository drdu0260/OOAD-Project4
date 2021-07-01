//The Abstract component that we are decorating
public abstract class CarWash {
    String desc = "";
    public String washCar(){
        return desc;
    }
}

//The Concrete component that we start with when decorating
class WashVehicle extends CarWash{
    WashVehicle(){}
    public String washCar(){
        return "";
    }
}
