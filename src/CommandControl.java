import java.lang.reflect.InvocationTargetException;


public class CommandControl{
    Command slot;

    public CommandControl(){}

    //Sets the command to be run next
    public void setCommand(Command command){
        slot = command;
    }

    //executes the command saved
    public void runCommand() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        slot.execute();
    }

    
}

//The interface for command pattern
interface Command
{
    public void execute() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException;
}

//Implementation of the unlock command
class UnlockCommand implements Command{
    Mechanic m;
    Vehicle v;
    public UnlockCommand(Mechanic m, Vehicle v){
        this.m = m;
        this.v = v;
    }
    public void execute() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Mechanic.class.getMethod("unlock", Vehicle.class).invoke(m, v);
    }
}

//Implementation of the wash command
class WashCommand implements Command{
    Mechanic m;
    Vehicle v;
    public WashCommand(Mechanic m, Vehicle v){
        this.m = m;
        this.v = v;
    }
    public void execute() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        Mechanic.class.getMethod("wash", Vehicle.class).invoke(m, v);
    }
}

//Implementation of the TuneUp command
class TuneUpCommand implements Command{
    Mechanic m;
    Vehicle v;
    public TuneUpCommand(Mechanic m, Vehicle v){
        this.m = m;
        this.v = v;
    }
    public void execute() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        Mechanic.class.getMethod("tuneUp", Vehicle.class).invoke(m, v);
    }
}

//Implementation of the TestDrive command
class TestDriveCommand implements Command{
    Mechanic m;
    Vehicle v;
    public TestDriveCommand(Mechanic m, Vehicle v){
        this.m = m;
        this.v = v;
    }
    public void execute() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        if (v.getClass().equals(Monster.class)){
            boolean result = (boolean) Mechanic.class.getMethod("testDrive", Vehicle.class).invoke(m, v);
                
                if(!result){//if the monster truck crashes, exit the program
                   System.out.println("Monster truck has crashed. Your day is over.");
                   System.exit(0);
                }
        }else{
            Mechanic.class.getMethod("testDrive", Vehicle.class).invoke(m, v);
        }
    }
}

//Implementation of the LockUp command

class LockCommand implements Command{
    Mechanic m;
    Vehicle v;
    public LockCommand(Mechanic m, Vehicle v){
        this.m = m;
        this.v = v;
    }
    public void execute() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        Mechanic.class.getMethod("lockUp", Vehicle.class).invoke(m, v);
    }
}