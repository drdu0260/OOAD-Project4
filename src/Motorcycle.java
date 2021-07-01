import java.util.Random;

//Inherited class
class Motorcycle extends Vehicle {
    public Motorcycle(){

    }
}
class Bike extends Motorcycle{
    public String toString() {
        return "Bike " + this.license;
    }
    // Constructor generating license number for each Bike instance
    public Bike() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "B";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }         
    }
}
class Trike extends Motorcycle{
    public String toString() {
        return "Trike " + this.license;
    }
    // Constructor generating license number for each Bike instance
    public Trike() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "T";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }
    }
}
class Sidecar extends Motorcycle{
    public String toString() {
        return "Sidecar " + this.license;
    }
    // Constructor generating license number for each Sidecar instance
    public Sidecar() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "S";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }
    }
}