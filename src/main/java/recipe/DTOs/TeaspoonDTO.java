package recipe.DTOs;

import recipe.objects.IngredientsList;

public class TeaspoonDTO extends IngredientDTO {

    public TeaspoonDTO(IngredientsList ingredients){
        super(ingredients);
    }


    public IngredientDTO halveIngredient() {
        return null;
    }


    public IngredientDTO doubleIngredient() {
        return null;
    }
}
