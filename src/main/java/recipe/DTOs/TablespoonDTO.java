package recipe.DTOs;

import recipe.objects.IngredientsList;

public class TablespoonDTO extends IngredientDTO {

    public TablespoonDTO(IngredientsList ingredients){
        super(ingredients);
    }

    public void halveIngredient() {
        this.quantity=this.quantity/2;
    }

    public void doubleIngredient() {
        this.quantity=this.quantity*2;
    }
}
