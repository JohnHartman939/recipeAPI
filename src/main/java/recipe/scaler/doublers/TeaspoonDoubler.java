package recipe.scaler.doublers;

import recipe.DTOs.IngredientDTO;

public class TeaspoonDoubler implements DoublerInterface {

    private DoublerInterface nextDoubler;

    private String canDouble = "tsp";

    public void setNextDoubler(DoublerInterface nextDoubler) {
        this.nextDoubler=nextDoubler;
    }

    public void doubleIngredient(IngredientDTO ingredientDTO) {
        if(canDouble(ingredientDTO.getUnit())) {
            if (ingredientDTO.getQuantity() == 1.5) {
                ingredientDTO.setQuantity(1);
                ingredientDTO.setUnit("Tbsp");
            } else ingredientDTO.setQuantity(ingredientDTO.getQuantity() * 2);
        }
        else nextDoubler.doubleIngredient(ingredientDTO);
    }

    public boolean canDouble(String ingredientUnit) {
        return canDouble.equals(ingredientUnit);
    }


}
