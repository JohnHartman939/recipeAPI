package recipe.DTOs;

import recipe.objects.IngredientsList;

public class CupListDTO extends IngredientListDTO {
    public CupListDTO(IngredientsList ingredients){
        super(ingredients);
    }

    public void halveIngredient() {
        this.quantity=this.quantity/2;
    }

    public void doubleIngredient() {
        this.quantity=this.quantity*2;
    }
}
