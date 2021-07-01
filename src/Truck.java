import java.util.Random;
//Inherited class
class Truck extends Vehicle {
    public Truck() {
    }
}
class Pickup extends Truck {
    public String toString() {
        return "Pickup " + this.license;
    }
    public Pickup() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "P";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }
    }
}
class Delivery extends Truck {
    public String toString() {
        return "Delivery " + this.license;
    }
    public Delivery() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "D";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }
    }
}
class Monster extends Truck {
    public String toString() {
        return "Monster " + this.license;
    }
    public Monster() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        Random random = new Random();
        license = "M";
        for (int i=0; i<2; i++) {
            license = license + letters.charAt(random.nextInt(letters.length()));
        }
        for (int i=0; i<3; i++) {
            license = license + numbers.charAt(random.nextInt(numbers.length()));
        }
    }
    // Overriding the drives method of Vehicle class (Inheritance)
    @Override
    public boolean drives() {
        Random r = new Random();
        if (r.nextDouble() < 0.2) {
            this.crashes();
            return false;
        }
        else {
            System.out.println(this + " drives");
            return true;
        }
    }
    private void crashes() {
        System.out.println(this + " crashes");
    }
}