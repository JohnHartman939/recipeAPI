package recipe.DTOs;

import java.time.LocalDateTime;
import java.util.List;

public interface RecipeDTOInterface {
    void setRecipeId(int recipeId);
    void setRecipeName(String recipeName);
    void setDateAdded(LocalDateTime dateAdded);
    void setIngredientList(List<IngredientDTO> ingredientList);
    void setStepList(List<StepDTO> steps);
}