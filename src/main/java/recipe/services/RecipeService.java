package recipe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipe.DTOs.RecipeDTO;
import recipe.objects.IngredientsList;
import recipe.objects.Recipe;
import recipe.repos.*;

import java.time.LocalDateTime;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepo recipeRepo;

    @Autowired
    private StepRepo stepRepo;

    @Autowired
    private IngredientsListRepo ingredientsListRepo;

    @Autowired
    private IngredientRepo ingredientRepo;

    @Autowired
    private UnitRepo unitRepo;

    public RecipeDTO getLatestRecipe() {
        RecipeDTO recipeDTO = new RecipeDTO(recipeRepo.findTopOneByOrderByDateAddedDesc());
        return recipeDTO;
    }

    public void addRecipe(Recipe recipe){
        recipe.setDateAdded(LocalDateTime.now());
        recipeRepo.save(recipe);
    }
}
