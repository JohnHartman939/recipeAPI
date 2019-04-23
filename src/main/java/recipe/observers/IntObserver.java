package recipe.observers;

import recipe.subject.SampleSubjectPush;

public class IntObserver implements Observer {
    private int testInt;
    private SampleSubjectPush sampleSubjectPush;

    public IntObserver(SampleSubjectPush subject){
        sampleSubjectPush=subject;
        subject.addObserver(this);
    }

    public void update(int testInt, String testString) {
        this.testInt=testInt;
        System.err.println("i am int TestInt was updated to " + testInt);
    }

    public int getTestInt(){
        return testInt;
    }
}
