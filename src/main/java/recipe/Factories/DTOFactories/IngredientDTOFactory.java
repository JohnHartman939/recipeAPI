package recipe.Factories.DTOFactories;

import recipe.DTOs.IngredientDTO;
import recipe.scaler.doublers.StandardDoubler;
import recipe.scaler.doublers.TeaspoonDoubler;
import recipe.scaler.halvers.StandardHalver;
import recipe.scaler.halvers.TablespoonHalver;
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