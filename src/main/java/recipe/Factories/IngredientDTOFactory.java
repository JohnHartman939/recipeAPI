package recipe.Factories;

import recipe.DTOs.IngredientDTO;
import recipe.doublers.StandardDoubler;
import recipe.doublers.TeaspoonDoubler;
import recipe.halvers.StandardHalver;
import recipe.halvers.TablespoonHalver;
import recipe.objects.IngredientsList;

public class IngredientDTOFactory {

    public IngredientDTO makeIngredientDTO(IngredientsList ingredientsList) {

        IngredientDTO newIngredient = new IngredientDTO(ingredientsList);
        if(newIngredient.getUnit().equals("Tbsp")){
            newIngredient.setHalver(new TablespoonHalver());
            System.err.println(newIngredient.getUnit());
        }else newIngredient.setHalver(new StandardHalver());

        if(newIngredient.getUnit().equals("tsp")){
            newIngredient.setDoubler(new TeaspoonDoubler());
        }else newIngredient.setDoubler(new StandardDoubler());
        return newIngredient;
    }
}