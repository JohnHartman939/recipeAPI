package recipe.objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

public class IngredientsListKey implements Serializable {

    private int recipeId;
    private int ingredientId;
    private int unitId;

    public IngredientsListKey(){}


    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

//    @Override
//    public int hashCode() {
//        return 31;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//
//        if (!(obj instanceof IngredientsListKey))
//            return false;
//
//        IngredientsListKey other = (IngredientsListKey) obj;
//
//        return ingredientId==other.getIngredientId();
//    }
}