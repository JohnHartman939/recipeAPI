package recipe.Factories;

import recipe.DTOs.CupDTO;
import recipe.DTOs.IngredientDTO;
import recipe.DTOs.TablespoonDTO;
import recipe.objects.IngredientsList;
import recipe.objects.Unit;

public class IngredientDTOFactory {
    public IngredientDTO makeIngredientDTO(IngredientsList ingredient){
        //System.err.println(ingredient.getUnit());
        if(ingredient.getUnit().getUnitName().equals("cup")){
            return new CupDTO(ingredient);
        }
        if(ingredient.getUnit().getUnitName().equals("Tbsp")){
            return new TablespoonDTO(ingredient);
        }
        return null;
    }
}
