package recipe.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "recipe_ingredients_list")
@IdClass(IngredientsListKey.class)
public class IngredientsList implements Serializable{

    @Id
    @Column(name = "recipe_recipeid", insertable=false, updatable=false)
    private int recipeId;

    @Id
    @Column(name = "ingredient_ingredientid", insertable=false, updatable=false)
    private int ingredientId;


    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "recipe_recipeid")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "ingredient_ingredientid")
    private Ingredients ingredients;

    private float quantity;


    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
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
}
