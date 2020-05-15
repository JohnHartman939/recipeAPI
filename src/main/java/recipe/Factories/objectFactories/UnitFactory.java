package recipe.Factories.objectFactories;

import recipe.DTOs.IngredientDTO;
import recipe.objects.Unit;

public class UnitFactory {
    public Unit makeUnit(IngredientDTO ingredientDTO){
        return new Unit(ingredientDTO);
    }
}
