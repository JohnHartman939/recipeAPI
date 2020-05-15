package recipe.scaler.halvers;

import recipe.DTOs.IngredientDTO;

public class TablespoonHalver implements HalverInterface{

    private HalverInterface nextHalver;

    private String canHalve = "Tbsp";

    public void setNextHalver(HalverInterface nextHalver) {
        this.nextHalver = nextHalver;
    }

    public void halveIngredient(IngredientDTO ingredientDTO) {
        if (canHalve(ingredientDTO.getUnit())) {
            if (ingredientDTO.getQuantity() == 1) {
                ingredientDTO.setQuantity((float) 1.5);
                ingredientDTO.setUnit("tsp");
            } else ingredientDTO.setQuantity(ingredientDTO.getQuantity() / 2);
        } else {
            nextHalver.halveIngredient(ingredientDTO);
        }
    }

    public boolean canHalve(String ingredientUnit) {
        return canHalve.equals(ingredientUnit);
    }
}
