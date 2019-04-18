package recipe.Factories;

import recipe.DTOs.CupListDTO;
import recipe.DTOs.IngredientListDTO;
import recipe.DTOs.TablespoonListDTO;
import recipe.DTOs.TeaspoonDTO;
import recipe.objects.IngredientsList;

public class IngredientListDTOFactory {

    public IngredientListDTO makeIngredientListDTO(IngredientsList ingredientsList){
        if(ingredientsList.getUnit().getUnitName().equals("cup")){
            return new CupListDTO(ingredientsList);

        }

        if(ingredientsList.getUnit().getUnitName().equals("Tbsp")){
            return new TablespoonListDTO(ingredientsList);
        }

        if(ingredientsList.getUnit().getUnitName().equals("tsp")){
            return new TeaspoonDTO(ingredientsList);
        }
        return null;
    }
}