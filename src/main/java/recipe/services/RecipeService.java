package recipe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recipe.DTOs.RecipeDTO;
import recipe.Factories.IngredientListDTOFactory;
import recipe.Factories.RecipeDTOFactory;
import recipe.Factories.StepDTOFactory;
import recipe.objects.IngredientsList;
import recipe.objects.Recipe;
import recipe.objects.Steps;
import recipe.repos.*;

import java.time.LocalDateTime;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepo recipeRepo;

    public RecipeDTO getLatestRecipe() {
        Recipe recipe= recipeRepo.findTopOneByOrderByDateAddedDesc();
        RecipeDTOFactory recipeDTOFactory = new RecipeDTOFactory();
        IngredientListDTOFactory ingredientListDTOFactory =new IngredientListDTOFactory();
        StepDTOFactory stepDTOFactory=new StepDTOFactory();
        RecipeDTO recipeDTO=recipeDTOFactory.makeRecipeDTO(recipe);

        for(IngredientsList ingredientsList:recipe.getIngredientsList()){

            recipeDTO.getIngredientList().add(ingredientListDTOFactory.makeIngredientListDTO(ingredientsList));
        }

        for(Steps step:recipe.getStepsList()){
            recipeDTO.getStepList().add(stepDTOFactory.makeStepDTO(step));
        }
        return recipeDTO;
    }

    public void addRecipe(Recipe recipe){
        recipe.setDateAdded(LocalDateTime.now());
        recipeRepo.save(recipe);
    }
}
