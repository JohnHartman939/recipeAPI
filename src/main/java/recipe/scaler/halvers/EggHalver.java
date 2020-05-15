package recipe.scaler.halvers;

import recipe.DTOs.IngredientDTO;

public class EggHalver implements HalverInterface {

    private HalverInterface nextHalver;

    private String canHalve = "Egg";

    public void setNextHalver(HalverInterface nextHalver) {
        this.nextHalver= nextHalver;
    }

    public void halveIngredient(IngredientDTO ingredientDTO) {
        if (canHalve(ingredientDTO.getIngredientName())) {
            if (ingredientDTO.getQuantity() >= 2) {
                ingredientDTO.setQuantity(Math.round(ingredientDTO.getQuantity()/2));
            }
        } else {
            nextHalver.halveIngredient(ingredientDTO);
        }
    }

    public boolean canHalve(String ingredientName) {
        return canHalve.equals(ingredientName);
    }
}
