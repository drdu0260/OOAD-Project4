// Observer pattern 
interface MyObserver {
    void update(MyObservable o, Object arg) throws NoSuchMethodException, SecurityException;
    void update(MyObservable o);

}