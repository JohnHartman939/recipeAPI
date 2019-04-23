package recipe.observers;

import recipe.subject.SampleSubjectPush;

public class StringObserver implements Observer {

    private String testString;
    private SampleSubjectPush sampleSubjectPush;

    public StringObserver(SampleSubjectPush subject){
        sampleSubjectPush=subject;
        subject.addObserver(this);
    }
    public void update(int testInt, String testString) {
        this.testString=testString;
        System.err.println("i am string TestString was updated to " + testString);
    }

    public String getTestString(){
        return testString;
    }

}
