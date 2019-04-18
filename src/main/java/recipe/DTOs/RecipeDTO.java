package recipe.DTOs;

import recipe.objects.Recipe;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RecipeDTO implements RecipeDTOInterface {
    private int recipeId;
    private String recipeName;
    private LocalDateTime dateAdded;
    private List<IngredientDTO> ingredientList=new ArrayList<>();
    private List<StepDTO> stepList= new ArrayList<>();

    public RecipeDTO(Recipe recipe){
        this.recipeId=recipe.getRecipeId();
        this.recipeName=recipe.getRecipeName();
        this.dateAdded=recipe.getDateAdded();

    }



    public void setRecipeId(int recipeId) {
        this.recipeId=recipeId;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName=recipeName;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded=dateAdded;
    }

    public void setIngredientList(List<IngredientDTO> ingredientList) {
        this.ingredientList=ingredientList;
    }

    public void setStepList(List<StepDTO> steps) {
        this.stepList=steps;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public List<IngredientDTO> getIngredientList() {
        return ingredientList;
    }

    public List<StepDTO> getStepList() {
        return stepList;
    }
}
