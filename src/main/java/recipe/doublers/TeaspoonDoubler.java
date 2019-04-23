package recipe.doublers;

import recipe.DTOs.IngredientDTO;

public class TeaspoonDoubler implements DoublerInterface {

    public void doubleIngredient(IngredientDTO ingredientDTO) {
        if(ingredientDTO.getQuantity()==1.5){
            ingredientDTO.setQuantity(1);
            ingredientDTO.setUnit("Tbsp");
        }
        else ingredientDTO.setQuantity(ingredientDTO.getQuantity()*2);
    }
}
