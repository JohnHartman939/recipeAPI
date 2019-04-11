package recipe.objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

//@Embeddable
public class StepKey implements Serializable {

    private int stepNumber;
    private int recipeId;
//    public StepKey(){}
//
//
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
