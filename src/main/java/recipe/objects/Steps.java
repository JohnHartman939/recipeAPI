package recipe.objects;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Steps")
@IdClass(StepKey.class)
public class Steps implements Serializable{
    @Id
    @Column(name = "recipe_id")
    private int recipeId;

    @Id
    @Column(name = "step_number")
    private int stepNumber;

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }
}
