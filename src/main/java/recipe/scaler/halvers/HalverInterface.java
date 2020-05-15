package recipe.scaler.halvers;

import recipe.DTOs.IngredientDTO;

public interface HalverInterface {
    void setNextHalver(HalverInterface nextHalver);
    void halveIngredient(IngredientDTO ingredientDTO);
    boolean canHalve(String ingredientUnit);}
