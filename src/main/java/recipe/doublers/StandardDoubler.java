package recipe.doublers;

import recipe.DTOs.IngredientDTO;

public class StandardDoubler implements DoublerInterface{

    public void doubleIngredient(IngredientDTO ingredientDTO) {
        ingredientDTO.setQuantity(ingredientDTO.getQuantity()*2);
    }
}
