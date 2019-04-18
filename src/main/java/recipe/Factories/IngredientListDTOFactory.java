package recipe.Factories;

import recipe.DTOs.CupDTO;
import recipe.DTOs.IngredientDTO;
import recipe.DTOs.TablespoonDTO;
import recipe.DTOs.TeaspoonDTO;
import recipe.objects.IngredientsList;

public class IngredientListDTOFactory {

    public IngredientDTO makeIngredientListDTO(IngredientsList ingredientsList){
        if(ingredientsList.getUnit().getUnitName().equals("cup")){
            return new CupDTO(ingredientsList);

        }

        if(ingredientsList.getUnit().getUnitName().equals("Tbsp")){
            return new TablespoonDTO(ingredientsList);
        }

        if(ingredientsList.getUnit().getUnitName().equals("tsp")){
            return new TeaspoonDTO(ingredientsList);
        }
        return null;
    }
}