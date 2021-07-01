import java.util.Random;

public class Vehicle {
    protected String license;
    protected Strategy strategyRuns = new OperationRuns();
    protected boolean locked = true;
    
    /** 
     * @return String
     * 
     */
    public String getLicense() {
        return license;
    }
    public boolean getLocked(){
        return this.locked;
    }
    public void setLocked(boolean b){
        this.locked = b;
    }
    public void unlocked() {
        setLocked(false);
        System.out.println(this + " unlocked");
    }
    // TuneUp method on Vehicle is executed by Strategy pattern
    public void executeRunStrategy() {
        strategyRuns.doOperation(this);
    }
    //Special case for wash command
    public void shines() {
        Random r = new Random();
        if (r.nextDouble() < 0.3) {
            this.sparkles();
        }
        else {
            System.out.println(this + " shines");
        }
    }
    public void sparkles() {
        System.out.println(this + " sparkles");
    }
    
    /** 
     * @return boolean
     */
    public boolean drives() {
        System.out.println(this + " driven");
        return true;
    }
    public void locked() {
        setLocked(true);
        System.out.println(this + " locked");
    }
    
    /** 
     * @return String
     */
    public String toString() {
        return "Vehicle " + license;
    }

}