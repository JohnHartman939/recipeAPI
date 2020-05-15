package recipe.Factories.DTOFactories;

import recipe.DTOs.StepDTO;
import recipe.objects.Steps;

public class StepDTOFactory {

    public StepDTO makeStepDTO(Steps step){
        return new StepDTO(step);
    }
}
