package recipe.halvers;

import recipe.DTOs.IngredientDTO;

public class TablespoonHalver implements HalverInterface{

    public void halveIngredient(IngredientDTO ingredientDTO) {
        if(ingredientDTO.getQuantity()==1){
            ingredientDTO.setQuantity((float)1.5);
            ingredientDTO.setUnit("tsp");
        }
        else ingredientDTO.setQuantity(ingredientDTO.getQuantity()/2);
    }
}
