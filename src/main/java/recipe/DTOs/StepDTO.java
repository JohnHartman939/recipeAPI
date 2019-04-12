package recipe.DTOs;

import recipe.objects.Steps;

public class StepDTO {
    public StepDTO(Steps step){
        this.setStepNumber(step.getStepNumber());
        this.setDescription(step.getDescription());
    }

    private int stepNumber;
    private String description;

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
