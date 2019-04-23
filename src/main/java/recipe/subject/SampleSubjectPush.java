package recipe.subject;

import recipe.observers.Observer;

import java.util.ArrayList;

public class SampleSubjectPush {
    private int testInt;
    private String testString;
    private ArrayList<Observer> observers;

    public SampleSubjectPush(){
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update(testInt,testString);
        }
    }

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) {
        this.testInt = testInt;
        System.err.println("i was updated observer count = " + observers.size());
        notifyObservers();
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
        notifyObservers();
    }
}
