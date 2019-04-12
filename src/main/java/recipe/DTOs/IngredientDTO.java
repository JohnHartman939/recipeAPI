package recipe.DTOs;

import recipe.objects.IngredientsList;
import recipe.objects.Unit;

import java.util.List;

public abstract class IngredientDTO {
    public IngredientDTO(IngredientsList ingredients){
//        this.setIngredientId(ingredients.getIngredientId());
//        this.setUnitId(ingredients.getUnitId());
        this.setQuantity(ingredients.getQuantity());
        this.setUnit(ingredients.getUnit());
        this.setIngredientName(ingredients.getIngredients().getIngredientName());
    }

//    protected int ingredientId;
//    protected int unitId;
    protected float quantity;
    protected Unit unit;
    protected String ingredientName;

    public abstract void halveIngredient();
    public abstract void doubleIngredient();

//    public int getIngredientId() {
//        return ingredientId;
//    }
//
//    public void setIngredientId(int ingredientId) {
//        this.ingredientId = ingredientId;
//    }
//
//    public int getUnitId() {
//        return unitId;
//    }
//
//    public void setUnitId(int unitId) {
//        this.unitId = unitId;
//    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}
