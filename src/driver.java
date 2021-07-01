import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//import jdk.internal.jshell.tool.resources.version;

public class driver {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, FileNotFoundException {
        System.out.println("A Day at the Garage");
        
        //Gets User's name from input
        Singleton.getNameFromUser();

        //Creating the instance of garage class
        Garage g = new Garage();

        Mechanic m = new Mechanic(g.GA);
        System.out.println("Mechanic " + m.employeeName + " arrives at Garage on Day ");
        int vehicleCount = g.vehicleList.size();

        CommandControl cc = new CommandControl();

        //while time < 8pm, 8PM = 20 hrs
        boolean failedOperation;
        int endTime = 20;//8pm
        int startTime = 9;//9am
        int currTime = startTime; 
        while(currTime < endTime){
            failedOperation = false;
            System.out.println("Current time is: "+currTime+":00");
            int action = Singleton.getActionFromUser();

            if(action == 1){//Unlock
                //Observer Pattern is applied
                Method a = Mechanic.class.getMethod("unlock", Vehicle.class);
                m.notifyObserver(a.getName());
                for (int j=0; j<vehicleCount; j++) {
                    //Creating vehicle identity for all vehicles in the garage
                    Vehicle v = g.vehicleList.get(j);
                    cc.setCommand(new UnlockCommand(m,v));
                    cc.runCommand();
                }
            }else if(action == 2){//Wash
                Method a = Mechanic.class.getMethod("wash", Vehicle.class);
                m.notifyObserver(a.getName());
                for (int j=0; j<vehicleCount; j++) {
                    //Creating vehicle identity for all vehicles in the garage
                    Vehicle v = g.vehicleList.get(j);
                    if(v.getLocked()){
                        failedOperation = true;
                        System.out.println("Please unlock the vehicles before continuing with the other tasks.");
                        break;
                    }else{
                        cc.setCommand(new WashCommand(m,v));
                        cc.runCommand();
                    }
                }
            }else if(action == 3){//Tune Up
                Method a = Mechanic.class.getMethod("tuneUp", Vehicle.class);
                m.notifyObserver(a.getName());
                for (int j=0; j<vehicleCount; j++) {
                    //Creating vehicle identity for all vehicles in the garage
                    Vehicle v = g.vehicleList.get(j);
                    if(v.getLocked()){
                        failedOperation = true;
                        System.out.println("Please unlock the vehicles before continuing with the other tasks.");
                        break;
                    }else{
                        cc.setCommand(new TuneUpCommand(m,v));
                        cc.runCommand();
                    }
                }
            }else if(action == 4){//Test Drive
                Method a = Mechanic.class.getMethod("testDrive", Vehicle.class);
                m.notifyObserver(a.getName());
                for (int j=0; j<vehicleCount; j++) {
                    //Creating vehicle identity for all vehicles in the garage
                    Vehicle v = g.vehicleList.get(j);
                    if(v.getLocked()){
                        failedOperation = true;
                        System.out.println("Please unlock the vehicles before continuing with the other tasks.");
                        break;
                    }else{
                        cc.setCommand(new TestDriveCommand(m,v));
                        cc.runCommand();
                    }
                }
            }else if(action == 5){//Lock
                Method a = Mechanic.class.getMethod("lockUp", Vehicle.class);
                m.notifyObserver(a.getName());
                for (int j=0; j<vehicleCount; j++) {
                    //Creating vehicle identity for all vehicles in the garage
                    Vehicle v = g.vehicleList.get(j);
                    cc.setCommand(new LockCommand(m,v));
                    cc.runCommand();
                }
            }else if(action == 6){//Leave Garage for the day
                if (g.vehicleList.get(1).getLocked()){
                    System.out.println("Thank you for work at the Garage today. See you again tomorrow!");
                    break;
                }else{
                    failedOperation = true;
                    System.out.println("Please remember to lock the vehicles before leaving the Garage!");
                }
                
            }else{//invalid input
                System.out.println("The input you entered is invalid. Please try again.");
            }
            //time does not mve forward if there is an error in input
            //or failed to unlock vehicles before trying an operation
            if (!failedOperation){ 
                currTime++;
            }
            
        }
        Singleton.scan.close();
    }
}