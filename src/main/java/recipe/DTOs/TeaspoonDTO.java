package recipe.DTOs;

import recipe.objects.IngredientsList;

public class TeaspoonDTO extends IngredientListDTO {

    public TeaspoonDTO(IngredientsList ingredients){
        super(ingredients);
    }


    public IngredientListDTO halveIngredient() {
        return null;
    }


    public IngredientListDTO doubleIngredient() {
        return null;
    }
}
