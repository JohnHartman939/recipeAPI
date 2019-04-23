package recipe.halvers;

import recipe.DTOs.IngredientDTO;

public class StandardHalver implements HalverInterface{

    public void halveIngredient(IngredientDTO ingredientDTO) {
        ingredientDTO.setQuantity(ingredientDTO.getQuantity()/2);
    }
}
