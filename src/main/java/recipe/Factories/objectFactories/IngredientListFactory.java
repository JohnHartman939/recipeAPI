package recipe.Factories.objectFactories;

import recipe.DTOs.IngredientDTO;
import recipe.objects.IngredientsList;

public class IngredientListFactory {

    public IngredientsList makeIngredientsList(IngredientDTO ingredientDTO){
        return new IngredientsList(ingredientDTO);
    }
}
