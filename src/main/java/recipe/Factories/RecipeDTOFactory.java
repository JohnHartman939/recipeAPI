package recipe.Factories;

import recipe.DTOs.RecipeDTO;
import recipe.objects.Recipe;


public class RecipeDTOFactory {

    public RecipeDTO makeRecipeDTO(Recipe recipe){
        return new RecipeDTO(recipe);
    }


}
