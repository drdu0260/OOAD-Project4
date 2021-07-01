//import jdk.jfr.Timestamp;


import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class MyUnitTest{
    @Test
    public void test1(){
        //Testing the Singleton class 
        Singleton.name = "Bob";
        new Singleton();
        assertEquals(Singleton.getName(), "Bob");
    }

    @Test
    public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        Garage g = new Garage();
        Mechanic m = new Mechanic(g.GA);
        Vehicle v = new Vehicle();
        Command c = new UnlockCommand(m,v);
        CommandControl cc = new CommandControl();
        cc.setCommand(c);
        assertEquals(cc.slot, c);
    }

    @Test
    public void test3(){
        Vehicle vehicle = new Monster();
        CarWash cw = new WashVehicle();
        cw = new Soap(vehicle, cw);
        cw = new Scrub(vehicle, cw);
        assertEquals(vehicle +" is soaped\n"+ vehicle +" is scrubed\n", cw.washCar() );
    }

    @Test
    public void test4(){
        Vehicle v = new Hatchback();
        assertEquals("Hatchback "+v.getLicense(), v.toString());
    }

    @Test
    public void test5(){
        Vehicle v = new Convertible();
        v.unlocked();
        assertEquals(false, v.getLocked());
    }

    @Test
    public void test6() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        Garage g = new Garage();
        Mechanic m = new Mechanic(g.GA);
        Vehicle v = new Convertible();

        m.unlock(v);
        assertEquals(false, v.getLocked());
        m.lockUp(v);
        assertEquals(true, v.getLocked());
    }

    @Test
    public void test7(){
        Vehicle v = new Convertible();
        assertEquals(true, v.drives());
    }

    @Test
    public void test8() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        Singleton.name = "Joe";
        Garage g = new Garage();
        Mechanic m = new Mechanic(g.GA);

        assertEquals("Joe", m.employeeName);
    }

    @Test
    public void test9(){
        Vehicle vehicle = new Monster();
        CarWash cw = new WashVehicle();
        cw = new Scrub(vehicle, cw);
        cw = new Polish(vehicle, cw);
        assertEquals(vehicle +" is scrubed\n"+ vehicle +" is polished\n", cw.washCar() );
    }

    @Test
    public void test10(){
        CarWash cw = new WashVehicle();
        assertEquals("", cw.washCar() );
    }
}