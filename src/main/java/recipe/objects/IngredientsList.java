package recipe.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Entity
@Table(name = "recipe_ingredients_list")
@IdClass(IngredientsListKey.class)
public class IngredientsList implements Serializable{

    @Id
    @Column(name = "recipe_recipeid")
    private int recipeId;

    @Id
    @Column(name = "ingredient_ingredientid")
    private int ingredientId;

    @Id
    @Column(name = "unit_id")
    private int unitId;

    private float quantity;

    @Transient
    private Ingredients ingredients;

    @Transient
    private Unit unit;


    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

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

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }
}
