package recipe.scaler;

import recipe.DTOs.IngredientDTO;
import recipe.DTOs.RecipeDTO;
import recipe.scaler.doublers.DoublerInterface;
import recipe.scaler.doublers.StandardDoubler;
import recipe.scaler.doublers.TeaspoonDoubler;
import recipe.scaler.halvers.EggHalver;
import recipe.scaler.halvers.HalverInterface;
import recipe.scaler.halvers.StandardHalver;
import recipe.scaler.halvers.TablespoonHalver;

public class RecipeScaler {
    private DoublerInterface teaspoonDoubler = new TeaspoonDoubler();
    private DoublerInterface standardDoubler = new StandardDoubler();

    private HalverInterface eggHalver = new EggHalver();
    private HalverInterface tablespoonHalver = new TablespoonHalver();
    private HalverInterface standardHalver = new StandardHalver();

    public RecipeScaler(){
        teaspoonDoubler.setNextDoubler(standardDoubler);
        eggHalver.setNextHalver(tablespoonHalver);
        tablespoonHalver.setNextHalver(standardHalver);
    }

    public RecipeDTO halfRecipe(RecipeDTO recipeDTO){
        for(IngredientDTO ingredientDTO: recipeDTO.getIngredientList()){
            eggHalver.halveIngredient(ingredientDTO);
        }
        return recipeDTO;
    }

    public RecipeDTO doubleRecipe(RecipeDTO recipeDTO){
        for(IngredientDTO ingredientDTO: recipeDTO.getIngredientList()){
            teaspoonDoubler.doubleIngredient(ingredientDTO);
        }
        return recipeDTO;
    }
}
