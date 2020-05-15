package recipe.Factories.objectFactories;

import recipe.DTOs.StepDTO;
import recipe.objects.Steps;

public class StepFactory {
    public Steps makeStep(StepDTO stepDTO){
        return new Steps(stepDTO);
    }
}
