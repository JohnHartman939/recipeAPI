package recipe.Factories.objectFactories;

import recipe.DTOs.IngredientDTO;
import recipe.objects.Ingredients;

public class IngredientFactory {
    public Ingredients makeIngredient(IngredientDTO ingredientDTO){
        return new Ingredients(ingredientDTO);
    }
}
