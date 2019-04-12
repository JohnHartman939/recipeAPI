package recipe.objects;

import java.io.Serializable;

public class StepKey implements Serializable {

    private int stepNumber;
    private int recipeId;

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setrecipeId(int recipeId) {
        this.recipeId = recipeId;
    }
}
