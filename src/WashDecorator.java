
public abstract class WashDecorator extends CarWash{
    public abstract String washCar();

}


//Each class below is one of the decorators.
class Soap extends WashDecorator{
    Vehicle v;
    CarWash carwash;
    public Soap(Vehicle v, CarWash carwash){
        this.v = v;
        this.carwash = carwash;
    }
    public String washCar(){
        return carwash.washCar() + v +" is soaped\n";
    }
}

class Scrub extends WashDecorator{
    Vehicle v;
    CarWash carwash;
    public Scrub(Vehicle v, CarWash carwash){
        this.v = v;
        this.carwash = carwash;
    }
    public String washCar(){
        return carwash.washCar() + v +" is scrubed\n";
    }
}

class Rinse extends WashDecorator{
    Vehicle v;
    CarWash carwash;
    public Rinse(Vehicle v, CarWash carwash){
        this.v = v;
        this.carwash = carwash;
    }
    public String washCar(){
        return carwash.washCar() + v +" is rinsed\n";
    }
}

class Dry extends WashDecorator{
    Vehicle v;
    CarWash carwash;
    public Dry(Vehicle v, CarWash carwash){
        this.v = v;
        this.carwash = carwash;
    }
    public String washCar(){
        return carwash.washCar() + v +" is dried\n";
    }
}

class Wax extends WashDecorator{
    Vehicle v;
    CarWash carwash;
    public Wax(Vehicle v, CarWash carwash){
        this.v = v;
        this.carwash = carwash;
    }
    public String washCar(){
        return carwash.washCar() + v +" is waxed\n";
    }
}

class Polish extends WashDecorator{
    Vehicle v;
    CarWash carwash;
    public Polish(Vehicle v, CarWash carwash){
        this.v = v;
        this.carwash = carwash;
    }
    public String washCar(){
        return carwash.washCar() + v +" is polished\n";
    }
}

class Detail extends WashDecorator{
    Vehicle v;
    CarWash carwash;
    public Detail(Vehicle v, CarWash carwash){
        this.v = v;
        this.carwash = carwash;
    }
    public String washCar(){
        return carwash.washCar() + v +" is detailed\n";
    }
}