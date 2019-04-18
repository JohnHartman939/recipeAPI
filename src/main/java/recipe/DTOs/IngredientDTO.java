package recipe.DTOs;

import recipe.objects.IngredientsList;

public abstract class IngredientDTO {
    public IngredientDTO(IngredientsList ingredients){
        this.setQuantity(ingredients.getQuantity());
        this.setUnit(ingredients.getUnit().getUnitName());
        this.setIngredientName(ingredients.getIngredients().getIngredientName());
    }

    protected float quantity;
    protected String unit;
    protected String ingredientName;

    public abstract IngredientDTO halveIngredient();
    public abstract IngredientDTO doubleIngredient();

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}