package recipe.DTOs;

import recipe.objects.IngredientsList;

public class CupDTO extends IngredientDTO {
    public CupDTO(IngredientsList ingredients){
        super(ingredients);
    }

    public void halveIngredient() {
        this.quantity=this.quantity/2;
    }

    public void doubleIngredient() {
        this.quantity=this.quantity*2;
    }
}
