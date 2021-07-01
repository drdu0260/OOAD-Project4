import java.util.Random;
//Inherited class
class Train extends Vehicle {
    public Train() {
    }
}
class Expresstrain extends Train {
    public String toString() {
        return "Expresstrain " + this.license;
    }
    public Expresstrain() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "E";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }
    }
}
class Freighttrain extends Train {
    public String toString() {
        return "Freighttrain " + this.license;
    }
    public Freighttrain() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "F";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }
    }
}