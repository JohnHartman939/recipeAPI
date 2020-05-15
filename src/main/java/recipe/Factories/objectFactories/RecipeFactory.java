package recipe.Factories.objectFactories;

import recipe.DTOs.RecipeDTO;
import recipe.objects.IngredientsList;
import recipe.objects.Recipe;
import recipe.objects.Steps;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RecipeFactory {

    public Recipe makeRecipe(RecipeDTO recipeDTO){
        return new Recipe(recipeDTO);
    }

}
