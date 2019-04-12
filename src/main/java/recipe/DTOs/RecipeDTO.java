package recipe.DTOs;

import recipe.Factories.IngredientDTOFactory;
import recipe.objects.IngredientsList;
import recipe.objects.Recipe;
import recipe.objects.Steps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RecipeDTO {
    private IngredientDTOFactory ingredientDTOFactory = new IngredientDTOFactory();

    public RecipeDTO(Recipe recipe){
        this.setRecipeId(recipe.getRecipeId());
        this.setRecipeName(recipe.getRecipeName());
        this.setDateAdded(recipe.getDateAdded());
        System.err.println(recipe.getIngredientsList().size());
        for(IngredientsList ingredient:recipe.getIngredientsList()){
            this.getIngredients().add(ingredientDTOFactory.makeIngredientDTO(ingredient));
        }
        for(Steps step:recipe.getStepsList()){
            this.getSteps().add(new StepDTO(step));
        }
    }

    private int recipeId;
    private String recipeName;
    private LocalDateTime dateAdded;
    private List<IngredientDTO> ingredients = new ArrayList<>();
    private List<StepDTO> steps = new ArrayList<>();


    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public List<IngredientDTO> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientDTO> ingredients) {
        this.ingredients = ingredients;
    }

    public List<StepDTO> getSteps() {
        return steps;
    }

    public void setSteps(List<StepDTO> steps) {
        this.steps = steps;
    }

    public void halveRecipe(){
        for(IngredientDTO ingredient:ingredients){
            ingredient.halveIngredient();
        }
    }

    public void doubleRecipe(){
        for(IngredientDTO ingredient:ingredients){
            ingredient.doubleIngredient();
        }
    }
}
