package recipe.DTOs;

import recipe.objects.IngredientsList;

public class CupDTO extends IngredientDTO {
    public CupDTO(IngredientsList ingredients){
        super(ingredients);
    }

    public IngredientDTO halveIngredient() {
        this.quantity=this.quantity/2;
        return this;
    }

    public IngredientDTO doubleIngredient() {
        this.quantity=this.quantity*2;
        return this;
    }
}
