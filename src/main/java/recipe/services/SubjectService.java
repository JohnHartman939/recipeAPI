package recipe.services;

import org.springframework.stereotype.Service;
import recipe.observers.IntObserver;
import recipe.observers.Observer;
import recipe.observers.StringObserver;
import recipe.subject.SampleSubjectPush;

@Service
public class SubjectService {

    private SampleSubjectPush sampleSubjectPush = new SampleSubjectPush();
    private Observer intObserver= new IntObserver(sampleSubjectPush);
    private Observer stringObserver = new StringObserver(sampleSubjectPush);

    public void updateSubjectTestInt(int testInt){
        sampleSubjectPush.setTestInt(testInt);
    }

    public void updateSubjectTestString(String testString){
        sampleSubjectPush.setTestString(testString);
    }

}
