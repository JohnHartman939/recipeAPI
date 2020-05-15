package recipe.scaler.doublers;

import recipe.DTOs.IngredientDTO;

public class StandardDoubler implements DoublerInterface{

    private DoublerInterface nextDoubler;

    private String canDouble = "any";

    public void setNextDoubler(DoublerInterface nextDoubler) {
        this.nextDoubler = nextDoubler;
    }

    public void doubleIngredient(IngredientDTO ingredientDTO) {
        ingredientDTO.setQuantity(ingredientDTO.getQuantity()*2);
    }

    public boolean canDouble(String ingredientUnit){
        return true;
    }
}
