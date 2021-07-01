// Observer Pattern
interface MyObservable {
    void notifyObserver(Object o) throws NoSuchMethodException, SecurityException;
    void notifyObserver();

}