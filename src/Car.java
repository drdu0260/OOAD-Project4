import java.util.Random;
//Inherited class
class Car extends Vehicle {
    public Car() {
    }
}

class Hatchback extends Car {
    public String toString() {
        return "Hatchback " + this.license;
    }
    
    // Constructor generating license number for each Hatchback instance
    public Hatchback() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "H";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }
    }
}
class SUV extends Car {
    public String toString() {
        return "SUV " + this.license;
    }
    // Constructor generating license number for each SUV instance
    public SUV() {
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
class Wagon extends Car {
    public String toString() {
        return "Wagon " + this.license;
    }
    public Wagon() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "W";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }
    }
}
class Convertible extends Car {
    public String toString() {
        return "Convertible " + this.license;
    }
    public Convertible() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "C";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }
    }
}
