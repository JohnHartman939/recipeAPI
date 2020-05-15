package recipe.scaler.halvers;

import recipe.DTOs.IngredientDTO;

public class StandardHalver implements HalverInterface{

    private HalverInterface nextHalver;

    private String canHalve = "any";

    public void setNextHalver(HalverInterface nextHalver) {
        this.nextHalver=nextHalver;
    }

    public void halveIngredient(IngredientDTO ingredientDTO) {
        ingredientDTO.setQuantity(ingredientDTO.getQuantity()/2);
    }

    @Override
    public boolean canHalve(String ingredientUnit) {
        return true;
    }
}
