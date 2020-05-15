package recipe.scaler.doublers;

import recipe.DTOs.IngredientDTO;

public interface DoublerInterface {
    void setNextDoubler(DoublerInterface nextDoubler);
    void doubleIngredient(IngredientDTO ingredientDTO);
    boolean canDouble(String ingredientUnit);
}
