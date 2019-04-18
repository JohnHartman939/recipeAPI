package recipe.DTOs;

import recipe.objects.IngredientsList;

public class CupListDTO extends IngredientListDTO {
    public CupListDTO(IngredientsList ingredients){
        super(ingredients);
    }

    public IngredientListDTO halveIngredient() {
        this.quantity=this.quantity/2;
        return this;
    }

    public IngredientListDTO doubleIngredient() {
        this.quantity=this.quantity*2;
        return this;
    }
}
