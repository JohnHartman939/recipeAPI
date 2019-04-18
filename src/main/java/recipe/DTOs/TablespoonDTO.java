package recipe.DTOs;

import recipe.objects.Ingredients;
import recipe.objects.IngredientsList;
import recipe.objects.Unit;

public class TablespoonDTO extends IngredientDTO {

    private IngredientsList ingredientsList=new IngredientsList();
    private Unit unit= new Unit();
    private Ingredients ingredients= new Ingredients();

    public TablespoonDTO(IngredientsList ingredients){
        super(ingredients);
    }

    public IngredientDTO halveIngredient() {
        if(super.quantity==1){
            ingredientsList.setQuantity((float)1.5);
            unit.setUnitName("tsp");
            ingredients.setIngredientName(super.ingredientName);
            ingredientsList.setUnit(unit);
            ingredientsList.setIngredients(ingredients);

            return new TeaspoonDTO(ingredientsList);
        }else {
            this.quantity = this.quantity / 2;
            return this;
        }
    }

    public IngredientDTO doubleIngredient() {
        this.quantity=this.quantity*2;
        return this;
    }
}
