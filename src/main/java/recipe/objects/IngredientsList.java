package recipe.objects;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "recipe_ingredients_list")
@IdClass(IngredientsListKey.class)
public class IngredientsList {

    @Id
    @Column(name = "recipe_recipeid")
    private int recipeId;

    @Id
    @Column(name = "ingredient_ingredientid")
    private int ingredientId;


    @ManyToOne
    @JoinColumn(name = "recipeid")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "ingredientid")
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
